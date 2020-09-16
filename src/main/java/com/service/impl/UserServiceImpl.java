package com.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;
import com.service.UserService;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService {
	
	private UserRepository userRepository;
	public UserServiceImpl (UserRepository userRepository){
		super(userRepository);
		this.userRepository = userRepository;
	}
	
	public User findByUserId(Integer userId){
		return userRepository.findByUserId(userId);
	}

	public User findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}
}
