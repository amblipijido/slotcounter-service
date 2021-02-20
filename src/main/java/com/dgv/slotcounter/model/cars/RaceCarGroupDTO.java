package com.dgv.slotcounter.model.cars;

import com.dgv.slotcounter.model.cars.RaceCarDTO;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RaceCarGroupDTO {

    private Long id;
    private String name;
    private String description;
    private List<RaceCarSimpleDTO> raceCars;
}
