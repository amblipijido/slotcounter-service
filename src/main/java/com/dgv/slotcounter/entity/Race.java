package com.dgv.slotcounter.entity;

import com.dgv.slotcounter.model.races.RaceType;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany
    @JoinTable(name = "race_r_drivers",joinColumns = { @JoinColumn(name = "race_id") },
            inverseJoinColumns = { @JoinColumn(name = "race_driver_id")})
    private List<RaceDriver> raceDrivers;
    @ManyToMany
    @JoinTable(name = "race_r_cars",joinColumns = { @JoinColumn(name = "race_id") },
            inverseJoinColumns = { @JoinColumn(name = "race_car_id")})
    private List<RaceCar> raceCars;
    private Integer lapsToFinish;
    private Long timeToFinish;
    @OneToMany(mappedBy = "race")
    private List<Lap> laps;
    @ManyToOne
    @JoinColumn(name = "speed_way_id")
    private SpeedWay speedWay;
    private LocalDateTime raceDate;
    @OneToMany(mappedBy = "race")
    private List<RaceResult> raceResult;
    @Enumerated(EnumType.STRING)
    private RaceType raceType;
}
