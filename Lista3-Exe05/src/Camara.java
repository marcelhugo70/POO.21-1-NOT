import java.util.HashMap;

public class Camara {
	private HashMap<Integer, Partido> partidos = new HashMap<>();

	
	public boolean addPartido(Partido p) {
		if (partidos.containsKey(p.getNumero())) {
			return false;
		}
		partidos.put(p.getNumero(), p);
		return true;
	}
	
	
}
