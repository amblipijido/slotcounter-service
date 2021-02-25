package com.dgv.slotcounter.model.cars;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RaceCarGroupSimpleDTO {

    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
}
