package com.dgv.slotcounter.service.impl;

import com.dgv.slotcounter.entity.RaceCar;
import com.dgv.slotcounter.entity.RaceCarGroup;
import com.dgv.slotcounter.mapper.RaceCarMapper;
import com.dgv.slotcounter.model.cars.RaceCarDTO;
import com.dgv.slotcounter.model.cars.RaceCarSimpleDTO;
import com.dgv.slotcounter.repository.RaceCarRepository;
import com.dgv.slotcounter.service.RaceCarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceCarServiceImpl implements RaceCarService {

    private final RaceCarRepository raceCarRepository;
    private final RaceCarMapper raceCarMapper;

    public RaceCarServiceImpl(RaceCarRepository raceCarRepository, RaceCarMapper raceCarMapper) {
        this.raceCarRepository = raceCarRepository;
        this.raceCarMapper = raceCarMapper;
    }

    @Override
    public RaceCarSimpleDTO addOrUpdateRaceCar(RaceCarSimpleDTO raceCar, Long groupId) {
        RaceCarGroup raceCarGroup = new RaceCarGroup();
        raceCarGroup.setId(groupId);
        RaceCar newRaceCar = raceCarMapper.fromSimpleModelToEntity(raceCar);
        newRaceCar.setRaceCarGroup(raceCarGroup);
        return raceCarMapper.fromEntityToSimpleModel(raceCarRepository.save(newRaceCar));
    }

    @Override
    public List<RaceCarSimpleDTO> findAllRaceCars() {
        return raceCarMapper.fromEntityListToSimpleModelList(raceCarRepository.findAll());
    }

    @Override
    public RaceCarDTO findById(Long id) {
        RaceCar raceCar = raceCarRepository.findById(id).orElse(null);
        return raceCarMapper.fromEntityToModel(raceCar);
    }
}
