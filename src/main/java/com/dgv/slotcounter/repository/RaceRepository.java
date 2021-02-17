package com.dgv.slotcounter.repository;


import com.dgv.slotcounter.entity.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RaceRepository extends JpaRepository<Race, Long> {
    List<Race> findBySpeedWayId(Long id);
}
