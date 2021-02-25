package com.dgv.slotcounter.service;

import com.dgv.slotcounter.model.races.LapDTO;
import com.dgv.slotcounter.model.races.SpeedWayDTO;

import java.util.List;

public interface SpeedWayService {
    SpeedWayDTO addOrUpdateSpeedWay(SpeedWayDTO speedWayDTO);
    List<SpeedWayDTO> findAllSpeedWays();
    SpeedWayDTO findSpeedWayById(Long id);
    void deleteSpeedWayById(Long id);
    List<LapDTO> findFastestSpeedWayLaps(Long id, Integer amount);
}
