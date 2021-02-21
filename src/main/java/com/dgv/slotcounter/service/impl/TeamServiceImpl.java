package com.dgv.slotcounter.service.impl;

import com.dgv.slotcounter.entity.Team;
import com.dgv.slotcounter.mapper.TeamMapper;
import com.dgv.slotcounter.model.drivers.TeamDTO;
import com.dgv.slotcounter.model.drivers.TeamSimpleDTO;
import com.dgv.slotcounter.repository.TeamRepository;
import com.dgv.slotcounter.service.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;
    private final TeamMapper teamMapper;

    public TeamServiceImpl(TeamRepository teamRepository, TeamMapper teamMapper) {
        this.teamRepository = teamRepository;
        this.teamMapper = teamMapper;
    }

    @Override
    public TeamSimpleDTO addOrUpdateTeam(TeamSimpleDTO teamSimpleDTO) {
        Team team = teamMapper.fromSimpleModelToEntity(teamSimpleDTO);
        return teamMapper.fromEntityToSimpleModel(teamRepository.save(team));
    }

    @Override
    public List<TeamSimpleDTO> findAllTeams() {
        return teamMapper.fromEntityListToSimpleModelList(teamRepository.findAll());
    }

    @Override
    public TeamDTO findById(Long id) {
        Team team = teamRepository.findById(id).orElse(null);
        return teamMapper.fromEntityToModel(team);
    }
}
