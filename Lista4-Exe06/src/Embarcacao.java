public abstract class Embarcacao implements AtivoEmRisco {

	private String registroCapitania;
	private int qtdPessoas;

	public Embarcacao(String registroCapitania, int qtdPessoas) {
		super();
		this.setRegistroCapitania(registroCapitania);
		this.setQtdPessoas(qtdPessoas);
	}

	public String getRegistroCapitania() {
		return registroCapitania;
	}

	public void setRegistroCapitania(String registroCapitania) {
		if (registroCapitania == null || registroCapitania.isBlank() || registroCapitania.isEmpty()) {
			throw new IllegalArgumentException("Registro de Capitania não pode ser nulo");
		}
		this.registroCapitania = registroCapitania;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		if (qtdPessoas < 0) {
			throw new IllegalArgumentException("Quantidade de pessoas deve ser maior que 0");
		}
		this.qtdPessoas = qtdPessoas;
	}


}
