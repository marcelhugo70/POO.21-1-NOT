import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfFrase;
	private JTextArea taSaida;
	private JScrollPane scrollPane;

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
		
		JLabel lblNewLabel = new JLabel("Digite a frase:");
		lblNewLabel.setBounds(10, 30, 95, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfFrase = new JTextField();
		tfFrase.setBounds(115, 27, 266, 20);
		frame.getContentPane().add(tfFrase);
		tfFrase.setColumns(10);
		
		JButton btnNewButton = new JButton("Processar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frase f = new Frase(tfFrase.getText());
				String[] resultado = f.separarPalavras();
				String[] resultadoNaMao = f.separarPalavrasNaMao();
				taSaida.setText(f.getFrase()+"\n\nPalavras:");
				for (int i=0; i < resultado.length; i++) {
					taSaida.append("\n"+resultado[i]+ " = "+resultado[i].length());
					taSaida.append("\n"+resultadoNaMao[i]+ " = "+resultadoNaMao[i].length());
				}
			}
		});
		btnNewButton.setBounds(115, 58, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(115, 106, 266, 144);
		frame.getContentPane().add(scrollPane);
		
		taSaida = new JTextArea();
		scrollPane.setViewportView(taSaida);
		taSaida.setEditable(false);
	}
}
