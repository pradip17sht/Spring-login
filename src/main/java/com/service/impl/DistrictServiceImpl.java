package com.service.impl;

import org.springframework.stereotype.Service;

import com.model.District;
import com.repository.DistrictRepository;
import com.service.DistrictService;

@Service
public class DistrictServiceImpl extends GenericServiceImpl<District, Integer> implements DistrictService {

	private DistrictRepository districtRepository;
	public DistrictServiceImpl(DistrictRepository districtRepository) {
		super(districtRepository);
		this.districtRepository = districtRepository;
	}
	

	public District findByDistrictId(Integer districtId) {
		return districtRepository.findByDistrictId(districtId);
	}
	
	public District findByDistrictName(String districtName) {
		return districtRepository.findByDistrictName(districtName);
	}
}
