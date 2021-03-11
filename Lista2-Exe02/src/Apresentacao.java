import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfFrase;

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
		btnNewButton.setBounds(115, 58, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea taSaida = new JTextArea();
		taSaida.setEditable(false);
		taSaida.setBounds(115, 106, 266, 144);
		frame.getContentPane().add(taSaida);
	}
}
