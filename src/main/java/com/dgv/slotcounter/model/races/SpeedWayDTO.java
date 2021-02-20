package com.dgv.slotcounter.model.races;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SpeedWayDTO {

    private Long id;
    private Integer numberOfLines;
    private String name;
    private String description;
    private Float length;
}
