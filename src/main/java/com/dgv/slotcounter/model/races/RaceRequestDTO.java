package com.dgv.slotcounter.model.races;

import java.time.LocalDateTime;

public class RaceRequestDTO {
    private LocalDateTime raceDate;
    private Long speedWayId;
    private RaceType raceType;
    private Integer duration;
    private RaceDurationType raceDurationType;
    private String participants;
}
