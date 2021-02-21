package com.dgv.slotcounter.mapper;

import com.dgv.slotcounter.entity.Team;
import com.dgv.slotcounter.model.drivers.TeamDTO;
import com.dgv.slotcounter.model.drivers.TeamSimpleDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeamMapper {
    TeamSimpleDTO fromEntityToSimpleModel(Team entity);
    Team fromSimpleModelToEntity(TeamSimpleDTO model);
    TeamDTO fromEntityToModel(Team entity);
    Team fromModelToEntity(TeamDTO model);
    List<TeamSimpleDTO> fromEntityListToSimpleModelList(List<Team> teamList);
}
