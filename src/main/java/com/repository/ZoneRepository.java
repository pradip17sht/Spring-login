package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Zone;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Integer> {
	
	Zone findByZoneId(Integer zoneId);
	Zone findByZoneName(String zoneName);
}
