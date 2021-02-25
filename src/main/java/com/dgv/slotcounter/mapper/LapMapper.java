package com.dgv.slotcounter.mapper;

import com.dgv.slotcounter.entity.Lap;
import com.dgv.slotcounter.model.races.LapDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LapMapper {
    LapDTO fromModelToEntity(Lap lap);
    List<LapDTO> fromEntityListToModelList(List<Lap> laps);
}
