package com.project.Service;

import com.project.Entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Dao.UserDao;

@Service
public class UserServiceImpl implements UserService{

	@Autowired(required=true)
	private UserDao userDao;
	@Override
	public int registerUser(User user) {
		int i = userDao.save(user);
		return i;
	}

}
