import java.time.LocalDate;

public class AlunoUniversitario extends Aluno {
	private char tipoIngresso;
	private Curso curso;

	public AlunoUniversitario(String nome, LocalDate dataNascimento, char ingresso, Curso curso) {
		super(nome, dataNascimento);
		this.setTipoIngresso(ingresso);
		this.setCurso(curso);
	}

	@Override
	public String mostra() {
		// Jo�o Carlos � aluno universit�rio do curso de SIS�Sistemas de Informa��o,
		// ingressando por ENEM.
		return this.getNome() + " � aluno universit�rio do curso de " + this.curso.getSigla() + "-"
				+ this.curso.getNome() + ", ingressando por " + this.tipoIngresso;
	}

	public char getTipoIngresso() {
		return tipoIngresso;
	}

	public String getTipoIngressoExtenso() {
		switch (this.tipoIngresso) {
		case 'V':
			return "Vestibular";
		case 'E':
			return "ENEM";
		case 'S':
			return "Seletivo Especial";
		case 'T':
			return "Transfer�ncia Externa";
		case 'I':
			return "Transfer�ncia Interna";
		default:
			return "indefinido";
		}
	}

	public void setTipoIngresso(char tipoIngresso) {
		if (tipoIngresso == 'V' || tipoIngresso == 'E' || tipoIngresso == 'S' || tipoIngresso == 'T'
				|| tipoIngresso == 'I') {
			this.tipoIngresso = tipoIngresso;
		} else {
			throw new IllegalArgumentException("Tipo de ingresso inv�lido: V,E,S,T,I");
		}

	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
