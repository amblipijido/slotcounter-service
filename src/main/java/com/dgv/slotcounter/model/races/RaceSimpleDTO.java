package com.dgv.slotcounter.model.races;

import lombok.*;

import javax.validation.constraints.NotNull;
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
    @NotNull
    private SpeedWayDTO speedWay;
    @NotNull
    private LocalDateTime raceDate;
}
