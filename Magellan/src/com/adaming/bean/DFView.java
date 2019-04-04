package com.adaming.bean;

import java.util.HashMap;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;
import org.primefaces.event.SelectEvent;

@ManagedBean(name = "dfView")
public class DFView {
     
    public void viewCars() {
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("resizable", false);
        PrimeFaces.current().dialog().openDynamic("reservationpop", options, null);
    }
     
    public void viewCarsCustomized() {
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("modal", true);
        options.put("width", 640);
        options.put("height", 340);
        options.put("contentWidth", "100%");
        options.put("contentHeight", "100%");
        options.put("headerElement", "customheader");
         
        PrimeFaces.current().dialog().openDynamic("reservationpop", options, null);
    }
     

}