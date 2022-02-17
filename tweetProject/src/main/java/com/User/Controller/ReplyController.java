package com.User.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.User.Entity.ReplyEntity;
import com.User.service.ReplyService;

@RestController
@RequestMapping("api/v1.0/tweets")
public class ReplyController {
	
	@Autowired
	ReplyService service;
	
	@GetMapping("replies")
	public List<ReplyEntity> findAllReplies()
	{
		return service.findAllReplies();
	}
	
	@PostMapping("{login_id}/reply/{tweetId}")
	public ReplyEntity postReply(@RequestBody ReplyEntity reply,@PathVariable String login_id, @PathVariable int tweetId)
	{
		return service.saveReply(reply);
	}
}
