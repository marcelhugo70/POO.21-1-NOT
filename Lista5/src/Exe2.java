import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Exe2 {

	public static void main(String[] args) {
		JFileChooser jfc = new JFileChooser();
		int retorno = jfc.showOpenDialog(null);
		if (retorno == JFileChooser.APPROVE_OPTION) {
			File arquivoOrigem = jfc.getSelectedFile();
			
			try {
				// TODO gerar o nome do arquivo de saída
				FileReader leitura = new FileReader(arquivoOrigem);
				FileWriter saida = new FileWriter("Saida.txt");
				
				int lido = leitura.read();
				while(lido != -1) {
					// TODO converter ou criptografar
					// TODO gravar em saida
					lido = leitura.read();
				}
				// fechar os arquivos
				leitura.close();
				saida.close();
			} catch (FileNotFoundException fnfe) {
				JOptionPane.showMessageDialog(null, "Arquivo de leitura não encontrado");
			} catch (IOException ioe) {
				JOptionPane.showMessageDialog(null, "Erro de gravação");
			}
		}
	}

}
