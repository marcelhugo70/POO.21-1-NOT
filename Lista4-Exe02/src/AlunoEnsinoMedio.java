import java.time.LocalDate;

public class AlunoEnsinoMedio extends Aluno {
	private int ano;
	
	// construtor
	public AlunoEnsinoMedio(String nome, LocalDate data, int ano) {
		super(nome,  data);
		this.setAno(ano);
	}

	// destrutor
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destrutor de Aluno ENSINO MEDIO "+this.getNome());
		super.finalize();
	}

	
	//Carlos Pinheiro est� cursando o 1o ano do ensino m�dio e tem 14 anos.
	@Override
	public String mostra() {
		return this.getNome()+" est� cursando o "
				+ this.ano +"o ano do ensino m�dio e tem "
				+ this.getIdade()+" anos.";
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano < 0 || ano > 3) {
			throw new IllegalArgumentException("Ano de estudo inv�lido");
		}
		this.ano = ano;
	}
	
	
}
