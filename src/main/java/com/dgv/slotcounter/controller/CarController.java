package com.dgv.slotcounter.controller;

import com.dgv.slotcounter.model.cars.RaceCarDTO;
import com.dgv.slotcounter.model.cars.RaceCarGroupDTO;
import com.dgv.slotcounter.model.cars.RaceCarGroupSimpleDTO;
import com.dgv.slotcounter.model.cars.RaceCarSimpleDTO;
import com.dgv.slotcounter.service.RaceCarGroupService;
import com.dgv.slotcounter.service.RaceCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars-management")
public class CarController {
    @Autowired
    private RaceCarGroupService raceCarGroupService;
    @Autowired
    private RaceCarService raceCarService;

    @PostMapping("/group/{groupId}/car/add")
    public RaceCarSimpleDTO addNewRaceCar(@Valid @RequestBody RaceCarSimpleDTO newRaceCar, @PathVariable Long groupId) {
        return raceCarService.addOrUpdateRaceCar(newRaceCar, groupId);
    }

    @PutMapping("/group/{groupId}/car/update")
    public RaceCarSimpleDTO updateRaceCar(@Valid @RequestBody RaceCarSimpleDTO newRaceCar, @PathVariable Long groupId) {
        return raceCarService.addOrUpdateRaceCar(newRaceCar, groupId);
    }

    @GetMapping("/car/{id}")
    public RaceCarDTO findCarById(@PathVariable Long id) {
        return Optional.ofNullable(raceCarService.findById(id))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Car Not Found"));
    }

    @DeleteMapping("/car/{id}/delete")
    public void deleteCarById(@PathVariable Long id) {
        try {
            raceCarService.deleteCarById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @GetMapping("/car/all")
    public List<RaceCarSimpleDTO> findAllCars() {
        return raceCarService.findAllRaceCars();
    }

    @PostMapping("/group/add")
    public RaceCarGroupSimpleDTO addNewRaceCarGroup(@Valid @RequestBody RaceCarGroupSimpleDTO newRaceCarGroup) {
        return raceCarGroupService.addOrUpdateRaceCarGroup(newRaceCarGroup);
    }

    @PutMapping("/group/update")
    public RaceCarGroupSimpleDTO updateRaceCarGroup(@Valid @RequestBody RaceCarGroupSimpleDTO newRaceCarGroup) {
        return raceCarGroupService.addOrUpdateRaceCarGroup(newRaceCarGroup);
    }

    @DeleteMapping("/group/{id}/delete")
    public void deleteGroupById(@PathVariable Long id) {
        try {
            raceCarGroupService.deleteGroupById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @GetMapping("/group/{id}")
    public RaceCarGroupDTO findRaceCarGroupById(@PathVariable Long id) {
        return Optional.ofNullable(raceCarGroupService.findById(id))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Group Not Found"));
    }

    @GetMapping("/group/all")
    public List<RaceCarGroupSimpleDTO> findAllRaceCarGroups() {
        return raceCarGroupService.findAllRaceCarGroups();
    }
}
