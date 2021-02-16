package com.dgv.slotcounter.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LapDTO {

    private Long id;
    private Integer lineNumber;
    private RaceSimpleDTO race;
    private RaceDriverDTO raceDriver;
    private RaceCarDTO raceCar;
    private Long lapTime;
    private Integer number;
    private LocalDateTime lapDate;
}
