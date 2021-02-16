package com.dgv.slotcounter.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class RaceDriver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    @Column(unique = true)
    private String alias;
    private LocalDate birthday;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

}
