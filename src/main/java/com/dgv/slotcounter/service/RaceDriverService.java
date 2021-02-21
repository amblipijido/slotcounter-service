package com.dgv.slotcounter.service;

import com.dgv.slotcounter.model.drivers.RaceDriverDTO;
import com.dgv.slotcounter.model.drivers.RaceDriverSimpleDTO;

import java.util.List;

public interface RaceDriverService {

    RaceDriverSimpleDTO addOrUpdateRaceDriver(RaceDriverSimpleDTO raceCarGroup, Long teamId);
    List<RaceDriverSimpleDTO> findAllRaceDrivers();
    RaceDriverDTO findById(Long id);
    void deleteRaceDriver(Long driverId);
}
