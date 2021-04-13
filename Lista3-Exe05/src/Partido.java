import java.util.ArrayList;

public class Partido {
	private String nome;
	private int numero;
	private ArrayList<Vereador> vereadores = new ArrayList<>();

	public void addVereador(Vereador v) {
		if (v != null) {
			vereadores.add(v);
			v.setPartido(this);
		}
	}

	public int getTotalProjApresentados() {
		int qtdProjetosApresentados = 0;
		for (Vereador v : vereadores) {
			qtdProjetosApresentados += v.getQtdProjApres();
		}
		return qtdProjetosApresentados;
	}

	public int getTotalProjAprovados() {
		int projAprov = 0;
		for (Vereador vereador : this.vereadores) {
			projAprov += vereador.getQtdProjAprov();
		}
		return projAprov;
	}

	public float getMediaDesempenho() {
		float mediaDesempenho = 0f;
		for (Vereador v : vereadores) {
			mediaDesempenho += v.getDesempenho();
		}
		return mediaDesempenho / vereadores.size();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero >= 10 && numero < 100) {
			this.numero = numero;
		}
	}

}
