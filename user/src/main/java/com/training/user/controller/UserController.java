package com.training.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.user.model.ResponseDto;
import com.training.user.model.User;
import com.training.user.service.UserService;


@RestController
@RequestMapping("api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public User addUser(@RequestBody User user) {
		return userService.registerUser(user);
	}
	
	@GetMapping("/show/users")
	public List<User> getallusers(){
		return userService.getusers();
	}
	
	@GetMapping("/show/users/{id}")
	public User getUsersById(@PathVariable int id) {
		return userService.getUsersById(id);
	}
	
	@PutMapping("/update/user")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/delete/user/{id}")
	public String deleteUserById(@PathVariable int id) {
		return userService.deleteSUerById(id);
	}
	
	@GetMapping("/getLabourersByLocation/{id}")
    public ResponseDto  getLabourers(@PathVariable int id){
       // ResponseDto responseDto =
        	return	userService.getLabourersById(id);
       // return ResponseEntity.ok(responseDto);
    }
}

