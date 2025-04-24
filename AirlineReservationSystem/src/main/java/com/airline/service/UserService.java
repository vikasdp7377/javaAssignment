package com.airline.service;

import java.util.Optional;

import com.airline.dao.UserDao;
import com.airline.entity.User;

public class UserService {
	private UserDao userDao;

	public UserService() {
		userDao = new UserDao();
	}

	public boolean register(String name, String email, String pass) {
		boolean status = false;
		Optional<User> foundUser = userDao.findAll().stream().filter(user -> user.getEmail().equalsIgnoreCase(email))
				.findFirst();

		if (foundUser.isPresent()) {
			throw new ResourceAlreadyExistException("User Already Register with same email!!");
		}

		boolean isSaved = userDao.save(new User(0, name, email, pass));
		if (isSaved) {
			System.out.println("User Registered Successfully");
			status = true;
		} else {
			System.out.println("Failed to register user!!");
		}
		return status;
	}
	
	public User login(String email, String password)
	{
	 return userDao.searchUserByEmailAndPassword(email, password);

}
}
