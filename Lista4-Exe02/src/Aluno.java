import java.time.LocalDate;
import java.time.Period;

public abstract class Aluno {
	private String nome;
	private LocalDate dataNascimento;
	
	public Aluno(String nome, LocalDate dataNascimento) {
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destrutor de aluno = "+this.nome);
	}

	public abstract String mostra();
	
	public int getIdade() {
		Period p = Period.between(this.dataNascimento, LocalDate.now());
		return p.getYears();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("Nome do aluno inválido.");
		}
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
