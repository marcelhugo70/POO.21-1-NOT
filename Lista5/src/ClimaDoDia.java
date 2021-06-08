import java.io.Serializable;
import java.time.LocalDate;

public class ClimaDoDia implements Serializable{
	private LocalDate data;
	private String ventoDirecao;
	private int ventoVelocidade;
	private double temperatura;
	private int indicePluviometrico;
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getVentoDirecao() {
		return ventoDirecao;
	}
	public void setVentoDirecao(String ventoDirecao) {
		this.ventoDirecao = ventoDirecao;
	}
	public int getVentoVelocidade() {
		return ventoVelocidade;
	}
	public void setVentoVelocidade(int ventoVelocidade) {
		this.ventoVelocidade = ventoVelocidade;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public int getIndicePluviometrico() {
		return indicePluviometrico;
	}
	public void setIndicePluviometrico(int indicePluviometrico) {
		if (indicePluviometrico < 0) {
			throw new IllegalArgumentException("Indice pluviométrico abaixo de zero - inválido.");
		}
		this.indicePluviometrico = indicePluviometrico;
	}
	@Override
	public String toString() {
		return "ClimaDoDia [data=" + data + ", ventoDirecao=" + ventoDirecao + ", ventoVelocidade=" + ventoVelocidade
				+ ", temperatura=" + temperatura + ", indicePluviometrico=" + indicePluviometrico + "]";
	}
	
	
}
