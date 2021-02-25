package com.dgv.slotcounter.mapper;

import com.dgv.slotcounter.entity.SpeedWay;
import com.dgv.slotcounter.model.races.SpeedWayDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SpeedWayMapper {
    SpeedWayDTO fromEntityToModel(SpeedWay entity);
    SpeedWay fromModelToEntity(SpeedWayDTO model);
    List<SpeedWayDTO> fromEntityListToSimpleModelList(List<SpeedWay> teamList);
}
