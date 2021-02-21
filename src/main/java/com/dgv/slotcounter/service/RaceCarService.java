package com.dgv.slotcounter.service;

import com.dgv.slotcounter.model.cars.RaceCarDTO;
import com.dgv.slotcounter.model.cars.RaceCarSimpleDTO;

import java.util.List;

public interface RaceCarService {

    RaceCarSimpleDTO addOrUpdateRaceCar(RaceCarSimpleDTO raceCarGroup, Long groupId);
    List<RaceCarSimpleDTO> findAllRaceCars();
    RaceCarDTO findById(Long id);
    void deleteCarById(Long id);
}
