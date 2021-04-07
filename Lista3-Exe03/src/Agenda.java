import java.time.LocalDate;
import java.util.HashMap;

public class Agenda {
	// atributos
	private HashMap<LocalDate,DataAgenda> dias = new HashMap<>();

	// métodos
	public boolean addData(DataAgenda dia) {
		if (this.existeData(dia.getData())) {
			return false;
		}
		else {
			dias.put(dia.getData(), dia);
			return true;
		}
	}
	
	public boolean existeData(LocalDate data) {
		return dias.containsKey(data);
	}
	
	public Compromisso getMenorCompromisso() {
		Compromisso menor = null;
		for (DataAgenda da: dias.values()) {
			Compromisso comp = da.getMenorCompromisso();
			if (comp!= null && (menor == null || comp.getTempo() < menor.getTempo())) {
				menor = comp;
			}
		}
		return menor;
	}
}
