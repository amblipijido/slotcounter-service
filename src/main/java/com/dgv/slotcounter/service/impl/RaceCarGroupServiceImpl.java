package com.dgv.slotcounter.service.impl;

import com.dgv.slotcounter.entity.RaceCarGroup;
import com.dgv.slotcounter.mapper.RaceCarGroupMapper;
import com.dgv.slotcounter.model.cars.RaceCarGroupDTO;
import com.dgv.slotcounter.model.cars.RaceCarGroupSimpleDTO;
import com.dgv.slotcounter.repository.RaceCarGroupRepository;
import com.dgv.slotcounter.service.RaceCarGroupService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceCarGroupServiceImpl implements RaceCarGroupService {

    private final RaceCarGroupRepository raceCarGroupRepository;
    private final RaceCarGroupMapper raceCarGroupMapper;

    public RaceCarGroupServiceImpl(RaceCarGroupRepository raceCarGroupRepository, RaceCarGroupMapper raceCarGroupMapper) {
        this.raceCarGroupRepository = raceCarGroupRepository;
        this.raceCarGroupMapper = raceCarGroupMapper;
    }

    @Override
    public RaceCarGroupSimpleDTO addOrUpdateRaceCarGroup(RaceCarGroupSimpleDTO raceCarGroup) {
        RaceCarGroup newRaceCarGroup = raceCarGroupMapper.fromSimpleModelToEntity(raceCarGroup);
        return raceCarGroupMapper.fromEntityToSimpleModel(raceCarGroupRepository.save(newRaceCarGroup));
    }

    @Override
    public List<RaceCarGroupSimpleDTO> findAllRaceCarGroups() {
        return raceCarGroupMapper.fromEntityListToSimpleModelList(raceCarGroupRepository.findAll());
    }

    @Override
    public RaceCarGroupDTO findById(Long id) {
        RaceCarGroup raceCarGroup = raceCarGroupRepository.findById(id).orElse(null);
        return raceCarGroupMapper.fromEntityToModel(raceCarGroup);
    }

    @Override
    public void deleteGroupById(Long id) {
        raceCarGroupRepository.deleteById(id);
    }
}
