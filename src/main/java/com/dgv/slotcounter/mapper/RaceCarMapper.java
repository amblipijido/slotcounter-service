package com.dgv.slotcounter.mapper;

import com.dgv.slotcounter.entity.RaceCar;
import com.dgv.slotcounter.entity.RaceCarGroup;
import com.dgv.slotcounter.model.cars.RaceCarDTO;
import com.dgv.slotcounter.model.cars.RaceCarGroupDTO;
import com.dgv.slotcounter.model.cars.RaceCarGroupSimpleDTO;
import com.dgv.slotcounter.model.cars.RaceCarSimpleDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RaceCarMapper {
    RaceCarSimpleDTO fromEntityToSimpleModel(RaceCar entity);
    RaceCar fromSimpleModelToEntity(RaceCarSimpleDTO model);
    RaceCarDTO fromEntityToModel(RaceCar entity);
    RaceCar fromModelToEntity(RaceCarDTO model);
    List<RaceCarSimpleDTO> fromEntityListToSimpleModelList(List<RaceCar> raceCarList);
}
