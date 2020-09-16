package com.service;

import java.util.List;

import com.model.User;

public interface UserService extends GenericService<User, Integer> {
	
	User findByUserId(Integer userId);
	User findByUserName(String userName);
	List<User> findAll();

}
