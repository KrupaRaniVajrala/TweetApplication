package com.User.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.User.Entity.ReplyEntity;
import com.User.Entity.UserEntity;

@Repository
public interface ReplyRepository extends JpaRepository<ReplyEntity, Integer> {
	
	@Query("Select R from ReplyEntity R where R.login_id=?1 and R.tweetId=?2")
	Optional<UserEntity> postReply(String login_id, int tweetId);
}
