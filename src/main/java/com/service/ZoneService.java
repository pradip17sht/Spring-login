package com.service;

import com.model.Zone;

public interface ZoneService extends GenericService<Zone, Integer> {
	
	Zone findByZoneId(Integer zoneId);
	Zone findByZoneName(String zoneName);
}
