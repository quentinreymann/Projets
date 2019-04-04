package com.formation.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.formation.model.Property;

@ManagedBean(name="manager")
public class UserBean {
	
    @ManagedProperty(value = "#{singleton}")
    SingletonBean singleton;

    public void setSingleton(SingletonBean singleton) {
		this.singleton = singleton;
	}

    private Property selectedProp;
    private String key;
    private String value;

    public void save() {
    	singleton.put(key, value);
    }

    public void clear() {
    	singleton.delete(selectedProp);
    }
    public List<Property> getCacheList() {
        return singleton.getCache();
    }

	public Property getSelectedProp() {
		return selectedProp;
	}

	public void setSelectedProp(Property selectedProp) {
		this.selectedProp = selectedProp;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

 
    
}
