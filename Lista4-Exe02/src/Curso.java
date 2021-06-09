import java.io.Serializable;

public class Curso implements Serializable  {
	private String sigla;
	private String nome;
	
	public Curso(String sigla, String nome) {
		super();
		this.setSigla(sigla);
		this.setNome(nome);
	}
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		if (sigla == null || sigla.length() != 3) {
			throw new IllegalArgumentException("Sigla inválida!");
		}
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
