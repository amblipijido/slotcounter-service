package com.dgv.slotcounter.model;

import lombok.Data;

import java.util.List;

@Data
public class TeamDTO {

    private Long id;
    private String name;
    private String description;
    private List<RaceDriverDTO> raceDrivers;
}
