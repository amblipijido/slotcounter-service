package com.dgv.slotcounter.model.races;

import com.dgv.slotcounter.model.cars.RaceCarDTO;
import com.dgv.slotcounter.model.drivers.RaceDriverDTO;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LapDTO {

    private Long id;
    @Positive
    @NotNull
    private Integer lineNumber;
    @NotNull
    private RaceSimpleDTO race;
    @NotNull
    private RaceDriverDTO raceDriver;
    @NotNull
    private RaceCarDTO raceCar;
    @Positive
    @NotNull
    private Long lapTime;
    @Positive
    @NotNull
    private Integer number;
}
