package com.User.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.User.Entity.LikeEntity;
import com.User.service.LikeService;

@RestController
@RequestMapping("api/v1.0/tweets")
public class LikeController {
	
	@Autowired
	LikeService service;
	
	@GetMapping("likes")
	public List<LikeEntity> findAllLikes()
	{
		return service.findAllLikes();
	}
	
	@PostMapping("addLike")
	public LikeEntity postLike(@RequestBody LikeEntity like)
	{
	return service.saveLike(like);	
	}
	
	@PutMapping("{login_id}/like/{tweetId}")
	public LikeEntity postLike(@RequestBody LikeEntity like,@PathVariable String login_id,@PathVariable LikeEntity tweetId)
	{
	return service.saveLike(like);	
	}
			
}                                                                           
