package com.dgv.slotcounter.repository;

import com.dgv.slotcounter.entity.Lap;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LapRepository extends JpaRepository<Lap, Long> {
    List<Lap> findByRace_SpeedWay_IdOrderByLapTimeAsc(Long id, Pageable pageable);
}
