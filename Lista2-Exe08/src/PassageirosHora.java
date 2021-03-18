
public class PassageirosHora {

	private int[][][] matriz = new int[12][30][24]; // 12 meses x 30 dias x 24 horas
	// índices: 0 a 11; 0 a 29; 0 a 23

	public void adiciona(int dia, int mes, int hora) {
		// this.matriz[mes-1][dia-1][hora] = this.matriz[mes-1][dia-1][hora] + 1;
		this.matriz[mes - 1][dia - 1][hora]++;
	}

	public int quantosPassageiros(int dia, int mes) {
		int passageiros = 0;
		mes--;
		dia--; // para ajustar o valor natural ao índice da matriz
		for (int i = 0; i < 24; i++) {
			passageiros += matriz[mes][dia][i];
		}
		return passageiros;
	}

	public int mesMenorFluxo() {
		// TODO
		return 0;
	}

	public int[] picoTransporte() {
		// TODO
		return null;
	}
}
