package com.adaming.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ListenerView {
     
    private String text;
 
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}