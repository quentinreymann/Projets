package com.formation.bean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="loginBean")
@SessionScoped

public class LoginBean {
	
	private String name;
	private String password;
	
	public String getName() {
		return name;
		}
	public void setName(String name) {
		this.name = name;
		}public 
	
	String getPassword() {
		return password;
		}
		
	public void setPassword(String password) {
		this.password = password;
		}
	}