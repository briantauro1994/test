package com.brian.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.brian.app.dto.UserDto;
import com.brian.app.services.UserService;

@Controller
@RequestMapping("/login")
public class UserController {
	@Autowired
	UserService userService;
	@ResponseBody
@RequestMapping(value="/save",method=RequestMethod.GET)
	public void saveuser()
{
	userService.saveUser((new UserDto("brian","tauro")));
}
}
