package com.User.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name="tweets")
public class TweetEntity {

	@Id
	private int tweetId;
	private String tweetedBy;
	private String tweetmsg;
	private String tweetDate;
	
	public int getTweetId() {
		return tweetId;
	}
	public void setTweetId(int tweetId) {
		this.tweetId = tweetId;
	}
	public String getTweetedBy() {
		return tweetedBy;
	}
	public void setTweetedBy(String tweetedBy) {
		this.tweetedBy = tweetedBy;
	}
	public String getTweetmsg() {
		return tweetmsg;
	}
	public void setTweetmsg(String tweetmsg) {
		this.tweetmsg = tweetmsg;
	}
	public String getTweetDate() {
		return tweetDate;
	}
	public void setTweetDate(String tweetDate) {
		this.tweetDate = tweetDate;
	}
	@Override
	public String toString() {
		return "TweetEntity [tweetId=" + tweetId + ", tweetedBy=" + tweetedBy + ", tweetmsg=" + tweetmsg
				+ ", tweetDate=" + tweetDate + "]";
	}
	public TweetEntity(int tweetId, String tweetedBy, String tweetmsg, String tweetDate) {
		super();
		this.tweetId = tweetId;
		this.tweetedBy = tweetedBy;
		this.tweetmsg = tweetmsg;
		this.tweetDate = tweetDate;
	}
	public TweetEntity() {
		super();
	}
			
}
