package Structure;
import java.util.*;
import java.util.Map.Entry;

public class Shortest {
	@SuppressWarnings("unchecked")
	public static BStopGraph calulerLePlusCourtChemin(BStopGraph graphe, NodeBStop noeud_source) {
		noeud_source.setDistance(0);
		
		Set noeuds_traites = new HashSet<>();
		Set noeuds_non_traites = new HashSet<>();
		
		noeuds_non_traites.add(noeud_source);
		
		while (noeuds_non_traites.size() != 0) {
			@SuppressWarnings("unchecked")
			NodeBStop noeud_actuel = getNoeudDistanceMinimale(noeuds_non_traites);
			noeuds_non_traites.remove(noeud_actuel);
			for (Entry < NodeBStop, Integer>adjacencyPair:
				noeud_actuel.getNoeuds_adjacents()) {
				NodeBStop noeud_adjacent = adjacencyPair.getKey();
				int poids_arc = adjacencyPair.getValue();
				if (!noeuds_traites.contains(noeud_adjacent)) {
					calculerDistanceMin(noeud_adjacent, poids_arc, noeud_actuel);
					noeuds_non_traites.add(noeud_adjacent);
				}
			}
			noeuds_traites.add(noeud_actuel);
		}
		return graphe;
	}
	
	private static NodeBStop getNoeudDistanceMinimale(Set < NodeBStop > noeuds_non_traites) {
		NodeBStop noeud_distance_min = null;
		int distance_min = Integer.MAX_VALUE;
		for (NodeBStop noeud : noeuds_non_traites) {
			int noeud_distance = noeud.getDistance();
			if (noeud_distance < distance_min) {
				distance_min = noeud_distance;
				noeud_distance_min = noeud;
			}
		}
		return noeud_distance_min;
	}
	private static void calculerDistanceMin(NodeBStop noeud_test, int poids_arc, NodeBStop noeud_source) {
		int distance_source = noeud_source.getDistance();
		if (distance_source + poids_arc < noeud_test.getDistance()) {
			noeud_test.setDistance(distance_source + poids_arc);
			LinkedList shortestPath = new LinkedList<>(noeud_source.getShortestPath());
			shortestPath.add(noeud_source);
			noeud_test.setShortestPath(shortestPath);
		}
	}

}
