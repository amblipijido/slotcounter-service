package com.dgv.slotcounter.repository;

import com.dgv.slotcounter.entity.RaceDriver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceDriverRepository extends JpaRepository<RaceDriver, Long> {
}
