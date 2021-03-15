package Structure;
import java.util.*;

public class Line {
	
	private ArrayList<String> DataLine;
	
	public ArrayList<BusStop> dataline = new ArrayList<>();
	public ArrayList<String>listBusStop = new ArrayList<>();
	
	/*
	 ----------------------------
	 CONSTRUCTION DE LA CLASSE
	 ----------------------------
	 */
	
	public Line(ArrayList<String> dataL) {
		DataLine = dataL;
		
	}
	
	/*
	 -----------------------------
	 GETTERS ET SETTERS
	 -----------------------------
	 */
	public ArrayList<BusStop> getDataline() {
		return dataline;
	}

	public void setDataline(ArrayList<BusStop> dataline) {
		this.dataline = dataline;
	}

	public ArrayList<String> getListBusStop() {
		return listBusStop;
	}

	public void setListBusStop(ArrayList<String> listBusStop) {
		this.listBusStop = listBusStop;
	}
	
	/*
	-----------------------------------
	METHODES DE LA CLASSE
	-----------------------------------
	 */

	
	public int indexArret(String NomArret) {
		// retourne -1 si l'arret n'est pas dans la liste
		if (!this.listBusStop.contains(NomArret)) return -1;
		else return this.listBusStop.indexOf(NomArret);
	}
	
	public String getLastStop() {
		return this.listBusStop.get(this.listBusStop.size() - 1);
		
	}
	public ArrayList<String> horairesPassage(String NomArret){
		for (BusStop b : this.dataline) {
			if (b.getNom().equals(NomArret)) {
				return b.horairesPassage;
			}
		}
		return null;
	}
	public boolean IsPrevious(String unArret, String unAutreArret) {
		//retourne vrai si unAutreArret se trouve avant unArret
		return indexArret(unArret) > indexArret(unAutreArret);
	}
	
	public boolean IsNext(String unArret, String unAutreArret) {
		//retourne vrai si le deuxieme arret se trouve après le premier juste apres le premier
		return indexArret(unArret) < indexArret(unAutreArret);
	}
	
	public boolean isThisABusStop(String NomArret, ArrayList<String> horairesPassage) {
		for (BusStop b : this.dataline) {
			if (b.nom == NomArret && b.horairesPassage == horairesPassage) {
				return true;
			}
		}
		return false;
	}
	public ArrayList<BusStop>getPreviousStop(BusStop bs){
		ArrayList<BusStop>busStops = new ArrayList<>();
		BusStop PreviousStop = null;
		System.out.println(this.listBusStop);
		for (BusStop b : this.dataline) {
			if (bs == b) {
				busStops.add(PreviousStop);
			}
			PreviousStop = b;
		}
		return busStops;
		}
	public ArrayList<BusStop>getNextStop(BusStop bs){
		ArrayList<BusStop>busStops = new ArrayList<>();
		BusStop NextStop = null;
		System.out.println(this.listBusStop);
		for (BusStop b : this.dataline) {
			if (bs == NextStop) {
				busStops.add(b);
			}
			NextStop = b;
		}
		return busStops;
	}
	public String getTerminuses(){
		return this.listBusStop.get(0) + "_to_" + this.listBusStop.get(this.listBusStop.size() - 1);
	}
	public void printNomArrets() {
		System.out.println(this.listBusStop);
	}	
	}

	  

