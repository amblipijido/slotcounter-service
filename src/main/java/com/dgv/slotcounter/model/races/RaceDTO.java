package com.dgv.slotcounter.model.races;

import com.dgv.slotcounter.model.cars.RaceCarDTO;
import com.dgv.slotcounter.model.drivers.RaceDriverDTO;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RaceDTO {

    private Long id;
    private List<RaceDriverDTO> raceDrivers;
    private List<RaceCarDTO> raceCars;
    private Integer lapsToFinish;
    private Long timeToFinish;
    private List<LapDTO> laps;
    @NotNull
    private SpeedWayDTO speedWay;
    @NotNull
    private LocalDateTime raceDate;
    private RaceType raceType;
}
