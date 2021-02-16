package com.dgv.slotcounter.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class RaceCar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private String model;
    private String ref;
    private Float fuelConsumption;
    private Float fuelRemaining;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private RaceCarGroup raceCarGroup;

}
