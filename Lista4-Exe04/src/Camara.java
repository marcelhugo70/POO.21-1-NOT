import java.util.ArrayList;
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

	public Partido getPartido(int numero) {
		return this.partidos.get(numero);
	}
	// -----------------------------------------------
	public int getTotalProjApresentados() {
		int totApres = 0;
		for (Partido p : partidos.values()) {
			totApres += p.getTotalProjApresentados();
		}
		return totApres;
	}

	// -----------------------------------------------
	public int getTotalProjAprovados() {
		int totAprov = 0;
		for (Partido p : partidos.values()) {
			totAprov += p.getTotalProjAprovados();
		}
		return totAprov;
	}

	public Vereador getVereadorMenorDesempenho() {
		Vereador menor = null;
		for (Partido p : partidos.values()) {
			for (Vereador vereador : p.getVereadores()) {
				if (menor == null || vereador.getDesempenho() < menor.getDesempenho()) {
					menor = vereador;
				}
			}
		}
		return menor;
	}

	public Vereador getVereadorMaisProjAprovados() {
		Vereador mais = null;
		for (Partido p : partidos.values()) {
			Vereador v = p.getVereadorMaisProjAprovados();
			if (v != null) {
				if (mais == null || v.getQtdProjAprov() > mais.getQtdProjAprov()) {
					mais = v;
				}
			}
		}
		return mais;
	}

	public float getMediaDesempenho() {
		float total = 0;
		int qtdVereadores = 0;
		for (Partido p : partidos.values()) {
			for (Vereador v : p.getVereadores()) {
				total += v.getDesempenho();
				qtdVereadores++;
			}
			//qtdVereadores += p.getVereadores().size();
		}
		return total/qtdVereadores;
	}
	
	public ArrayList<Vereador> getVereadoresAcimaMedia() {
		float media = this.getMediaDesempenho();
		ArrayList<Vereador> vereadoresAcimaMedia = new ArrayList<>();

		for (Partido p : partidos.values()) {
			for (Vereador v : p.getVereadores()) {
				if (v.getDesempenho() > media) {
					vereadoresAcimaMedia.add(v);
				}
			}
		}

		return vereadoresAcimaMedia;
	}
}
