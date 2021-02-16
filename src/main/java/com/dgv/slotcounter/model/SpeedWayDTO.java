package com.dgv.slotcounter.model;

import lombok.Data;

@Data
public class SpeedWayDTO {

    private Long id;
    private Integer numberOfLines;
    private String name;
    private String description;
    private Float length;
}
