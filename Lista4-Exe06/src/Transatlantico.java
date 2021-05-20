import java.time.LocalDate;
import java.util.ArrayList;

public class Transatlantico extends Embarcacao {
	private String nome;
	private LocalDate dataInauguracao;
	private ArrayList<BoteSalvaVidas> botes = new ArrayList<>();
	
	public Transatlantico(String registroCapitania, int qtdPessoas, 
						String nome, LocalDate data) {
		super(registroCapitania, qtdPessoas);
		this.setNome(nome);
		this.setDataInauguracao(data);
	}

	public void addBote(BoteSalvaVidas umBote) {
		this.botes.add(umBote);
	}
	
	public void addBote(String registroCapitania, int qtdPessoas, boolean inflavel, int qtdRemos, int qtdColetes) {
		BoteSalvaVidas bote = new BoteSalvaVidas(registroCapitania, qtdPessoas, inflavel, qtdRemos, qtdColetes);
		this.botes.add(bote);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataInauguracao() {
		return dataInauguracao;
	}

	public void setDataInauguracao(LocalDate dataInauguracao) {
		this.dataInauguracao = dataInauguracao;
	}

	public int contarCapacidadeDosBotes() {
		int total = 0;
		for (BoteSalvaVidas bote: this.botes) {
			total += bote.getQtdPessoas();
		}
		return total;
	}

	@Override
	public String verificaSeguranca() {
		String s = null;
		if (this.getQtdPessoas() <= this.contarCapacidadeDosBotes()) {
			s = "Está em condições adequadas de segurança";
		}
		else {
			if (this.dataInauguracao.isBefore(LocalDate.now())) {
				s = "CUIDADO: navio em perigo";
			}
			else {
				s = "ALERTA: navio necessitando de mais botes!";
			}
		}
		return s;
	}

}
