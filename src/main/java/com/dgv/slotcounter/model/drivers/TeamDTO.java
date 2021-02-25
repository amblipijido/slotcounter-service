package com.dgv.slotcounter.model.drivers;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamDTO {

    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
    private List<RaceDriverSimpleDTO> raceDrivers;
}
