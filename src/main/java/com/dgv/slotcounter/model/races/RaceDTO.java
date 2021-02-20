package com.dgv.slotcounter.model.races;

import com.dgv.slotcounter.model.cars.RaceCarDTO;
import com.dgv.slotcounter.model.drivers.RaceDriverDTO;
import lombok.*;

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
    private SpeedWayDTO speedWay;
    private LocalDateTime raceDate;
}
