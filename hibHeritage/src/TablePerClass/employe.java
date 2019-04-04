package TablePerClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

@Entity
public class employe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int idEmploye;
	private String nom;
	private String prenom;
	private int age;
	
	public employe() {
	}
	
	
	public employe( String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}


	@Override
	public String toString() {
		return "employe [idEmploye=" + idEmploye + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}


	public int getIdEmploye() {
		return idEmploye;
	}


	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
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

}