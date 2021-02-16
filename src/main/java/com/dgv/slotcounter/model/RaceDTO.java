package com.dgv.slotcounter.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class RaceDTO {

    private Long id;
    private List<RaceDriverDTO> raceDrivers;
    private List<RaceCarDTO> raceCars;
    private Integer lapsToFinish;
    private Long timeToFinish;
    private List<LapDTO> laps;
    private SpeedWayDTO speedWay;
    private LocalDateTime raceDate;
}
