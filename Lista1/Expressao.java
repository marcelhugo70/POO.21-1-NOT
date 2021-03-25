
public class Expressao {
	private String expArit;
	
	public Expressao(String exp) {
		this.expArit = exp;
	}
	
	public boolean estaCorretaSintaticamente() {
		return false;
	}
	
	// (a+10)/(23*(10.5-b)-2.59/(b*a))
	public int getQtdeDivisores() {
		int soma = 0;
		for (int i=0; i < expArit.length(); i++) {
			if (expArit.charAt(i) == '/') {
				soma++;
			}
		}
		return soma;
	}
	
	public int getPosicaoOperador() {
		char c;
		for (int i=0; i < expArit.length(); i++) {
			c = expArit.charAt(i);
			if (c == '/' || c == '*' || c == '-' || c == '+') {
				return i;
			}
		}
		return -1;
	}
	
	// (a+10)/(23*(10.5-b)-2.59/(b*a))
	//posicao[0] = 2
	//posicao[1] = 16
	//posicao[2] = -1
	//posicao[3] = 10

	public int getPosicaoOperador2() {
		int[] posicao = new int[4];
		posicao[0] = expArit.indexOf("+");
		posicao[1] = expArit.indexOf("-");
		posicao[2] = expArit.indexOf("/");
		posicao[3] = expArit.indexOf("*");
		int menor = Integer.MAX_VALUE;
		for (int i=0; i<posicao.length; i++) {
			if (posicao[i] != -1) {
				if (posicao[i] < menor) {
					menor = posicao[i];
				}
			}
		}
		if (menor == Integer.MAX_VALUE)
			return -1;
		else
			return menor;
	}
}
