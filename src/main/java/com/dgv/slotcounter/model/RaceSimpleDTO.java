package com.dgv.slotcounter.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RaceSimpleDTO {

    private Long id;
    private Integer lapsToFinish;
    private Long timeToFinish;
    private SpeedWayDTO speedWay;
    private LocalDateTime raceDate;
}
