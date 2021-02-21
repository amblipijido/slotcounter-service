package com.dgv.slotcounter.mapper;

import com.dgv.slotcounter.entity.RaceDriver;
import com.dgv.slotcounter.model.drivers.RaceDriverDTO;
import com.dgv.slotcounter.model.drivers.RaceDriverSimpleDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RaceDriverMapper {
    RaceDriverSimpleDTO fromEntityToSimpleModel(RaceDriver entity);
    RaceDriver fromSimpleModelToEntity(RaceDriverSimpleDTO model);
    RaceDriverDTO fromEntityToModel(RaceDriver entity);
    RaceDriver fromModelToEntity(RaceDriverDTO model);
    List<RaceDriverSimpleDTO> fromEntityListToSimpleModelList(List<RaceDriver> raceCarList);
}
