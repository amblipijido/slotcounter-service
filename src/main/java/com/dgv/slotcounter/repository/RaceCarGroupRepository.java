package com.dgv.slotcounter.repository;

import com.dgv.slotcounter.entity.RaceCarGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceCarGroupRepository extends JpaRepository<RaceCarGroup, Long> {
}
