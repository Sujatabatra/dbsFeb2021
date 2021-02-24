package com.sujata.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.User;
import com.sujata.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUserById(int id) {
		return userDao.getRecordById(id);
	}

	@Override
	public Collection<User> getAllUsers() {
		return userDao.getAllRecords();
	}

	@Override
	public User saveUser(User user) {
		return userDao.addRecord(user);
	}

	@Override
	public User deleteUser(int id) {
		return userDao.deleteRecord(id);
	}

	@Override
	public User modifyUserNameById(int id, String name) {
		
		return userDao.modifyNameById(id, name);
	}

}
