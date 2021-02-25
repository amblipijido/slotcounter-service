package com.dgv.slotcounter.model.cars;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RaceCarDTO {

    private Long id;
    @NotEmpty
    private String brand;
    @NotEmpty
    private String model;
    @NotEmpty
    private String ref;
    @Positive
    @Max(value = 50)
    private Float fuelConsumption;
    @Positive
    @Max(value = 100)
    private Float fuelRemaining;
    private RaceCarGroupSimpleDTO raceCarGroup;
}
