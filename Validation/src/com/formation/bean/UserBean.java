package com.formation.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class UserBean {
	private String userName;
	private int age;
	public String getUserName() {
		return userName;
		}
	public void setUserName(String userName) {
		this.userName = userName;
		}
	public int getAge() {
		return age;
		}
	public void setAge(int age) {
		this.age = age;
		}
	private String email;
	public String getEmail() {
		return email;
		}

public void setEmail(String email) {
		this.email = email;
	}
@Override
	public String toString() {
	return"UserBean [userName=" + userName + ", age=" + age + "]";
	}
}