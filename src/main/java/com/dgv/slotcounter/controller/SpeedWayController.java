package com.dgv.slotcounter.controller;

import com.dgv.slotcounter.model.races.LapDTO;
import com.dgv.slotcounter.model.races.SpeedWayDTO;
import com.dgv.slotcounter.service.SpeedWayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/speed-way-management")
public class SpeedWayController {
    @Autowired
    private SpeedWayService speedWayService;

    @GetMapping("/speed-way/all")
    public List<SpeedWayDTO> getAllSpeedWays() {
        return speedWayService.findAllSpeedWays();
    }

    @GetMapping("/speed-way/{id}/")
    public SpeedWayDTO findSpeedWayById(@PathVariable Long id) {
        return Optional.ofNullable(speedWayService.findSpeedWayById(id))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Speed Way Not Found"));
    }

    @PostMapping("/speed-way/add")
    public SpeedWayDTO addSpeedWay(@RequestBody SpeedWayDTO speedWayDTO) {
        return speedWayService.addOrUpdateSpeedWay(speedWayDTO);
    }

    @PutMapping("/speed-way/update")
    public SpeedWayDTO updateSpeedWay(@RequestBody SpeedWayDTO speedWayDTO) {
        return speedWayService.addOrUpdateSpeedWay(speedWayDTO);
    }

    @DeleteMapping("/speed-way/{id}/delete")
    public void deleteSpeedWay(@PathVariable Long id) {
        try {
            speedWayService.deleteSpeedWayById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @GetMapping("/speed-way/{id}/laps/fastest")
    public List<LapDTO> findFastestLaps(@PathVariable Long id, @RequestParam Integer amount) {
        return speedWayService.findFastestSpeedWayLaps(id, amount);
    }
}
