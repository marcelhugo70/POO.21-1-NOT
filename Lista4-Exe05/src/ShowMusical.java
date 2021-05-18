import java.time.LocalDate;

public class ShowMusical extends Evento {

	private String nomeBanda;
	private String estiloMusical;

	public ShowMusical(String titulo, float valor, LocalDate data, String nomeBanda, String estiloMusical) {
		super(titulo, valor, data);
		this.setNomeBanda(nomeBanda);
		this.setEstiloMusical(estiloMusical);
	}

	public String getNomeBanda() {
		return nomeBanda;
	}

	public void setNomeBanda(String nomeBanda) {
		if (nomeBanda == null || nomeBanda.isBlank() || nomeBanda.isEmpty())
			throw new IllegalArgumentException("Banda deve ter nome valido");
		this.nomeBanda = nomeBanda;
	}

	public String getEstiloMusical() {
		return estiloMusical;
	}

	public void setEstiloMusical(String estiloMusical) {
		if (estiloMusical == null || estiloMusical.isBlank() || estiloMusical.isEmpty())
			throw new IllegalArgumentException("Estilo musical deve ser valido");
		this.estiloMusical = estiloMusical;
	}

	@Override
	public String exibir() {
		if (this.getAvaliacao() == null)
			return "Show musical " + this.getTitulo() + " de " + this.estiloMusical + " de " + this.nomeBanda
					+ " com ingressos de R$" + this.getValor() + ", dia " + this.getData() + ". Ainda não avaliado";

		return "Show musical " + this.getTitulo() + " de " + this.estiloMusical + " de " + this.nomeBanda
				+ " com ingressos de R$" + this.getValor() + " teve " + this.getAvaliacao().getQtdPagantes() + " pagantes no dia "
				+ this.getData() + ". Opinião: " + this.getAvaliacao().getOpiniaoGeral();
	}
}