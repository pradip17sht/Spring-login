package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.District;
import com.service.DistrictService;

@Controller
public class DistrictController {
	
	@Autowired
	private DistrictService districtService;
	
	@RequestMapping(value="/addDistrict", method = RequestMethod.GET)
	public ModelAndView addDistrict(){
		ModelAndView mv = new ModelAndView("district/addDistrict");
		District district = new District();
		mv.addObject("district", district);
		return mv;	
	}
	@RequestMapping(value = "/addDistrict", method = RequestMethod.POST)
	public String addDistrict(@ModelAttribute("district")District district, BindingResult bindingResult) {
		districtService.saveOrUpdate(district);
		return "include/index";
	}

}
