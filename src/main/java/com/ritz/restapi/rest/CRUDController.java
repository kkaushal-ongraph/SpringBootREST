package com.ritz.restapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ritz.restapi.jpa.UserRepository;
import com.ritz.restapi.model.User;

@RestController
public class CRUDController {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/get/{userId}", method=RequestMethod.GET)
	public User getAll(@PathVariable Long userId){
		return userRepository.findOne(userId);
	}

	@RequestMapping(value="/get", method=RequestMethod.GET)
	public Iterable<User> getAll(){
		return userRepository.findAll();
	}
	
	@RequestMapping(value={"/create", "/update"}, method=RequestMethod.POST)
	public User create(@RequestBody User user){
		return userRepository.save(user);
	}

	@RequestMapping(value="/delete/{userId}", method=RequestMethod.GET)
	public void delete(@PathVariable Long userId){
		userRepository.delete(userId);
	}
}