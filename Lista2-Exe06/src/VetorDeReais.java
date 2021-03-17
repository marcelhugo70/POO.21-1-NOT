
public class VetorDeReais {
	private double[] vetor;

	public VetorDeReais(int tamanho) {
		this.vetor = new double[tamanho];
	}

	// item a
	public void setValor(double valor, int posicao) {
		this.vetor[posicao] = valor;
	}

	// item b
	public int getQuantidadePares() {
		int contador = 0;
		int numero;
		for (int i = 0; i < this.vetor.length; i++) {
			numero = (int) this.vetor[i]; // pegando a parte inteira do número
			if (numero % 2 == 0) { // é par?
				contador++;
			}
		}
		return contador;
	}

	// item c
	public VetorDeReais dividir(VetorDeReais outro) {
		if (this.getTamanho() != outro.getTamanho()) {
			return null;
		}
		VetorDeReais novo = new VetorDeReais(this.vetor.length);
		double valor;
		for (int i = 0; i < this.vetor.length; i++) {
			valor = this.getValor(i) / outro.getValor(i); // outro.vetor[i] = quebra de encapsulamento
			novo.setValor(valor, i);
			// novo.vetor[i] = valor; // isto seria quebra do encapsulamento
		}
		return novo;
	}

	public double getValor(int posicao) {
		return this.vetor[posicao];
	}

	public int getTamanho() {
		return this.vetor.length;
	}

	// item d
	public double multiplicar(VetorDeReais outro) {
		if (this.getTamanho() != outro.getTamanho()) {
			return Double.MIN_VALUE;
		}
		double m = 0;
		for (int i = 0, j = this.vetor.length - 1; i < this.vetor.length; i++, j--) {
			m += this.getValor(i) * outro.getValor(j);
		}
		return m;
	}

	// item e
	public void inverter() {
		double valorVetorI, valorVetorJ;
		for (int i = 0, j = this.vetor.length - 1; 
				 i < this.vetor.length / 2; i++, j--) {
			valorVetorI = this.vetor[i];
			valorVetorJ = this.vetor[j];
			this.vetor[i] = valorVetorJ;
			this.vetor[j] = valorVetorI;
		}
	}
	
	// item f
	public double getMaiorDiferenca() {
		double maiorDif = 0, dif = 0;
		for (int i = 0; i < this.vetor.length - 1; i++) {
			dif = Math.abs(this.vetor[i]-this.vetor[i+1]);
			if (dif > maiorDif) {
				maiorDif = dif;
			}
		}
		return maiorDif;
	}
}
