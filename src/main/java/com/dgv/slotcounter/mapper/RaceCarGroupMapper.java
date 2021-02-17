package com.dgv.slotcounter.mapper;

import com.dgv.slotcounter.entity.RaceCarGroup;
import com.dgv.slotcounter.model.RaceCarGroupDTO;
import com.dgv.slotcounter.model.RaceCarGroupSimpleDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RaceCarGroupMapper {
    RaceCarGroupSimpleDTO fromEntityToSimpleModel(RaceCarGroup entity);
    RaceCarGroup fromSimpleModelToEntity(RaceCarGroupSimpleDTO model);
    RaceCarGroupDTO fromEntityToModel(RaceCarGroup entity);
    RaceCarGroup fromModelToEntity(RaceCarGroupDTO model);
}
