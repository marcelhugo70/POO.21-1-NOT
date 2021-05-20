public class BoteSalvaVidas extends Embarcacao {

	private boolean inflavel;
	private int qtdRemos;
	private int qtdColetes;

	public BoteSalvaVidas(String registroCapitania, int qtdPessoas, boolean inflavel, int qtdRemos, int qtdColetes) {
		super(registroCapitania, qtdPessoas);
		this.setInflavel(inflavel);
		this.setQtdRemos(qtdRemos);
		this.setQtdColetes(qtdColetes);
	}

	public boolean isInflavel() {
		return inflavel;
	}

	public void setInflavel(boolean inflavel) {
		this.inflavel = inflavel;
	}

	public int getQtdRemos() {
		return qtdRemos;
	}

	public void setQtdRemos(int qtdRemos) {
		if (qtdRemos < 0) {
			throw new IllegalArgumentException("Quantidade de remos deve ser maior que 0");
		}
		this.qtdRemos = qtdRemos;
	}

	public int getQtdColetes() {
		return qtdColetes;
	}

	public void setQtdColetes(int qtdColetes) {
		if (qtdColetes < 0) {
			throw new IllegalArgumentException("Quantidade de coletes deve ser maior que 0");
		}
		this.qtdColetes = qtdColetes;
	}

	@Override
	public String verificaSeguranca() {
		String msg = "Bote OK";
		int n = this.getQtdPessoas() - this.qtdColetes ;
		if (n > 0) {
			msg = "Insuficiência de "+n+" coletes salva-vidas";
		}
		return msg;
	}
}
