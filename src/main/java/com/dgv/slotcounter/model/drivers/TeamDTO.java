package com.dgv.slotcounter.model.drivers;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamDTO {

    private Long id;
    private String name;
    private String description;
    private List<RaceDriverDTO> raceDrivers;
}
