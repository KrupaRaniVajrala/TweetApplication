package com.User.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.Entity.UserEntity;
import com.User.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	
	public List<UserEntity> findAllUsers()
	{
		return repo.findAll();
	}
	
	public UserEntity findUserByName(String name)
	{
		Optional<UserEntity> user = repo.findByFirstName(name);
		if (user.isPresent())
			return user.get();

		else
			return null;
	}
	
	public UserEntity findUserById(String id)
	{
		Optional<UserEntity> user = repo.findBylogin_id(id);
		if (user.isPresent())
			return user.get();

		else
			return null;
		
	}
	
	public UserEntity findUserByLoginId(String login_id,String password)
	{
		Optional<UserEntity> user= repo.findByIdAndPass(login_id,password);
		if (user.isPresent())
			return user.get();

		else
			return null;
		
//		if(password.equals(user.getPassword())) {
//			return true;
//		}
//		return false;
//		
	}
	public UserEntity saveUser(UserEntity user)
	{
		try {
			return repo.save(user);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return new UserEntity();
	}
	
	public String deleteUser(String login_id)
	{
		return "deleted";
	}
}
