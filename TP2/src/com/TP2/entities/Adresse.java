package com.TP2.entities;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Embeddable;




@Embeddable
public class Adresse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	

	@Column(length = 10)
	private String rue;
	
	@Column(nullable = false ,length = 10)
	private String ville;
	
	@Column(name="Code Postale")
	private int CodePostale;
	


	public Adresse() {
		
	}

	public Adresse(String rue, String ville, int codePostale) {
		super();
		this.rue = rue;
		this.ville = ville;
		CodePostale = codePostale;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostale() {
		return CodePostale;
	}

	public void setCodePostale(int codePostale) {
		CodePostale = codePostale;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
