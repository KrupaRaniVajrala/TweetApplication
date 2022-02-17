package com.User.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Likes")
public class LikeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int likeId;
	private String likedBy;
	private String likedDate;
	private String tweetId;
	private String login_id;
	public int getLikeId() {
		return likeId;
	}
	public void setLikeId(int likeId) {
		this.likeId = likeId;
	}
	public String getLikedBy() {
		return likedBy;
	}
	public void setLikedBy(String likedBy) {
		this.likedBy = likedBy;
	}
	public String getLikedDate() {
		return likedDate;
	}
	public void setLikedDate(String likedDate) {
		this.likedDate = likedDate;
	}
	public String getTweetId() {
		return tweetId;
	}
	public void setTweetId(String tweetId) {
		this.tweetId = tweetId;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	@Override
	public String toString() {
		return "LikeEntity [likeId=" + likeId + ", likedBy=" + likedBy + ", likedDate=" + likedDate + ", tweetId="
				+ tweetId + ", login_id=" + login_id + "]";
	}
	public LikeEntity(int likeId, String likedBy, String likedDate, String tweetId, String login_id) {
		super();
		this.likeId = likeId;
		this.likedBy = likedBy;
		this.likedDate = likedDate;
		this.tweetId = tweetId;
		this.login_id = login_id;
	}
	public LikeEntity() {
		super();
	}
	
	
	
}
