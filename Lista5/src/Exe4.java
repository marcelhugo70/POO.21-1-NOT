import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Exe4 {
	public static void main(String[] args) throws IOException {

		FileInputStream fis;
		BufferedInputStream bis;
		DataInputStream di = null;
		ArrayList<ClimaDoDia> dias = new ArrayList<>();
		JFileChooser jfc = new JFileChooser();
		int retorno = jfc.showOpenDialog(null);
		if (retorno == JFileChooser.APPROVE_OPTION) {
			File arquivoOrigem = jfc.getSelectedFile();
			try {
				// abro o arquivo binário para leitura
				fis = new FileInputStream(arquivoOrigem);
				bis = new BufferedInputStream(fis);
				di = new DataInputStream(bis);

				int velVento, indPluv;
				double temp;
				String data;
				char c1, c2;
				ClimaDoDia umDia = null;
				DateTimeFormatter formatador = DateTimeFormatter.ofPattern("d/M/yyyy");
				// processo o arquivo binário, lendo os dados e criando um objeto de
				// ClimaDoDia para cada dia, colocando-o num ArrayList
				while (true) {
					umDia = new ClimaDoDia();
					data = di.readUTF();
					umDia.setData(LocalDate.parse(data, formatador));
					c1 = di.readChar();
					c2 = di.readChar();
					umDia.setVentoDirecao("" + c1 + c2);
					velVento = di.readInt();
					umDia.setVentoVelocidade(velVento);
					indPluv = di.readInt();
					umDia.setIndicePluviometrico(indPluv);
					temp = di.readDouble();
					umDia.setTemperatura(temp);
					dias.add(umDia);
					System.out.println(data + " - " + c1 + c2 + " - " + velVento + " - " + indPluv + " - " + temp);
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (EOFException eof) {

			} catch (IOException e) {

			}
			System.out.println(dias);
			di.close();

			// gravar os objetos
			ObjectOutputStream oos = null;
			int mes, ano;
			mes = ano = 0;
			LocalDate data;
			String nomeArquivoAtual, nomeArquivoAnt = "";
			for (ClimaDoDia c : dias) {
				data = c.getData();
				ano = data.getYear();
				mes = data.getMonthValue();
				nomeArquivoAtual = ano + "-" + mes + ".dat";
				if (!nomeArquivoAtual.equals(nomeArquivoAnt)) {
					if (oos != null) {
						oos.close();
					}
					oos = new ObjectOutputStream(
							new BufferedOutputStream(
								new FileOutputStream(nomeArquivoAtual)));
					nomeArquivoAnt = nomeArquivoAtual;
				}
				oos.writeObject(c);
			}

			oos.close();
		}
	} // main
}
