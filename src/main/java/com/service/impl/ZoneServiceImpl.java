package com.service.impl;

import org.springframework.stereotype.Service;

import com.model.Zone;
import com.repository.ZoneRepository;
import com.service.ZoneService;

@Service
public class ZoneServiceImpl extends GenericServiceImpl<Zone, Integer> implements ZoneService {
	
	private ZoneRepository zoneRepository;
	public ZoneServiceImpl (ZoneRepository zoneRepository) {
		super(zoneRepository);
		this.zoneRepository = zoneRepository;
	}
	
	public Zone findByZoneId(Integer zoneId) {
		return zoneRepository.findByZoneId(zoneId);
	}
	
	public Zone findByZoneName(String zoneName) {
		return zoneRepository.findByZoneName(zoneName);
	}
}
