package Structure;
import java.util.*;
import java.lang.*;

public class NodeBStop {
	private String NomBus, NomLigne;
	private int distance = Integer.MAX_VALUE;
	private BusStop arret;
	private ArrayList<NodeBStop> NoeudSuivant = new ArrayList<>();
	private List shortestPath = new LinkedList<>();
	Map noeuds_adjacents = new HashMap<>();
	
	public NodeBStop(String unNomBus, int uneDistance, String unNomLigne, BusStop unArret) {
		NomBus = unNomBus;
		distance = uneDistance;
		NomLigne = unNomLigne;
		arret = unArret;
		
	}
	
	

	/*
	------------------------------------------------
	GETTERS ET SETTERS
	-------------------------------------------------
	 */
	public String getNomBus() {
		return NomBus;
	}

	public void setNomBus(String nomBus) {
		NomBus = nomBus;
	}

	public String getNomLigne() {
		return NomLigne;
	}

	public void setNomLigne(String nomLigne) {
		NomLigne = nomLigne;
	}

	public BusStop getArret() {
		return arret;
	}

	public void setArret(BusStop arret) {
		this.arret = arret;
	}

	public ArrayList<NodeBStop> getNoeudSuivant() {
		return NoeudSuivant;
	}
	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public void setNoeudSuivant(ArrayList<NodeBStop> noeudSuivant) {
		NoeudSuivant = noeudSuivant;
	}
	public ArrayList<String>getHeurePassage(){
		return this.arret.horairesPassage;
		
	}
	/**
	 * @return the shortestPath
	 */
	public List getShortestPath() {
		return shortestPath;
	}

	/**
	 * @param shortestPath the shortestPath to set
	 */
	public void setShortestPath(List shortestPath) {
		this.shortestPath = shortestPath;
	}
	public Map getNoeuds_adjacents() {
		return noeuds_adjacents;
	}



	public void setNoeuds_adjacents(Map noeuds_adjacents) {
		this.noeuds_adjacents = noeuds_adjacents;
	}
	/*
	-----------------------------------------------------
	AUTRES METHODES
	------------------------------------------------------
	 */
	public boolean desserviOuNon() {
		return this.getArret() != null && this.getNomLigne() != null && this.getNomBus() != null;
	}







	
	}



		
	

