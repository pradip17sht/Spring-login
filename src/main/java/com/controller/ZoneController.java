package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Zone;
import com.service.ZoneService;

@Controller
public class ZoneController {

	@Autowired
	private ZoneService zoneService;
	
	@RequestMapping(value = "/addZone", method = RequestMethod.GET)
	public ModelAndView addZone(){
		ModelAndView mv = new ModelAndView("zone/addZone");
		Zone zone = new Zone();
		mv.addObject("zone", zone);
		return mv;
	}
	
	@RequestMapping(value = "/addZone", method = RequestMethod.POST)
	public String addZone(@ModelAttribute("zone")Zone zone, BindingResult bindingResult) {
		zoneService.saveOrUpdate(zone);
		return "include/index";
		
	}
}
