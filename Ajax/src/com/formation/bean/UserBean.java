package com.formation.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "user")
@SessionScoped
public class UserBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name = "";
 
    public String getName() {
        return name;
    }
 
    public void setName(String newValue) {
        name = newValue;
    }
 
    public String getGreeting() {
        if (name == null || name.length() == 0)
            return "";
        else
            return "Welcome to JSF2 + Ajax, " + name + "!";
    }
}
