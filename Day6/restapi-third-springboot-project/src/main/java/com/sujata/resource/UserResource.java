package com.sujata.resource;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.User;
import com.sujata.service.UserService;

@RestController
public class UserResource {

	@Autowired
	private UserService userService;
	
	@GetMapping(path = "/users/{id}",produces = "application/json")
	public User searchUserById(@PathVariable("id")int id) {
		return userService.getUserById(id);
	}
	
	@GetMapping(path = "/xml/users/{id}",produces = "application/xml")
	public User searchUserByIdXmlResponse(@PathVariable("id")int id) {
		return userService.getUserById(id);
	}
	
	@GetMapping(path="/users",produces = "application/json")
	public Collection<User> getAllUserDetails() {
		return userService.getAllUsers();
	}
	
	@PostMapping(path ="/users",produces = "application/json",consumes = "application/json")
	public User insertUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@DeleteMapping(path = "/users/{id}",produces  = "application/json")
	public User deleteUser(@PathVariable("id")int id) {
		return userService.deleteUser(id);
	}
	
	@PutMapping(path = "/users/{id}/{name}",produces = "application/json")
	public User modifyUserName(@PathVariable("id")int id,@PathVariable("name")String name) {
		return userService.modifyUserNameById(id, name);
	}
}
