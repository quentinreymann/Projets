package entitiesOneToMany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Projet implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_proj")
	private int id;
	
	@Column
	private String nom;
	
	
	@ManyToOne
	@JoinColumn(name="id_emp" )
	private Employe employe;

	
	public Projet() {
		
	}



	public Employe getEmployer() {
		return employe;
	}



	public void setEmployer(Employe employe) {
		this.employe = employe;
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



	public Employe getEmploye() {
		return employe;
	}



	public void setEmploye(Employe employe) {
		this.employe = employe;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}