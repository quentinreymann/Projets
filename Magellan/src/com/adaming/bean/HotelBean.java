package com.adaming.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class HotelBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String country;
	 @PostConstruct
	    public void init() {	
		country = (String) FacesContext.getCurrentInstance().getExternalContext()
				.getFlash().get("pays");
		System.out.println(country);
	 }
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


}