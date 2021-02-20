package com.dgv.slotcounter.service;

import com.dgv.slotcounter.model.cars.RaceCarGroupDTO;
import com.dgv.slotcounter.model.cars.RaceCarGroupSimpleDTO;

import java.util.List;

public interface RaceCarGroupService {

    RaceCarGroupSimpleDTO addOrUpdateRaceCarGroup(RaceCarGroupSimpleDTO raceCarGroup);
    List<RaceCarGroupSimpleDTO> findAllRaceCarGroups();
    RaceCarGroupDTO findById(Long id);

}
