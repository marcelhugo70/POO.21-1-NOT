import java.time.LocalDate;

public abstract class Telefone {
	private String sNome;
	private String sEndereco;
	private LocalDate dtInstalacao;
	private String sNumero;
	
	public void SetNome(String sNome) {
		this.sNome = sNome;
	}
	
	public void SetEndereco(String sEndereco) {
		this.sEndereco = sEndereco;
	}
	
	public void SetDataInstalacao(LocalDate dtInstalacao) {
		this.dtInstalacao = dtInstalacao;
	}
	
	public void SetNumero(String sNumero) {
		if (sNumero.length() == 10) {
			try {
				long num = Long.parseLong(sNumero);
				this.sNumero = sNumero;
			} catch (NumberFormatException nfe) {
				throw new IllegalArgumentException("Número só pode conter dígitos.");
			}
		}
		else {
			throw new IllegalArgumentException("Número deve conter 10 dígitos.");
		}
	}
	
	
	public String GetNumero() {
		return this.sNumero;
	}
	
	public String GetEndereco(){
		return this.sEndereco;
	}
	
	public LocalDate GetDataInstalacao(){
		return this.dtInstalacao;
	}
	
	public String GetNome(){
		return this.sNome;
	}
	
	public abstract float GetValorFixo();
	
}
