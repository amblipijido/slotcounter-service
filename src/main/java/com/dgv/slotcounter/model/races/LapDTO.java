package com.dgv.slotcounter.model.races;

import com.dgv.slotcounter.model.cars.RaceCarDTO;
import com.dgv.slotcounter.model.drivers.RaceDriverDTO;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
