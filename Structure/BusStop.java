package Structure;
import java.util.*;

//on prend par exemple l'arret Gare

public class BusStop {
	
	private String DataArret;
	public String nom = "";
	public ArrayList<String> horairesPassage = new ArrayList<>();
	public boolean dejaDesservi = false;
	public boolean terminus = false;
	
	public BusStop (String DataBS) {
		DataArret = DataBS;
	}
	
	public void affichage() {
		System.out.println("Nom de l'arret de bus : ");
		System.out.println(this.nom);
		System.out.println("Horaire : ");
		System.out.println(this.horairesPassage);
	}
	
	//GETTERS ET SETTERS

	public String getDataArret() {
		return DataArret;
	}

	public void setDataArret(String dataArret) {
		DataArret = dataArret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<String> getHorairesPassage() {
		return horairesPassage;
	}

	public void setHorairesPassage(ArrayList<String> horairesPassage) {
		this.horairesPassage = horairesPassage;
	}
	public void setTerminus() {
		if (true) {
			this.terminus = true;
		}
	
	}

	public void setDejaDesservi(boolean dejaDesservi) {
		this.dejaDesservi = dejaDesservi;
	}

	
	
	
		

}
