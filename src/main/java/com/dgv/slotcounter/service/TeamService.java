package com.dgv.slotcounter.service;

import com.dgv.slotcounter.model.drivers.TeamDTO;
import com.dgv.slotcounter.model.drivers.TeamSimpleDTO;

import java.util.List;

public interface TeamService {

    TeamSimpleDTO addOrUpdateTeam(TeamSimpleDTO teamSimpleDTO);
    List<TeamSimpleDTO> findAllTeams();
    TeamDTO findById(Long id);
    void deleteTeamById(Long id);
}
