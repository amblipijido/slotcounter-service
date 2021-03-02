package com.dgv.slotcounter.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class RaceResult {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "race_id")
    private Race race;
    @ManyToOne
    @JoinColumn(name = "race_car_id")
    private RaceCar raceCar;
    @ManyToOne
    @JoinColumn(name = "race_driver_id")
    private RaceDriver raceDriver;
    private Integer position;
    private Long totalTime;
}
