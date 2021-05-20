import java.time.LocalDate;

public class ProjetoDeLei {
//__________________________________________________
	
	private String titulo;
	private LocalDate dataApresentacao;
	private LocalDate dataAprovacao;
	private int numeroProjeto;
//__________________________________________________
	
	public ProjetoDeLei(String titulo, LocalDate dataApresentacao, LocalDate dataAprovacao, int numeroProjeto) {
		this.setTitulo(titulo);
		this.setDataApresentacao(dataApresentacao);
		this.setDataAprovacao(dataAprovacao);
		this.setNumeroProjeto(numeroProjeto);
	}
	
	//__________________________________________________
	
	public boolean isAprovado() {
		return (this.dataAprovacao != null);
	}
	
	public String mostrar() {
		String mensagem = "";
		mensagem += "Titulo " + this.getTitulo() + "\n"
				    + "Data Apresentação: " + this.getDataApresentacao() + "\n";
		
		//----------------------------------------------------------------
		if (this.getDataAprovacao() != null) {
			mensagem += "Data Aprovação: " + this.getDataAprovacao();
		} else {
			mensagem += "Data Aprovação: Não Aprovado";
		}
		//----------------------------------------------------------------
		
		mensagem += "\n" + "Número do Projeto: " + this.getNumeroProjeto();
		
		return mensagem;
	}
	
	

//--------------------------------------------------
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

//--------------------------------------------------
	public LocalDate getDataApresentacao() {
		return dataApresentacao;
	}
	public void setDataApresentacao(LocalDate dataApresentacao) {
		this.dataApresentacao = dataApresentacao;
	}

//--------------------------------------------------
	public LocalDate getDataAprovacao() {
		return dataAprovacao;
	}
	public void setDataAprovacao(LocalDate dataAprovacao) {
		this.dataAprovacao = dataAprovacao;
	}


//--------------------------------------------------
	public int getNumeroProjeto() {
		return numeroProjeto;
	}

	public void setNumeroProjeto(int numeroProjeto) {
		this.numeroProjeto = numeroProjeto;
	}
	

	
}

