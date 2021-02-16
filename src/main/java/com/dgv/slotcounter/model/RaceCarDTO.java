package com.dgv.slotcounter.model;

import lombok.Data;

@Data
public class RaceCarDTO {

    private Long id;
    private String brand;
    private String model;
    private String ref;
    private Float fuelConsumption;
    private Float fuelRemaining;
    private RaceCarGroupSimpleDTO raceCarGroup;
}
