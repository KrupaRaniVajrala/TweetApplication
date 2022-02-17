package com.User.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.User.Entity.TweetEntity;

@Repository
public interface TweetRepository extends JpaRepository<TweetEntity, Integer> {

//	TweetEntity insert(TweetEntity tweet);

	@Query("select T from TweetEntity T where T.tweetedBy=?1")
	List<TweetEntity> getAllTweetsOfuser(String tweetedBy);

}

