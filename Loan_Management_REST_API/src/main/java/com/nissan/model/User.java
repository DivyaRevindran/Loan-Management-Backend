package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//user id
	private Integer userId;
	//user name
	private String userName;
	//password
	private String password;
	//active or not
	private boolean isActive;
	
	//mapping to role
	private Integer roleId;
	@ManyToOne
	@JoinColumn(name="roleId",insertable=false,updatable=false)
	private Role role;
	public User() {
		super();
		
	}
	public User(Integer userId, String userName, String password, boolean isActive, Integer roleId, Role role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.isActive = isActive;
		this.roleId = roleId;
		this.role = role;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
}
