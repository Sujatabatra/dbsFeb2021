package com.sujata.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sujata.bean.User;

@Repository
public class UserDaoImpl implements UserDao {

	private static HashMap<Integer,User> userList=new HashMap<>();
	static {
		userList.put(101, new User(101,"AAAAA"));
		userList.put(102, new User(102,"BBBBB"));
		userList.put(103, new User(103,"CCCCC"));
		userList.put(104, new User(104,"DDDDD"));
	}
	@Override
	public User getRecordById(int id) {
		return userList.get(id);
	}
	
	public Collection<User> getAllRecords(){
		return userList.values();
	}

	@Override
	public User addRecord(User user) {
		userList.put(user.getuId(), user);
		return user;
	}

	@Override
	public User deleteRecord(int id) {
		User user=userList.remove(id);
		return user;
	}

	@Override
	public User modifyNameById(int id, String name) {
		User user=userList.get(id);
		user.setuName(name);
		userList.put(id, user);
		return user;
	}

}
