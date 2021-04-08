
public class Vereador {
	private String nome;
	private Partido partido;
	private int qtdProjApres, qtdProjAprov;

	public float getDesempenho() {
		return (this.qtdProjAprov / (float)this.qtdProjApres) * this.getIndiceTrabalho();
	}
	
	public float getIndiceTrabalho() {
		if (this.qtdProjApres == 0) {
			return 0;
		}
		if (this.qtdProjApres < 6) {
			return 0.8f;
		}
		if (this.qtdProjApres < 11) {
			return 1f;
		}
		if (this.qtdProjApres < 18) {
			return 1.08f;
		}
		return 1.22f;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.isEmpty()) {
			this.nome = nome;
		}
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public int getQtdProjApres() {
		return qtdProjApres;
	}

	public void setQtdProjApres(int qtdProjApres) {
		if (qtdProjApres >= 0) {
			this.qtdProjApres = qtdProjApres;
		}
	}

	public int getQtdProjAprov() {
		return qtdProjAprov;
	}

	public void setQtdProjAprov(int qtdProjAprov) {
		if (qtdProjAprov >= 0) {
			this.qtdProjAprov = qtdProjAprov;
		}
	}

}
