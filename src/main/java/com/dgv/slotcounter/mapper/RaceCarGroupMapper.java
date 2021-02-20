package com.dgv.slotcounter.mapper;

import com.dgv.slotcounter.entity.RaceCarGroup;
import com.dgv.slotcounter.model.cars.RaceCarGroupDTO;
import com.dgv.slotcounter.model.cars.RaceCarGroupSimpleDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RaceCarGroupMapper {
    RaceCarGroupSimpleDTO fromEntityToSimpleModel(RaceCarGroup entity);
    RaceCarGroup fromSimpleModelToEntity(RaceCarGroupSimpleDTO model);
    RaceCarGroupDTO fromEntityToModel(RaceCarGroup entity);
    RaceCarGroup fromModelToEntity(RaceCarGroupDTO model);
    List<RaceCarGroupSimpleDTO> fromEntityListToSimpleModelList(List<RaceCarGroup> raceCarGroupList);
}
