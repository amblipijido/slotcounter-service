package com.dgv.slotcounter.model.races;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SpeedWayDTO {

    private Long id;
    @Positive
    @NotNull
    private Integer numberOfLines;
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
    @Positive
    @NotNull
    private Float length;
}
