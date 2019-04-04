package SingleTable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_emp",discriminatorType=DiscriminatorType.INTEGER)
@DiscriminatorValue("0")

@Entity
public class Employeur {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEmployeur;
	private String nom;
	private String prenom;
	private int age;

	public Employeur() {
		
	}

	public Employeur(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	@Override
	public String toString() {
		return "employeur [idEmployeur=" + idEmployeur + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}


	
}
