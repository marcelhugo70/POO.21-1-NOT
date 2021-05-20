import java.util.ArrayList;

public class Vereador {
	private String nome;
	private Partido partido;
	private ArrayList<ProjetoDeLei> projetos = new ArrayList<>();

	public void addProjeto(ProjetoDeLei p) {
		this.projetos.add(p);
	}
	
	public float getDesempenho() {
		return (this.getQtdProjAprov() / (float)this.getQtdProjApres()) * this.getIndiceTrabalho();
	}
	
	public float getIndiceTrabalho() {
		if (this.getQtdProjApres() == 0) {
			return 0;
		}
		if (this.getQtdProjApres() < 6) {
			return 0.8f;
		}
		if (this.getQtdProjApres() < 11) {
			return 1f;
		}
		if (this.getQtdProjApres() < 18) {
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
		else {
			throw new IllegalArgumentException("Nome do vereador inválido.");
		}
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public int getQtdProjApres() {
		return this.projetos.size();
	}

	
	public int getQtdProjAprov() {
		int conta = 0;
		for (ProjetoDeLei p:this.projetos) {
			if (p.isAprovado()) {
				conta++;
			}
		}
		return conta;
	}

	@Override
	public String toString() {
		return nome + " - "+ this.partido.getNome();
	}

	

}
