package com.service;

import com.model.District;

public interface DistrictService extends GenericService<District, Integer> {
	
	District findByDistrictId(Integer districtId);
	District findByDistrictName(String districtName);

}
