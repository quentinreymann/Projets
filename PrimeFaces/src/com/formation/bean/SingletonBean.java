package com.formation.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.formation.model.Property;

@ManagedBean(name="singleton")
@ApplicationScoped
public class SingletonBean {

	private List<Property> cache;

	@PostConstruct
	public void initCache() {

		cache = new ArrayList<Property>();
	}

	public void delete(Property prop) {

		this.cache.remove(prop);
	}

	public void put(String key, String value) {
		Property p = new Property();
		p.setKey(key);
		p.setValue(value);

		this.cache.add(p);
	}

	public List<Property> getCache() {
		return cache;
	}

}
