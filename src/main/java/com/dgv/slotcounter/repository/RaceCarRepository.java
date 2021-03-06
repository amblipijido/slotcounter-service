package com.dgv.slotcounter.repository;

import com.dgv.slotcounter.entity.RaceCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceCarRepository extends JpaRepository<RaceCar, Long> {
}
