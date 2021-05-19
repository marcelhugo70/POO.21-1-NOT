import java.time.LocalDate;

public class Evento {
// titulo valor data -- exibir() String
	private String titulo;
	private double valor;
	private LocalDate data;
	private Avaliacao avaliacao;

//_____________________________________________________________

	public Evento(String titulo, double valor, LocalDate data) {
		super();
		this.setTitulo(titulo);
		this.setValor(valor);
		this.setData(data);
	}

//_____________________________________________________________

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	
//_____________________________________________________________

//Teatro �s 18h, no dia 10/09/2019, ingressos a R$ 20,00,
//teve 1500pagantes que acharam o evento Bom n�vel.

//Evento: Palestra com Tadeo Berkji, no dia 05/08/2019,
//ingressos a R$ 60,00, teve 54pagantes que acharam o
//evento Com informa��es esclarecedoras sobre as artes
//pl�sticas contempor�neas.
	public String exibir() {
		String m = "Evento: ";
		m += this.getTitulo() + ", no dia " + this.getData() + ", ingressos a " + this.getValor();

		if (this.avaliacao == null) {
			m += ". Ainda n�o avaliado.";
		}
		else {
			m += ", teve "+this.avaliacao.getQtdPagantes()+" pagantes que acharam o evento "
					+this.avaliacao.getOpiniaoGeral()+".";
		}
		return m;
	}


	//-------------------------------------------------------------
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo == null || titulo.length()<4) {
			throw new IllegalArgumentException("T�tulo inv�lido. Ao menos 4 caracteres.");
		}
		this.titulo = titulo;
	}

//-------------------------------------------------------------
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor do ingresso inv�lido");
		}
		this.valor = valor;
	}

//-------------------------------------------------------------
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "E:"+this.titulo + " - " + this.data;
	}

}