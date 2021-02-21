package com.dgv.slotcounter.service.impl;

import com.dgv.slotcounter.entity.SpeedWay;
import com.dgv.slotcounter.mapper.SpeedWayMapper;
import com.dgv.slotcounter.model.drivers.RaceDriverDTO;
import com.dgv.slotcounter.model.races.LapDTO;
import com.dgv.slotcounter.model.races.SpeedWayDTO;
import com.dgv.slotcounter.repository.SpeedWayRepository;
import com.dgv.slotcounter.service.LapService;
import com.dgv.slotcounter.service.SpeedWayService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeedWayServiceImpl implements SpeedWayService {
    private final SpeedWayRepository speedWayRepository;
    private final LapService lapService;
    private final SpeedWayMapper speedWayMapper;

    public SpeedWayServiceImpl(SpeedWayRepository speedWayRepository, LapService lapService, SpeedWayMapper speedWayMapper) {
        this.speedWayRepository = speedWayRepository;
        this.lapService = lapService;
        this.speedWayMapper = speedWayMapper;
    }

    @Override
    public SpeedWayDTO addOrUpdateSpeedWay(SpeedWayDTO speedWayDTO) {
        SpeedWay speedWay = speedWayMapper.fromModelToEntity(speedWayDTO);
        return speedWayMapper.fromEntityToModel(speedWayRepository.save(speedWay));
    }

    @Override
    public List<SpeedWayDTO> findAllSpeedWays() {
        return speedWayMapper.fromEntityListToSimpleModelList(speedWayRepository.findAll());
    }

    @Override
    public SpeedWayDTO findSpeedWayById(Long id) {
        SpeedWay speedWay = speedWayRepository.findById(id).orElse(null);
        return speedWayMapper.fromEntityToModel(speedWay);
    }

    @Override
    public void deleteSpeedWayById(Long id) {
        speedWayRepository.deleteById(id);
    }

    @Override
    public List<LapDTO> findFastestSpeedWayLaps(Long id, Integer amount) {
        return lapService.findBestLapsBySpeedWay(id, amount);
    }
}
