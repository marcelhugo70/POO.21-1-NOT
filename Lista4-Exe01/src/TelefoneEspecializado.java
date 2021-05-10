import java.time.LocalDate;

public class TelefoneEspecializado extends Telefone {
	private int iQtdOcorrencias;

	public void SetQtdOcorrencias(int iQtdOcorrencias) {
		this.iQtdOcorrencias = iQtdOcorrencias;
	}


	public int GetQtdOcorrencias() {
		return this.iQtdOcorrencias;
	}

	public float GetValorFixo() {

		if (this.iQtdOcorrencias > 0 && this.iQtdOcorrencias <= 1000)
			return 50.00f;
		else if (this.iQtdOcorrencias > 1000 && this.iQtdOcorrencias <= 5000)
			return 67.80f;
		else if (this.iQtdOcorrencias > 5000 && this.iQtdOcorrencias <= 10000)
			return 98.50f;
		else if (this.iQtdOcorrencias > 10000 && this.iQtdOcorrencias <= 50000)
			return 125.90f;
		else if (this.iQtdOcorrencias > 50000)
			return 187.82f;

		return 0;
	}

}
