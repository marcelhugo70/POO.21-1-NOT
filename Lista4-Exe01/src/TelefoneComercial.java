import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class TelefoneComercial extends Telefone{
	private String sRamo;
	
	
	public void SetRamo(String sRamo) {
		this.sRamo = sRamo;
	}
	
	public float GetValorFixo() {
		ChronoLocalDate dtLimite;
		dtLimite = LocalDate.of(2017, 1, 1);
		
		if (this.GetDataInstalacao().isAfter(dtLimite))
			return 37.50f;
		
		return 25.00f;
	}

}
