package com.dgv.slotcounter.repository;

import com.dgv.slotcounter.entity.SpeedWay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeedWayRepository extends JpaRepository<SpeedWay, Long> {
}
