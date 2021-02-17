package com.dgv.slotcounter.repository;

import com.dgv.slotcounter.entity.Lap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LapRepository extends JpaRepository<Lap, Long> {
}
