
public class Frase {

	private String texto;
	
	public Frase(String text) {
		this.texto = text;
	}
	
	public String[] separarPalavras() {
		String[] vetor;
		vetor = texto.split(" ");
		return vetor;
	}

	public String[] separarPalavrasNaMao() {
		String[] vetor = new String[texto.length()/2];
		int indice = 0;
		String palavra = "";
		for (int i=0; i < texto.length(); i++) {
			if (texto.charAt(i) == ' ') {
				vetor[indice] = palavra;
				indice++;
				palavra="";
			}
			else {
				palavra += texto.charAt(i);
			}
		}
		vetor[indice] = palavra; // última palavra que estava sendo formada
		return vetor;
	}

	
	public String getFrase() {
		return this.texto;
	}
}
