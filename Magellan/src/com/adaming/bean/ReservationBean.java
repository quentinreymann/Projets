package com.adaming.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;
import com.adaming.bean.HotelBean;
@ManagedBean
public class ReservationBean {

	private String nom;
	private String prenom;
	private String address;
    
 
    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getnom() {
        return nom;
    }
 
    public void setnom(String nom) {
        this.nom = nom;
    }
 
    public String getprenom() {
        return prenom;
    }
 
    public void setprenom(String prenom) {
        this.prenom = prenom;
    }
   
    public void reserver() {
        FacesMessage message = null;
        boolean loggedIn = false;
         
        message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Ok", nom);
         
        FacesContext.getCurrentInstance().addMessage(null, message);
        PrimeFaces.current().ajax().addCallbackParam("loggedIn", loggedIn);
        
    }  
    public String validationPays(String country){
        FacesContext.getCurrentInstance().getExternalContext().getFlash().put("pays", country);
       return "Hotels";

   }
}