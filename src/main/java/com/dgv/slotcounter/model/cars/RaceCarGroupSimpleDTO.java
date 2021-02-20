package com.dgv.slotcounter.model.cars;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RaceCarGroupSimpleDTO {

    private Long id;
    private String name;
    private String description;
}
