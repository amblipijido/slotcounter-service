package com.dgv.slotcounter.controller;

import com.dgv.slotcounter.model.drivers.RaceDriverDTO;
import com.dgv.slotcounter.model.drivers.RaceDriverSimpleDTO;
import com.dgv.slotcounter.model.drivers.TeamDTO;
import com.dgv.slotcounter.model.drivers.TeamSimpleDTO;
import com.dgv.slotcounter.service.RaceDriverService;
import com.dgv.slotcounter.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/drivers-management")
public class DriversController {
    @Autowired
    private TeamService teamService;
    @Autowired
    private RaceDriverService raceDriverService;

    @GetMapping("/team/all")
    public List<TeamSimpleDTO> getAllTeams() {
        return teamService.findAllTeams();
    }

    @GetMapping("/team/{id}")
    public TeamDTO findTeamById(@PathVariable Long id) {
        return Optional.ofNullable(teamService.findById(id))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Team Not Found"));
    }

    @PostMapping("/team/add")
    public TeamSimpleDTO addNewTeam(@Valid  @RequestBody TeamSimpleDTO teamSimpleDTO) {
        return teamService.addOrUpdateTeam(teamSimpleDTO);
    }

    @PutMapping("/team/update")
    public TeamSimpleDTO updateTeam(@Valid @RequestBody TeamSimpleDTO teamSimpleDTO) {
        return teamService.addOrUpdateTeam(teamSimpleDTO);
    }

    @DeleteMapping("/team/{id}/delete")
    public void deleteTeam(@PathVariable Long id) {
        try {
            teamService.deleteTeamById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @GetMapping("/driver/all")
    public List<RaceDriverSimpleDTO> getAllDrivers() {
        return raceDriverService.findAllRaceDrivers();
    }

    @GetMapping("/driver/{id}")
    public RaceDriverDTO findDriverById(@PathVariable Long id) {
        return Optional.ofNullable(raceDriverService.findById(id))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Driver Not Found"));
    }

    @DeleteMapping("/driver/{id}/delete")
    public void deleteRaceDriver(@PathVariable Long id) {
        try {
            raceDriverService.deleteRaceDriver(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }

    }

    @PostMapping("/team/{teamId}/driver/add")
    public RaceDriverSimpleDTO addNewDriver(@PathVariable Long teamId, @Valid @RequestBody RaceDriverSimpleDTO raceDriverSimpleDTO) {
        return raceDriverService.addOrUpdateRaceDriver(raceDriverSimpleDTO, teamId);
    }

    @PutMapping("/team/{teamId}/driver/update")
    public RaceDriverSimpleDTO updateDrive(@PathVariable Long teamId, @Valid @RequestBody RaceDriverSimpleDTO raceDriverSimpleDTO) {
        return raceDriverService.addOrUpdateRaceDriver(raceDriverSimpleDTO, teamId);
    }
}
