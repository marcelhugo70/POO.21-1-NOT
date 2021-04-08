import java.util.ArrayList;

public class Partido {
	private String nome;
	private int numero;
	private ArrayList<Vereador> vereadores = new ArrayList<>();
	
	public void addVereador(Vereador v) {
		if (v != null) {
			vereadores.add(v);
			v.setPartido(this);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero >= 10 && numero < 100) {
			this.numero = numero;
		}
	}

}
