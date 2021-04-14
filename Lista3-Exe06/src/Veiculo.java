import java.time.LocalDate;
import java.util.ArrayList;

public class Veiculo {
	private String placa;
	private String modelo;
	private LocalDate dataAquisicao;
	private ArrayList<Manutencao> manutencoes = new ArrayList<>();
	
	
	public Veiculo(String placa, String modelo, LocalDate dataAquisicao) {
		super();
		this.setPlaca(placa);
		this.setModelo(modelo);
		this.setDataAquisicao(dataAquisicao);
	}
	
	public void addManutencao(Manutencao m) {
		this.manutencoes.add(m);
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		if (placa != null && (placa.length() == 7 || placa.length() == 8)) {
			this.placa = placa;
		}
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}
	public void setDataAquisicao(LocalDate dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	public int comparaCom(Veiculo outro) {
		float meuIndice = this.getIndiceSucateamento();
		float outroIndice = outro.getIndiceSucateamento();
		
		if (meuIndice > outroIndice) {
			return 10;
		}
		else if(meuIndice == outroIndice) {
			return 0;
		}
		else {
			return -10;
		}
	}

	public float getIndiceSucateamento() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
