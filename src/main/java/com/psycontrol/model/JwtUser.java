package com.psycontrol.model;

public class JwtUser {
	
	private long Id;
	private String UserName;
	private String role;

	public String getUserName() {
		return this.UserName;
	}

	public void setUserName(String userName) {
		this.UserName = userName;
	}

	public long getId() {
		return this.Id;
	}

	public void setId(long id) {
		this.Id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
