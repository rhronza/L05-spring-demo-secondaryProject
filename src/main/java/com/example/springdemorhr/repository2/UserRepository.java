package com.example.springdemorhr.repository2;

import org.springframework.stereotype.Service;

import com.example.springdemorhr.interfaces.UserServiceInterface;

@Service
public class UserRepository implements UserServiceInterface{
	
	public String parrotString(String string) {
		return string + ", "+string;
	}

}
