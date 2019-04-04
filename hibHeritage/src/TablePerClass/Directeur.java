package TablePerClass;

public class Directeur extends employe{
	
	private String nomEquipe;
	
	public Directeur() {
		
	}

	public Directeur(String nom, String prenom, int age, String nomEquipe) {
		super( nom, prenom, age);
		this.nomEquipe = nomEquipe;
	}

	@Override
	public String toString() {
		return "Directeur [nomEquipe=" + nomEquipe + "]";
	}

	public String getNomEquipe() {
		return nomEquipe;
	}

	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}

	

	
	
	

}
