package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.District;
import com.model.User;
import com.model.Zone;
import com.service.DistrictService;
import com.service.UserService;
import com.service.ZoneService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private DistrictService districtService;

	@Autowired
	private ZoneService zoneService;

	@RequestMapping(value ="/addUser", method = RequestMethod.GET)
	public ModelAndView addUser(){
		ModelAndView mv = new ModelAndView("user/addUser");

		List<District> district = districtService.findAll();
		List<Zone> zone = zoneService.findAll();
		User user = new User();
		mv.addObject("user", user);
		mv.addObject("district", district);
		mv.addObject("zone", zone);
		return mv;
	}
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user")User user, BindingResult bindingResult, HttpServletRequest req){

		Integer districtId = Integer.parseInt(req.getParameter("district.districtId"));
		District district = districtService.findByDistrictId(districtId);
		user.setDistrict(district);

		Integer zoneId = Integer.parseInt(req.getParameter("zone.zoneId"));
		Zone zone = zoneService.findByZoneId(zoneId);
		user.setZone(zone);

		userService.saveOrUpdate(user);
		return "include/index";
	}
	
	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public ModelAndView userList() {
		ModelAndView mv = new ModelAndView("user/userList");
		List<User> user = new ArrayList<User>();
		user = userService.findAll();
		mv.addObject("userList", user);
		return mv;
	}
}
