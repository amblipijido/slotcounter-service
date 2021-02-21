package com.dgv.slotcounter.model.drivers;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamSimpleDTO {

    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
}
