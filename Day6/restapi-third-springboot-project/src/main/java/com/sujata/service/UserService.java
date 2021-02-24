package com.sujata.service;

import java.util.Collection;
import java.util.List;

import com.sujata.bean.User;

public interface UserService {
	public User getUserById(int id);
	public Collection<User> getAllUsers();
	public User saveUser(User user);
	public User deleteUser(int id);
	public User modifyUserNameById(int id,String name);

}
