package com.sujata.dao;

import java.util.Collection;
import java.util.List;

import com.sujata.bean.User;

public interface UserDao {
	
	public User getRecordById(int id);

	public Collection<User> getAllRecords();
	
	public User addRecord(User user);
	
	public User deleteRecord(int id);
	
	public User modifyNameById(int id,String name);
}
