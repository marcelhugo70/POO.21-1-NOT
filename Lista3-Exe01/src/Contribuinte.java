
public class Contribuinte {
	// atributos
	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;

	
	// construtor
	public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setUf(uf);
		this.setRendaAnual(rendaAnual);
	}

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getUf() {
		return this.uf;
	}

	public double getRendaAnual() {
		return this.rendaAnual;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setUf(String uf) {
		if (uf.equals("RS") || uf.equals("SC") || uf.equals("PR")) {
			this.uf = uf;
		}
	}

	public void setRendaAnual(double rendaAnual) {
		if (rendaAnual >= 0) {
			this.rendaAnual = rendaAnual;
		}
	}

	public double getImpostoAPagar() {
		return this.getRendaAnual() * this.getAliquota();
	}
	
	public double getAliquota() {
		if (this.getRendaAnual() <= 4000) {
			return 0;
		} else if (this.getRendaAnual() <= 9000) {
			return 0.058; // 5,8%
		} else if (this.getRendaAnual() <= 25000) {
			return 0.15;
		} else if (this.getRendaAnual() <= 35000) {
			return 0.275;
		} else {
			return 0.3;
		}
	}

}
