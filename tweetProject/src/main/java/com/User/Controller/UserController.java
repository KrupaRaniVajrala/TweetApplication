package com.User.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.User.Entity.UserEntity;
import com.User.service.UserService;

@RestController
@RequestMapping("api/v1.0/tweets")
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("users/all")
	public List<UserEntity> findAllUsers(){
		return service.findAllUsers();
	}
	
	@GetMapping("user/search/{firstName}")
	public UserEntity findUserByName(@PathVariable String firstName)
	{
		return service.findUserByName(firstName);
	}
	
	@GetMapping("user/{login_id}")
	public UserEntity findUserById(@PathVariable String login_id)
	{
		return service.findUserById(login_id);
	}
	
	@PostMapping("register")
	public ResponseEntity<?> registerUser(@RequestBody UserEntity user)
	{
		UserEntity userId=service.findUserById(user.getLogin_id());	
		
		if(userId!=null) 
		{
			return ResponseEntity.badRequest().body("Already exist");
		}
		else 
		{
		return new ResponseEntity<UserEntity>(service.saveUser(user),HttpStatus.OK);
		}
	}
	
	@PostMapping("login")
	public ResponseEntity<?> verifyLogin(@RequestBody Map<String, String> user)
	{
		String login_id=user.get("login_id").toString();
        String password=user.get("password").toString();
				
		if(service.findUserByLoginId(login_id,password)!=null)
		{
			return new ResponseEntity<UserEntity>(service.findUserById(login_id),HttpStatus.OK);
		}
		else
		{
			return ResponseEntity.badRequest().body("Invalid Credentials");
		}
			
	}
	
	@DeleteMapping("delete/{login_id}")
	public String deleteUser(@PathVariable String login_id)
	{
		return "deleted";
	}
}
