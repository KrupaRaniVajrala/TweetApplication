package com.User.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.Entity.ReplyEntity;
import com.User.repository.ReplyRepository;

@Service
public class ReplyService {

	@Autowired
	ReplyRepository repository;
	
	public List<ReplyEntity> findAllReplies()
	{
		return repository.findAll();
	}
	
	public ReplyEntity saveReply(ReplyEntity reply)
	{
		return repository.save(reply);
	}	
	
}
