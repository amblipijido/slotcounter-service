package com.dgv.slotcounter.service;

import com.dgv.slotcounter.model.races.LapDTO;

import java.util.List;

public interface LapService {
    List<LapDTO> findBestLapsBySpeedWay(Long speedWayId, Integer amountOfLaps);
}
