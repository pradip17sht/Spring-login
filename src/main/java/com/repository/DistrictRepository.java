package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {
	
	District findByDistrictId(Integer districtId);
	District findByDistrictName(String districtName);

}
