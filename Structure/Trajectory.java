package Structure;
public class Trajectory {
//trajet du bus entre deux arrêts
	NodeBStop arret_actuel;
	NodeBStop arret_precedent;
	int heure;
	
	public Trajectory(NodeBStop arret_actuel, NodeBStop arret_precedent, int heure) {
		this.arret_actuel = arret_actuel;
		this.arret_precedent = arret_precedent;
		this.heure = heure;
	}
	
	public String getNomLigne() {
		return this.arret_actuel.getNomLigne();
	}
	
	public String getNomBus() {
		return this.arret_actuel.getNomBus();
	}
	
}
