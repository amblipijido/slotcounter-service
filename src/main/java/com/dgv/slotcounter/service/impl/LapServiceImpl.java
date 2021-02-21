package com.dgv.slotcounter.service.impl;

import com.dgv.slotcounter.mapper.LapMapper;
import com.dgv.slotcounter.model.races.LapDTO;
import com.dgv.slotcounter.repository.LapRepository;
import com.dgv.slotcounter.service.LapService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LapServiceImpl implements LapService {

    private final LapRepository lapRepository;
    private final LapMapper lapMapper;

    public LapServiceImpl(LapRepository lapRepository, LapMapper lapMapper) {
        this.lapRepository = lapRepository;
        this.lapMapper = lapMapper;
    }

    @Override
    public List<LapDTO> findBestLapsBySpeedWay(Long speedWayId, Integer amountOfLaps) {
        Pageable pageable = PageRequest.of(0, amountOfLaps);
        return lapMapper.fromEntityListToModelList(lapRepository.findByRace_SpeedWay_IdOrderByLapTimeAsc(speedWayId, pageable));
    }
}
