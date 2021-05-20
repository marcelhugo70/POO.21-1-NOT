
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.DateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 *
 * @author marcel
 */
public class Apresentacao extends javax.swing.JFrame {

	private Camara camara = new Camara();
	private Partido pesquisado;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	/**
	 * Creates new form Apresentacao
	 */
	public Apresentacao() {
		initComponents();
	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		jLabel7 = new javax.swing.JLabel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jtfNumPartido = new javax.swing.JTextField();
		jtfNomePartido = new javax.swing.JTextField();
		jbCadastrarPartido = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jtfNomeVereador = new javax.swing.JTextField();
		jtfNumPartidoVereador = new javax.swing.JTextField();
		jtfNumPartidoVereador.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				int num = Integer.parseInt(jtfNumPartidoVereador.getText());
				pesquisado = camara.getPartido(num);
				String msg;
				if (pesquisado == null) {
					msg = "Número não encontrado";
					jbCadastrarVereador.setEnabled(false); // desabilita o botão de Cadastrar pois não pode inserir um
															// Vereador sem partido
				} else {
					msg = pesquisado.getNome();
					jbCadastrarVereador.setEnabled(true); // habilita o botão
				}
				jlNomePartido.setText(msg);
			}
		});

		jlNomePartido = new javax.swing.JLabel();
		jbCadastrarVereador = new javax.swing.JButton();
		jbCadastrarVereador.setEnabled(false);
		jPanel3 = new javax.swing.JPanel();
		jbMenorDesempenho = new javax.swing.JButton();
		jbMenorDesempenho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vereador menor = camara.getVereadorMenorDesempenho();
				String msg;
				if (menor == null) {
					msg = "Não há vereadores cadastrados";
				} else {
					msg = "Menor desempenho: " + menor.getNome() + " do partido " + menor.getPartido().getNome()
							+ " está com desempenho " + menor.getDesempenho();
				}
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		jbMaisProjetos = new javax.swing.JButton();
		jbMaisProjetos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vereador mais = camara.getVereadorMaisProjAprovados();
				String msg;
				if (mais == null) {
					msg = "Não há vereadores cadastrados";
				} else {
					msg = "Menor desempenho: " + mais.getNome() + " do partido " + mais.getPartido().getNome()
							+ " está com desempenho " + mais.getDesempenho();
				}
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		jLabel9 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jbEstatisticas = new javax.swing.JButton();
		jbEstatisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		jSeparator1 = new javax.swing.JSeparator();
		jbTotalProjetos = new javax.swing.JButton();
		jbVereadoresAcimaMedia = new javax.swing.JButton();

		jLabel7.setText("jLabel7");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Lista 3 - Exercício 5");

		jLabel1.setText("Número:");

		jLabel2.setText("Nome:");

		jbCadastrarPartido.setText("Cadastrar");
		jbCadastrarPartido.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jbCadastrarPartido)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jtfNumPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jtfNomePartido, javax.swing.GroupLayout.PREFERRED_SIZE,
														177, javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(153, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1)
								.addComponent(jtfNumPartido, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(jtfNomePartido,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(28, 28, 28).addComponent(jbCadastrarPartido).addContainerGap(139, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Partido", jPanel1);

		jLabel3.setText("Nome: ");

		jLabel4.setText("Número do partido:");

		jbCadastrarVereador.setText("Cadastrar");
		jbCadastrarVereador.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout
								.createParallelGroup(Alignment.LEADING, false)
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel3)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(jtfNomeVereador,
												GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel4)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(jtfNumPartidoVereador, GroupLayout.PREFERRED_SIZE, 35,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(jlNomePartido, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(132)
										.addComponent(jbCadastrarVereador)))
						.addContainerGap(63, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(19)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel3)
										.addComponent(jtfNomeVereador, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel4)
										.addComponent(jtfNumPartidoVereador, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jlNomePartido, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
								.addGap(90).addComponent(jbCadastrarVereador).addGap(70)));
		jPanel2.setLayout(jPanel2Layout);

		jTabbedPane1.addTab("Vereador", jPanel2);

		jbMenorDesempenho.setText("Vereador menor desempenho");

		jbMaisProjetos.setText("Vereador com mais proj. aprovados");

		jLabel9.setText("Número do partido:");

		jbEstatisticas.setText("Estatísticas do partido");

		jbTotalProjetos.setText("Total de projetos da Câmara");
		jbTotalProjetos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jbVereadoresAcimaMedia.setText("Vereadores acima da média");
		jbVereadoresAcimaMedia.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		panel = new JPanel();
		jTabbedPane1.addTab("Projetos", null, panel, null);
		panel.setLayout(null);

		jcbVereador = new JComboBox<>();
		jcbVereador.setBounds(169, 11, 196, 22);
		panel.add(jcbVereador);

		JLabel lblNewLabel = new JLabel("Selecione o vereador:");
		lblNewLabel.setBounds(10, 15, 133, 14);
		panel.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("T\u00EDtulo do projeto:");
		lblNewLabel_1.setBounds(10, 50, 95, 14);
		panel.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(118, 47, 202, 20);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(161, 78, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Data de Apresenta\u00E7\u00E3o:");
		lblNewLabel_2.setBounds(10, 81, 133, 14);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Data de Aprova\u00E7\u00E3o:");
		lblNewLabel_3.setBounds(10, 115, 116, 14);
		panel.add(lblNewLabel_3);

		textField_2 = new JTextField();
		textField_2.setBounds(161, 109, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Nro Projeto:");
		lblNewLabel_4.setBounds(10, 150, 95, 14);
		panel.add(lblNewLabel_4);

		textField_3 = new JTextField();
		textField_3.setBounds(161, 140, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Artigo LDO:");
		lblNewLabel_5.setBounds(10, 185, 95, 14);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Qtd votos:");
		lblNewLabel_6.setBounds(10, 220, 95, 14);
		panel.add(lblNewLabel_6);

		textField_4 = new JTextField();
		textField_4.setBounds(161, 182, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(161, 217, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);

		JButton btnIncluirProjeto = new JButton("OK");
		btnIncluirProjeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Vereador v = (Vereador) jcbVereador.getSelectedItem();
					if (v == null) {
						JOptionPane.showMessageDialog(null, "Selecione um vereador");
					} else {
						ProjetoDeLei proj = null;
						LocalDate dApres = LocalDate.parse(textField_1.getText(), formatter);
						LocalDate dAprov = null;
						/*
						 * if (!textField_2.getText().isEmpty()) { 
						 * 		dAprov = LocalDate.parse(textField_2.getText(), formatter); 
						 * }
						 */
						try {
							dAprov = LocalDate.parse(textField_2.getText(), formatter);
						} catch (DateTimeException exc) {
							dAprov = null;
						}

						if (textField_4.getText().isEmpty() || textField_5.getText().isEmpty()) {
							proj = new ProjetoDeLei(textField.getText(),dApres,dAprov,Integer.parseInt(textField_3.getText()));
						} else {
							proj = new ProjetoDeLeiComplementar(textField.getText(),dApres,dAprov,Integer.parseInt(textField_3.getText()),
													textField_4.getText(),Integer.parseInt(textField_4.getText()));
						}
						v.addProjeto(proj);
					}
				} catch (IllegalArgumentException iae) {
					JOptionPane.showMessageDialog(null, iae.getMessage());
				}
			}
		});
		btnIncluirProjeto.setBounds(276, 216, 89, 23);
		panel.add(btnIncluirProjeto);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jSeparator1)
								.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel9)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(jbEstatisticas)
										.addGap(0, 41, Short.MAX_VALUE)))
						.addContainerGap())
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jbMenorDesempenho).addComponent(jbMaisProjetos)
								.addComponent(jbTotalProjetos).addComponent(jbVereadoresAcimaMedia))
						.addGap(0, 0, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel9)
								.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbEstatisticas)).addGap(13, 13, 13)
								.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jbMenorDesempenho).addGap(18, 18, 18).addComponent(jbMaisProjetos)
								.addGap(18, 18, 18).addComponent(jbTotalProjetos).addGap(18, 18, 18)
								.addComponent(jbVereadoresAcimaMedia).addContainerGap(45, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Consultas", jPanel3);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(jTabbedPane1).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(jTabbedPane1).addGap(28, 28, 28)));

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		try {
			Partido partido = new Partido();
			partido.setNome(jtfNomePartido.getText());
			partido.setNumero(Integer.parseInt(jtfNumPartido.getText()));
			camara.addPartido(partido);
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(this, "Número do partido está inválido. Redigite");
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Vereador vereador = new Vereador();
			vereador.setNome(jtfNomeVereador.getText());
			pesquisado.addVereador(vereador);
			String msg = "Vereador " + vereador.getNome() + " do partido " + vereador.getPartido().getNome()
					+ " está com desempenho " + vereador.getDesempenho();
			JOptionPane.showMessageDialog(this, msg);
			jcbVereador.addItem(vereador);
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(this,
					"Formato da quantidade está inválido" + nfe.getMessage() + ". Redigite");
		} catch (IllegalArgumentException iae) {
			JOptionPane.showMessageDialog(this, iae.getMessage());
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		String msg = "CÂMARA\n\nTotal de projetos apresentados: " + camara.getTotalProjApresentados()
				+ "\nTotal de projetos aprovados:" + camara.getTotalProjAprovados();
		JOptionPane.showMessageDialog(this, msg);
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		String msg = "Vereadores acima da média:" + camara.getMediaDesempenho();
		ArrayList<Vereador> lista = camara.getVereadoresAcimaMedia();
		for (Vereador v : lista) {
			msg += "\nVereador " + v.getNome() + " do partido " + v.getPartido().getNome() + " com desempenho "
					+ v.getDesempenho();
		}
		JOptionPane.showMessageDialog(this, msg);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Apresentacao().setVisible(true);
			}
		});
	}

	// Variables declaration
	private javax.swing.JButton jbCadastrarPartido;
	private javax.swing.JButton jbCadastrarVereador;
	private javax.swing.JButton jbMenorDesempenho;
	private javax.swing.JButton jbMaisProjetos;
	private javax.swing.JButton jbEstatisticas;
	private javax.swing.JButton jbTotalProjetos;
	private javax.swing.JButton jbVereadoresAcimaMedia;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jlNomePartido;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField jtfNumPartido;
	private javax.swing.JTextField jtfNomePartido;
	private javax.swing.JTextField jtfNomeVereador;
	private javax.swing.JTextField jtfNumPartidoVereador;
	private javax.swing.JTextField jTextField7;
	private JPanel panel;
	private JComboBox<Vereador> jcbVereador;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
}
