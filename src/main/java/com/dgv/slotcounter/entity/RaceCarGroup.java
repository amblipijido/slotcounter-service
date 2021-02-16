package com.dgv.slotcounter.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class RaceCarGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "raceCarGroup")
    private List<RaceCar> raceCars;
}
