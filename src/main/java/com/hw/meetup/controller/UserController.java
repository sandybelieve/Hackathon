package com.hw.meetup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hw.meetup.server.service.iface.UserIFace;

@RestController
@RequestMapping(value="/meetup")
public class UserController {

	
@Autowired
private UserIFace userIFace;

	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String registerUser(@RequestBody String userJson)
	{
		
		return userIFace.addUser(userJson);
		
	}//registerUser
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test(@RequestBody String userJson)
	{
		
		return "WELCOME";
		
	}//registerUser
	
}//UserController
