package entitiesManyToMany;

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
	
	
	@ManyToMany(mappedBy="projets")
	private List<Employe> employers=new ArrayList<Employe>();

	
	public Projet() {
		
	}

	public List<Employe> getEmployers() {
		return employers;
	}

	public void setEmployers(List<Employe> employers) {
		this.employers = employers;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}