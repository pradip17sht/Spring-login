package com.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
@RequestMapping(value = "/rest")
public class UserRestController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = { RequestMethod.GET }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<User>> UserGetAll(){
		System.out.println("gggggg");
		List<User> userList = userService.findAll();
		
		ResponseEntity<List<User>> resp = new ResponseEntity<List<User>>(userList, HttpStatus.OK);
		return resp;
	}

}
