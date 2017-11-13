package cz.expertkom.ju.springdemo.repository;

import org.springframework.stereotype.Repository;

import cz.expertkom.ju.springdemo.entity.User;
import cz.expertkom.ju.springdemo.interfaces.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	//@Override
	public User getUser(String username) {
		User user = new User();
		user.setFirstname("Lary");
		user.setLastname("Allison");
		user.setUsername(username);
		return user;
	}

}
