import java.util.HashMap;

public class Concessionaria {
	private HashMap<String, Telefone>   mapTelefones = new HashMap<>();
	
	public void AdicionaTelefone(Telefone telefone)
	{
		if (!mapTelefones.containsKey(telefone.GetNumero()))
				mapTelefones.put(telefone.GetNumero(), telefone);
	}
	
	public Telefone ConsultaDadosTelefone(String sNumero) {
			return mapTelefones.get(sNumero);
	}
	
	
	public float GetPotencialFaturamento() {
		float fFaturamento = 0;
		
		for (Telefone t : mapTelefones.values())
			fFaturamento += t.GetValorFixo();  // polimorfismo
		
		return fFaturamento;
	}
	
}
