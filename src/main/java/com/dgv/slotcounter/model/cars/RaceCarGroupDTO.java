package com.dgv.slotcounter.model.cars;

import com.dgv.slotcounter.model.cars.RaceCarDTO;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RaceCarGroupDTO {

    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
    private List<RaceCarSimpleDTO> raceCars;
}
