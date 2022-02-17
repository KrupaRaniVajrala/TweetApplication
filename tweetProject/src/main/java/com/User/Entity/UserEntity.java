package com.User.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class UserEntity {
	
	@Id
//	@OneToMany
//	@JoinColumn(name = "login_id", referencedColumnName = "tweetedBy")
	private String login_id;
	private String firstName;
	private String lastName;
	private String email_id;
	private String password;
	private String contactNum;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactNum() {
		return contactNum;
	}
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	@Override
	public String toString() {
		return "UserEntity [firstName=" + firstName + ", lastName=" + lastName + ", email_id=" + email_id
				+ ", login_id=" + login_id + ", password=" + password + ", contactNum=" + contactNum + "]";
	}
	public UserEntity(String firstName, String lastName, String email_id, String login_id, String password,
			String contactNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email_id = email_id;
		this.login_id = login_id;
		this.password = password;
		this.contactNum = contactNum;
	}
	public UserEntity() {
		super();
	}
	
}
