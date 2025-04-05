package com.example.dao;
import java.util.List;

import com.example.model.User;



	public interface UserDao{
		List<User> getUsers();
		void addUser(User user);
	}

