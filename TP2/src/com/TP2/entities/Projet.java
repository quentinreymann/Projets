package com.TP2.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Projet implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_proj" , nullable = false)
	private int id;
	
	@Column(name="nom_proj",length=20)
    private String nom;
	
	@ManyToMany(mappedBy="projets")
	private List<Employer> employers=new ArrayList<Employer>();

	
	public Projet() {

	}

	public Projet(int id, String nom) {
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
        return employers;
    }

    public void setEmployer(List<Employer> employer) {
        this.employers = employer;
    }
    
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
