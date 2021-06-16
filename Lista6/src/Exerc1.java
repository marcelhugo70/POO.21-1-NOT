import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Exerc1 {

	public static void main(String[] args) {
		Veiculo a = new Veiculo("MJT-7432", "Fusca", 1912, "Pedro");
        Veiculo b = new Veiculo("MIT-8008", "Celta", 1999, "Douglas");
        Veiculo c = new Veiculo("MEI-4665", "Gol", 2002, "Carlos");
        Veiculo d = new Veiculo("MIO-6668", "Fusca", 1915, "Aline");
        Veiculo e = new Veiculo("DIO-3333", "Celta", 1999, "Fausto");
        Veiculo f = new Veiculo("PAO-6472", "C3", 2007, "Carolina");
        Veiculo g = new Veiculo("CAO-2890", "C4", 2012, "Kelvin");
        Veiculo h = new Veiculo("UVA-3939", "BMW", 2015, "Zé");
        Veiculo i = new Veiculo("OVO-0000", "Gol", 2000, "Joshua");
        Veiculo j = new Veiculo("ABC-1234", "Ferrari", 2015, "Marta");
        LinkedList<Veiculo> list = new LinkedList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        list.add(g);
        list.add(h);
        list.add(i);
        list.add(j);
        System.out.println("Lista dos veículos criados");
        System.out.println("Tamanho = "+list.size());
        System.out.print(list.toString()+"\n");

        list.remove(d);
        System.out.println("Tamanho = "+list.size());
        
        Veiculo deletado = list.remove(6); // retirando o sétimo elemento
        System.out.println("Tamanho = "+list.size());
        System.out.println("Deletado = "+deletado.toString());
        
        ListIterator<Veiculo> liv = list.listIterator(list.size());
        Veiculo antepenultimo = null;
        int contador = 0;
        while (liv.hasPrevious() && contador < 3) {
        	antepenultimo = liv.previous();
        	contador++;
        }
        liv.remove();
        System.out.println("Removido antepenultimo = "+antepenultimo.toString());
        
        System.out.println("Lista dos veículos após as remoções");
        System.out.println("Tamanho = "+list.size());
        System.out.print(list.toString()+"\n");
        
        //Collections.sort(list);
        list.sort(null);
        System.out.println("Lista dos veículos após ordenação natural");
        System.out.println("Tamanho = "+list.size());
        System.out.print(list.toString()+"\n");
        
        Comparator<Veiculo> compAnoPlaca = new Comparator<Veiculo>() {
        	@Override
        	public int compare(Veiculo v1, Veiculo v2) {
        		if (v1.getAno() > v2.getAno()) {
        			return 1;
        		} else if (v1.getAno() < v2.getAno()) {
        			return -1;
        		}
        		//return v1.compareTo(v2); // pois a ordem natural é a placa
        		return v1.getPlaca().compareTo(v2.getPlaca());
        	}
        };
        Collections.shuffle(list);  // embaralha
        list.sort(compAnoPlaca);
        System.out.println("Lista dos veículos ordenados por ano e placa");
        System.out.println("Tamanho = "+list.size());
        System.out.print(list.toString()+"\n");

        Comparator<Veiculo> compModeloAnoPlaca = new Comparator<Veiculo>() {
        	@Override
        	public int compare(Veiculo v1, Veiculo v2) {
        		int retorno = v1.getModelo().compareTo(v2.getModelo());
        		if (retorno == 0) {
        			return compAnoPlaca.compare(v1, v2);
        		}
        		else
        			return retorno;
        	}
        };
        Collections.shuffle(list);  // embaralha
        list.sort(compModeloAnoPlaca);
        System.out.println("Lista dos veículos ordenados por modelo, ano e placa");
        System.out.println("Tamanho = "+list.size());
        System.out.print(list.toString()+"\n");
        
	}

}
