package com.dgv.slotcounter.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RaceDriverDTO {

    private Long id;
    private String name;
    private String surname;
    private String alias;
    private LocalDate birthday;
    private TeamSimpleDTO team;
}
