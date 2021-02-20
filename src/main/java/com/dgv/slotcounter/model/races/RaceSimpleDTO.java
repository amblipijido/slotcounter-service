package com.dgv.slotcounter.model.races;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RaceSimpleDTO {

    private Long id;
    private Integer lapsToFinish;
    private Long timeToFinish;
    private SpeedWayDTO speedWay;
    private LocalDateTime raceDate;
}
