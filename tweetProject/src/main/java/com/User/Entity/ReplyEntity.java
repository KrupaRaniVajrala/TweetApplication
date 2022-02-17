package com.User.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reply")
public class ReplyEntity {

	@Id
	private int replyId;
	private String replyMsg;
	private String repliedBy;
	private int tweetId;
	private String login_id;
	private String repliedDate;
	
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	public String getReplyMsg() {
		return replyMsg;
	}
	public void setReplyMsg(String replyMsg) {
		this.replyMsg = replyMsg;
	}
	public String getRepliedBy() {
		return repliedBy;
	}
	public void setRepliedBy(String repliedBy) {
		this.repliedBy = repliedBy;
	}
	public int getTweetId() {
		return tweetId;
	}
	public void setTweetId(int tweetId) {
		this.tweetId = tweetId;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getRepliedDate() {
		return repliedDate;
	}
	public void setRepliedDate(String repliedDate) {
		this.repliedDate = repliedDate;
	}
	@Override
	public String toString() {
		return "ReplyEntity [replyId=" + replyId + ", replyMsg=" + replyMsg + ", repliedBy=" + repliedBy + ", tweetId="
				+ tweetId + ", login_id=" + login_id + ", repliedDate=" + repliedDate + "]";
	}
	public ReplyEntity(int replyId, String replyMsg, String repliedBy, int tweetId, String login_id,
			String repliedDate) {
		super();
		this.replyId = replyId;
		this.replyMsg = replyMsg;
		this.repliedBy = repliedBy;
		this.tweetId = tweetId;
		this.login_id = login_id;
		this.repliedDate = repliedDate;
	}
	public ReplyEntity() {
		super();
	}
	
		
}
