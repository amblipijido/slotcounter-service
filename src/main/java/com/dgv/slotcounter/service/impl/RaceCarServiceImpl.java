package com.dgv.slotcounter.service.impl;

import com.dgv.slotcounter.entity.RaceCarGroup;
import com.dgv.slotcounter.mapper.RaceCarGroupMapper;
import com.dgv.slotcounter.model.RaceCarGroupSimpleDTO;
import com.dgv.slotcounter.repository.RaceCarGroupRepository;
import com.dgv.slotcounter.service.RaceCarService;
import org.springframework.stereotype.Service;

@Service
public class RaceCarServiceImpl implements RaceCarService {

    private final RaceCarGroupRepository raceCarGroupRepository;
    private final RaceCarGroupMapper raceCarGroupMapper;

    public RaceCarServiceImpl(RaceCarGroupRepository raceCarGroupRepository, RaceCarGroupMapper raceCarGroupMapper) {
        this.raceCarGroupRepository = raceCarGroupRepository;
        this.raceCarGroupMapper = raceCarGroupMapper;
    }

    @Override
    public RaceCarGroupSimpleDTO addRaceCarGroup(RaceCarGroupSimpleDTO raceCarGroup) {
        RaceCarGroup newRaceCarGroup = raceCarGroupMapper.fromSimpleModelToEntity(raceCarGroup);
        return raceCarGroupMapper.fromEntityToSimpleModel(raceCarGroupRepository.save(newRaceCarGroup));
    }
}
