import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfTamanho;
	private JTextField tfValor;
	private JTextField tfPosicao;
	private VetorDeReais umObjetoVetor, segundoObjetoVetor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tamanho do vetor:");
		lblNewLabel.setBounds(10, 11, 117, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfTamanho = new JTextField();
		tfTamanho.setBounds(137, 8, 47, 20);
		frame.getContentPane().add(tfTamanho);
		tfTamanho.setColumns(10);
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int tam = Integer.parseInt(tfTamanho.getText());
				umObjetoVetor = new VetorDeReais(tam);
			}
		});
		btnCriar.setBounds(201, 7, 89, 23);
		frame.getContentPane().add(btnCriar);
		
		JLabel lblNewLabel_1 = new JLabel("Valor:");
		lblNewLabel_1.setBounds(10, 60, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfValor = new JTextField();
		tfValor.setBounds(66, 57, 86, 20);
		frame.getContentPane().add(tfValor);
		tfValor.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Posi\u00E7\u00E3o:");
		lblNewLabel_2.setBounds(162, 60, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tfPosicao = new JTextField();
		tfPosicao.setBounds(218, 57, 86, 20);
		frame.getContentPane().add(tfPosicao);
		tfPosicao.setColumns(10);
		
		JButton tfOK = new JButton("OK");
		tfOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				umObjetoVetor.setValor(Double.parseDouble(tfValor.getText()),
										Integer.parseInt(tfPosicao.getText()));		
			}
		});
		tfOK.setBounds(314, 56, 89, 23);
		frame.getContentPane().add(tfOK);
		
		JButton btnPares = new JButton("Quantos pares?");
		btnPares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int qtde = umObjetoVetor.getQuantidadePares();
				JOptionPane.showMessageDialog(frame,"Quantidade de pares:"+qtde);
			}
		});
		btnPares.setBounds(10, 227, 127, 23);
		frame.getContentPane().add(btnPares);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				segundoObjetoVetor = umObjetoVetor;
			}
		});
		btnGuardar.setBounds(314, 7, 89, 23);
		frame.getContentPane().add(btnGuardar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VetorDeReais resultante = umObjetoVetor.dividir(segundoObjetoVetor);
				String str = "REsultado da divisão:";
				for (int i=0; i < resultante.getTamanho(); i++) {
					str += "\n["+i+"] = "+resultante.getValor(i);
				}
				JOptionPane.showMessageDialog(frame, str);
			}
		});
		btnDividir.setBounds(150, 227, 89, 23);
		frame.getContentPane().add(btnDividir);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double resultante = umObjetoVetor.multiplicar(segundoObjetoVetor);
				String str = "REsultado da multiplicação:"+resultante;
				JOptionPane.showMessageDialog(frame, str);
			}
		});
		btnMultiplicar.setBounds(246, 227, 89, 23);
		frame.getContentPane().add(btnMultiplicar);
	}
}
