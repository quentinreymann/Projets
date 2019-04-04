package com.TP2.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.TP2.entities.Employer;

@Entity
public class Equipe implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_equipe" , nullable = false)
	private int id;
	
	@Column(name="nom_equipe",length=20)
    private String nom;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="equipe",fetch=FetchType.LAZY )		
	List<Employer> employer=new ArrayList<Employer>();
	
	

	public Equipe() {

	}

	public Equipe(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Employer> getEmployer() {
        return employer;
    }

    public void setEmployer(List<Employer> employer) {
        this.employer = employer;
    }
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
