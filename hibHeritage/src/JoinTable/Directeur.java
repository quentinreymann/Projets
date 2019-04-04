package JoinTable;

import javax.persistence.Entity;

import JoinTable.Employeur;

@Entity
public class Directeur extends Employeur{
	
	private String nomEquipe;
	
	public Directeur() {
		
	}




	public Directeur(String nom, String prenom, int age, String nomEquipe) {
		super(nom, prenom, age);
		this.nomEquipe = nomEquipe;
	}

	public String getNomEquipe() {
		return nomEquipe;
	}

	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}

}

