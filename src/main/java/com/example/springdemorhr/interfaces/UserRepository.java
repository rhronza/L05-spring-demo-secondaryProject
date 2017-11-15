package com.example.springdemorhr.interfaces;

import com.example.springdemorhr.entity.User;

public interface UserRepository {

	User getUser(String username);
	
}
