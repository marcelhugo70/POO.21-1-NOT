import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exe1 {
	public static void main(String[] args) {
		try {
			// Gravação
			FileWriter fw = new FileWriter("MeuPrimeiroArquivoTexto.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("12345");
			bw.close();
			
			FileOutputStream fos = new FileOutputStream("MeuPrimeiroArquivoBinario.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(12345);
			dos.close();
			
			// Leitura como texto
			FileReader fr = new FileReader("MeuPrimeiroArquivoTexto.txt");
			BufferedReader br = new BufferedReader(fr);
			String leitura = br.readLine();
			System.out.println("Leitura texto do arquivo texto:"+leitura);
			br.close();
			
			fr = new FileReader("MeuPrimeiroArquivoBinario.dat");
			br = new BufferedReader(fr);
			leitura = br.readLine();
			System.out.println("Leitura texto do arquivo binário:"+leitura);
			br.close();
			
			// Leitura como binário
			FileInputStream fis = new FileInputStream("MeuPrimeiroArquivoTexto.txt");
			DataInputStream dis = new DataInputStream(fis);
			int lido = dis.readInt();
			System.out.println("Leitura em binário do arquivo texto:"+lido);
			dis.close();
			
			fis = new FileInputStream("MeuPrimeiroArquivoBinario.dat");
			dis = new DataInputStream(fis);
			lido = dis.readInt();
			System.out.println("Leitura em binário do arquivo binário:"+lido);
			dis.close();
			
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}
}
