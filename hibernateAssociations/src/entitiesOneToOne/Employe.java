package entitiesOneToOne;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employe implements Serializable {
	
	private static final long serialVesionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_emp")
	private int id;
	
	@Column(name="nom_emp")
	private String nom;
	
	@Column(name="pre_emp")
	private String prenom;
	
	@Column(name="age_emp")
	private int age;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_adresse")
	Adresse adresse;

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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public static long getSerialvesionuid() {
		return serialVesionUID;
	}
	

}
