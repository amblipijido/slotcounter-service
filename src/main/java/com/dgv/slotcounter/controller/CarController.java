package com.dgv.slotcounter.controller;

import com.dgv.slotcounter.model.cars.RaceCarDTO;
import com.dgv.slotcounter.model.cars.RaceCarGroupDTO;
import com.dgv.slotcounter.model.cars.RaceCarGroupSimpleDTO;
import com.dgv.slotcounter.model.cars.RaceCarSimpleDTO;
import com.dgv.slotcounter.service.RaceCarGroupService;
import com.dgv.slotcounter.service.RaceCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private RaceCarGroupService raceCarGroupService;
    @Autowired
    private RaceCarService raceCarService;

    @PostMapping
    public RaceCarSimpleDTO addNewRaceCar(@RequestBody RaceCarSimpleDTO newRaceCar, @RequestParam Long groupId) {
        return raceCarService.addOrUpdateRaceCar(newRaceCar, groupId);
    }

    @PutMapping
    public RaceCarSimpleDTO updateRaceCar(@RequestBody RaceCarSimpleDTO newRaceCar, @RequestParam Long groupId) {
        return raceCarService.addOrUpdateRaceCar(newRaceCar, groupId);
    }

    @GetMapping("/{id}")
    public RaceCarDTO findCarById(@PathVariable Long id) {
        return Optional.ofNullable(raceCarService.findById(id))
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Foo Not Found"));
    }

    @GetMapping("/all")
    public List<RaceCarSimpleDTO> findAllCars() {
        return raceCarService.findAllRaceCars();
    }

    @PostMapping("/group")
    public RaceCarGroupSimpleDTO addNewRaceCarGroup(@RequestBody RaceCarGroupSimpleDTO newRaceCarGroup) {
        return raceCarGroupService.addOrUpdateRaceCarGroup(newRaceCarGroup);
    }

    @PutMapping("/group")
    public RaceCarGroupSimpleDTO updateRaceCarGroup(@RequestBody RaceCarGroupSimpleDTO newRaceCarGroup) {
        return raceCarGroupService.addOrUpdateRaceCarGroup(newRaceCarGroup);
    }

    @GetMapping("/group/{id}")
    public RaceCarGroupDTO findRaceCarGroupById(@PathVariable Long id) {
        return Optional.ofNullable(raceCarGroupService.findById(id))
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Foo Not Found"));
    }

    @GetMapping("/group/all")
    public List<RaceCarGroupSimpleDTO> findAllRaceCarGroups() {
        return raceCarGroupService.findAllRaceCarGroups();
    }
}
