package com.example.controller;


import com.example.dao.UserDao;
import com.example.model.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
 
@Controller
public class UserController {
@Autowired
	private final UserDao userDao;
	
	public UserController(UserDao userDao) {
		this.userDao = userDao;
	}
@GetMapping("/")
	public String index(Model model) {
		List<User> users = userDao.getUsers();
		model.addAttribute("users", users);
		return "home";
	}
	
	@PostMapping("/add")
	public String addUser(@RequestParam String name) {
		userDao.addUser(new User(0, name));
		return "redirect:/";
	}
}
 
 