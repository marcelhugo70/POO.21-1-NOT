import java.time.LocalDate;

public class ProjetoDeLeiComplementar extends ProjetoDeLei {
//__________________________________________________

	private String artigoLO;
	private int qtdVotosFavoraveis;
	
//___________________________________________________________________________
	
	public ProjetoDeLeiComplementar(String titulo, LocalDate dataApresentacao,
			LocalDate dataAprovacao, int numeroProjeto, String artigoLO, int qtdVotosFavoraveis) {
		super(titulo, dataApresentacao, dataAprovacao, numeroProjeto);
		this.setArtigoLO(artigoLO);
		this.setQtdVotosFavoraveis(qtdVotosFavoraveis);
	}
	
//___________________________________________________________________________

	@Override
	public String mostrar() {
		String mensagem = super.mostrar();
		mensagem += "\nArtigo LO: " + this.getArtigoLO() + "\n" +
					"Votos Favoráveis: " + this.getQtdVotosFavoraveis();
		return mensagem;
	}
	
	
	
//-------------------------------------------------------------------------
	public String getArtigoLO() {
		return artigoLO;
	}
	public void setArtigoLO(String artigoLO) {
		this.artigoLO = artigoLO;
	}

//-------------------------------------------------------------------------	
	public int getQtdVotosFavoraveis() {
		return qtdVotosFavoraveis;
	}
	public void setQtdVotosFavoraveis(int qtdVotosFavoraveis) {
		if (qtdVotosFavoraveis > 0) {
			this.qtdVotosFavoraveis = qtdVotosFavoraveis;
		} else {
			throw new IllegalArgumentException("'Votos Favoráveis' precisa ser maior que zero");
		}
	}
	
}
