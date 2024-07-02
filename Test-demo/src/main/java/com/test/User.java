package com.test;
import javax.validation.constraints.*;


import jakarta.persistence.*;

@Entity
@Table(name="validators")
public class User {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @NotNull(message="muserId can not be empty")
	  private String userId;
	  
	  @Size(max=45,min=5,message="userName should be greater than 5 and lesser than 45 size ")
	  private String userName;

	  @Email(message="Enter an proper email format")
	  @NotNull(message="userEmail cannot be empty")
	  private String userEmail;

	public User(String userId, String userName, String userEmail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
	}
public User() {
	// TODO Auto-generated constructor stub
}
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	}