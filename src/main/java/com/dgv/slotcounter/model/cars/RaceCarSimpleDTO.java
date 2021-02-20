package com.dgv.slotcounter.model.cars;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RaceCarSimpleDTO {

    private Long id;
    private String brand;
    private String model;
    private String ref;
    private Float fuelConsumption;
    private Float fuelRemaining;
}
