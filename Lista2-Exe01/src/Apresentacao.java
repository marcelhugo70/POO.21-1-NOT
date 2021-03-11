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
	private JTextField tfNome;
	private JLabel lblNewLabel_1;
	private JTextField tfCPF;
	private JLabel lblNewLabel_2;
	private JTextField tfUF;
	private JLabel lblNewLabel_3;
	private JTextField tfRenda;
	private JButton btnCadastrar;
	private Contribuinte[] vetorContrib = new Contribuinte[50];
	private int indiceVetor = 0;
	private JTextField tfConsulta;
	private JLabel lblNewLabel_4;
	private JButton btnConsulta;

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
		
		JLabel lblNewLabel = new JLabel("Nome do CONTRIBUINTE:");
		lblNewLabel.setBounds(10, 26, 134, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfNome = new JTextField();
		tfNome.setBounds(145, 23, 194, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(10, 62, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(66, 59, 134, 20);
		frame.getContentPane().add(tfCPF);
		tfCPF.setColumns(10);
		
		lblNewLabel_2 = new JLabel("UF:");
		lblNewLabel_2.setBounds(10, 101, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tfUF = new JTextField();
		tfUF.setBounds(66, 98, 36, 20);
		frame.getContentPane().add(tfUF);
		tfUF.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Renda anual (R$):");
		lblNewLabel_3.setBounds(10, 136, 102, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tfRenda = new JTextField();
		tfRenda.setBounds(122, 133, 86, 20);
		frame.getContentPane().add(tfRenda);
		tfRenda.setColumns(10);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Contribuinte c = new Contribuinte(tfNome.getText(), 
												  tfCPF.getText(), 
												  tfUF.getText(), 
												  Double.parseDouble(tfRenda.getText()));
				double imposto = c.getImpostoAPagar();
				JOptionPane.showMessageDialog(frame, "Imposto a pagar = R$"+imposto);
				vetorContrib[indiceVetor] = c;
				indiceVetor++;
			}
		});
		btnCadastrar.setBounds(235, 132, 89, 23);
		frame.getContentPane().add(btnCadastrar);
		
		tfConsulta = new JTextField();
		tfConsulta.setBounds(253, 215, 86, 20);
		frame.getContentPane().add(tfConsulta);
		tfConsulta.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Digite o valor do imposto a consultar:");
		lblNewLabel_4.setBounds(10, 218, 233, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		btnConsulta = new JButton("OK");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double imposto = Double.parseDouble(tfConsulta.getText());
				for (int i=0; i < indiceVetor; i++) {
					if (vetorContrib[i].getImpostoAPagar() >= imposto) {
						String str = "Contribuinte: "+vetorContrib[i].getNome()
									+ "\nCPF:"+vetorContrib[i].getCpf()
									+ "\nUF:"+vetorContrib[i].getUf()
									+ "\nRenda Anual:"+vetorContrib[i].getRendaAnual()
									+ "\nImposto:"+vetorContrib[i].getImpostoAPagar();
						JOptionPane.showMessageDialog(frame, str);
					}
				}
			}
		});
		btnConsulta.setBounds(351, 214, 73, 23);
		frame.getContentPane().add(btnConsulta);
	}
}
