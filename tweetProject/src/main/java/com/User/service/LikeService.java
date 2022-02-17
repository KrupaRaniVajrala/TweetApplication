package com.User.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.Entity.LikeEntity;
import com.User.repository.LikeRepository;

@Service
public class LikeService {

	@Autowired
	LikeRepository repository;
	
	public List<LikeEntity> findAllLikes() 
	{
		return repository.findAll();
	}

	public LikeEntity saveLike(LikeEntity like)
	{
		return repository.save(like);
	}
	
}
