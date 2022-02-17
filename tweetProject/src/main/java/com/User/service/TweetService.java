package com.User.service; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.User.Entity.TweetEntity;
import com.User.repository.TweetRepository;

@Service
public class TweetService {

	@Autowired
	TweetRepository repository;
	
	public List<TweetEntity> findAllTweets(){
		return repository.findAll();
	}
	
	public TweetEntity saveTweet(TweetEntity tweet)
	{
		return repository.save(tweet);
	}
	
	public TweetEntity updateTweet(TweetEntity tweet)
	{
		return repository.save(tweet);
	}
	
	public String deleteTweet(int id)
	{
		return "deleted";
	}

	public List<TweetEntity> getAllTweetsOfUser(String tweetedBy) {
		return repository.getAllTweetsOfuser(tweetedBy);
	}
	
	
}
