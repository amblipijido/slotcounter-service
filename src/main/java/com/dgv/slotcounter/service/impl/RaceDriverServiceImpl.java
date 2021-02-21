package com.dgv.slotcounter.service.impl;

import com.dgv.slotcounter.entity.RaceDriver;
import com.dgv.slotcounter.entity.Team;
import com.dgv.slotcounter.mapper.RaceDriverMapper;
import com.dgv.slotcounter.model.drivers.RaceDriverDTO;
import com.dgv.slotcounter.model.drivers.RaceDriverSimpleDTO;
import com.dgv.slotcounter.repository.RaceDriverRepository;
import com.dgv.slotcounter.service.RaceDriverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceDriverServiceImpl implements RaceDriverService {

    private final RaceDriverRepository repository;
    private final RaceDriverMapper mapper;

    public RaceDriverServiceImpl(RaceDriverRepository repository, RaceDriverMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public RaceDriverSimpleDTO addOrUpdateRaceDriver(RaceDriverSimpleDTO raceCarGroup, Long teamId) {
        Team team = new Team();
        team.setId(teamId);
        RaceDriver raceDriver = mapper.fromSimpleModelToEntity(raceCarGroup);
        raceDriver.setTeam(team);
        return mapper.fromEntityToSimpleModel(repository.save(raceDriver));
    }

    @Override
    public List<RaceDriverSimpleDTO> findAllRaceDrivers() {
        return mapper.fromEntityListToSimpleModelList(repository.findAll());
    }

    @Override
    public RaceDriverDTO findById(Long id) {
        RaceDriver raceDriver = repository.findById(id).orElse(null);
        return mapper.fromEntityToModel(raceDriver);
    }
}
