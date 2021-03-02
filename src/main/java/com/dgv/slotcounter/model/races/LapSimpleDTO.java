package com.dgv.slotcounter.model.races;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LapSimpleDTO {
    @Positive
    @NotNull
    private Integer lineNumber;
    @Positive
    @NotNull
    private Long lapTime;
}
