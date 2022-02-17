package com.User.Controller;

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

import com.User.Entity.TweetEntity;
import com.User.service.TweetService;

@RestController
@RequestMapping("api/v1.0/tweets")
public class TweetController {

	@Autowired
	TweetService service;
	
	@GetMapping("all")
	public List<TweetEntity> findAllTweets()
	{
		return service.findAllTweets();	
	}
	
	@GetMapping("{tweetedBy}")
	public List<TweetEntity> getAllTweetsOfUser(@PathVariable String tweetedBy)
	{
		return service.getAllTweetsOfUser(tweetedBy);	
	}
	
	@PostMapping("{tweetedBy}/add")
	public TweetEntity postTweet(@PathVariable String tweetedBy,@RequestBody TweetEntity tweet)
	{
		return service.saveTweet(tweet);
	}
	
	@PutMapping("{tweetedBy}/update/{tweetId}")
	public TweetEntity updateTweet(@PathVariable String tweetedBy, @PathVariable String tweetId, @RequestBody TweetEntity tweet)
	{
		return service.updateTweet(tweet);
	}
	
	@DeleteMapping("{tweetedBy}/delete/{tweetId}")
	public String deleteTweet(@PathVariable String tweetedBy,@PathVariable int tweetId) 
	{
		return "deleted";
	}
}
