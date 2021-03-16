package Structure;
import java.util.*;
public class BStopGraph extends NodeBStop {


	
	/*
	----------------------------------------
	CONSTRUCTION DE LA CLASSE
	-----------------------------------------
	 */
	private int HoraireDeDepart = -1;
	private ArrayList<BStopGraph> nodeBSChildren = new ArrayList<>();
	private Set noeuds = new HashSet<>();
	public BStopGraph(String unNomBus, int uneDistance, String unNomLigne, BusStop unArret) {
		super(unNomBus, uneDistance, unNomLigne, unArret);
		// TODO Auto-generated constructor stub
	}
	/*
	--------------------------------------------
	GETTERS ET SETTERS
	--------------------------------------------
	 */

	public int getHoraireDeDepart() {
		return HoraireDeDepart;
	}

	public void setHoraireDeDepart(int horaireDeDepart) {
		HoraireDeDepart = horaireDeDepart;
	}

	public ArrayList<BStopGraph> getNodeBSChildren() {
		return nodeBSChildren;
	}

	public void setNodeBSChildren(ArrayList<BStopGraph> nodeBSChildren) {
		this.nodeBSChildren = nodeBSChildren;
	}
	public ArrayList<BStopGraph> getFeuilles(){
		ArrayList<BStopGraph> feuilles = new ArrayList<>();
		for (BStopGraph child : this.nodeBSChildren) {
			if (child.nodeBSChildren.size() == 0) {
				feuilles.add(child);
			} 
			else {
				feuilles.addAll(child.getFeuilles());
			}
		}
		return feuilles;
	}
	public int getShortestTime() {
		int shortestTime = -1;
		for (BStopGraph feuille: getFeuilles()) {
			if (shortestTime > feuille.getHoraireDeDepart()) {
				shortestTime = feuille.getHoraireDeDepart();
			}
		}
		return shortestTime;
	}
	/*
	---------------------------------------------------
	AUTRES METHODES
	---------------------------------------------------
	 */
	
	public void addNodeChild(BStopGraph nodechild) {
		this.nodeBSChildren.add(nodechild);
	}
	public void addNode(NodeBStop nodebs) {
		noeuds.add(nodebs);
	}
	
}
