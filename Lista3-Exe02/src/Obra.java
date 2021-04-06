
public class Obra {
	private String titulo;
	private String autor;
	private Parecer[] pareceres = new Parecer[3];
	private int indParecer;
	
	public Obra(String titulo, String autor) {
		super();
		this.setTitulo(titulo);
		this.setAutor(autor);
	}

	public void addParecer(Parecer p) {
		if (indParecer < pareceres.length) {
			pareceres[indParecer] = p;
			indParecer++;
		}
	}
	
	public int getQtdePareceres() {
		return this.indParecer;
	}
	
	public Parecer getParecer(int nro) {
		return this.pareceres[nro];
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
