import java.time.LocalDate;

public class TelefoneResidencial extends Telefone{
	private String sInternet;
	
	
	public void SetInternet(String sInternet) {
		this.sInternet = sInternet;
	}
	

	public String GetInternet (){
		return this.sInternet;
	}
	
	public float GetValorFixo() {
		return 15.00f;
	}

}
