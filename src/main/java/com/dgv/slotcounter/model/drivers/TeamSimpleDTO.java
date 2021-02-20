package com.dgv.slotcounter.model.drivers;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamSimpleDTO {

    private Long id;
    private String name;
    private String description;
}
