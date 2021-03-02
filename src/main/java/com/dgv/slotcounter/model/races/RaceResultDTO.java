package com.dgv.slotcounter.model.races;

import com.dgv.slotcounter.entity.RaceCar;
import com.dgv.slotcounter.entity.RaceDriver;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RaceResultDTO {
    private Long id;
    private RaceCar raceCar;
    private RaceDriver raceDriver;
    private Integer position;
    private Long totalTime;
}
