package com.dgv.slotcounter.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Lap {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer lineNumber;
    @ManyToOne
    @JoinColumn(name = "race_id")
    private Race race;
    @ManyToOne
    @JoinColumn(name = "race_driver_id")
    private RaceDriver raceDriver;
    @ManyToOne
    @JoinColumn(name = "race_car_id")
    private RaceCar raceCar;
    private Long lapTime;
    private Integer number;
    private LocalDateTime lapDate;
}
