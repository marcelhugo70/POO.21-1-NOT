// Solução criada a partir de soluções apresentadas para o exercício de preparação
// da Unidade 7 - Herança.

// Algum detalhe de interface com usuário pode não estar funcionando, 
//	pois nem todos os requisitos foram checados. 

import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Apresentacao extends javax.swing.JFrame {
	
	private Concessionaria concessionaria = new Concessionaria();
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

		jLabel7.setText("jLabel7");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Concessionaria");
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setColumns(10);
		
		textFieldDataInstalacao = new JTextField();
		textFieldDataInstalacao.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero:");
		
		textFieldNumero = new JTextField();
		textFieldNumero.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Data Instala\u00E7\u00E3o:");
		
		JLabel lblCapacidade = new JLabel("Endere\u00E7o:");
		
		lblNewLabel_2 = new JLabel("Nome:");
		
		JButton btnNewButtonResidencial = new JButton("Cadastrar");
		btnNewButtonResidencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jButtonResidencialActionPerformed(e);
			}
		});
		
		JLabel lblConexoInternet = new JLabel("Internet:");
		
		textFieldInternet = new JTextField();
		textFieldInternet.setColumns(10);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblCapacidade)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel)
						.addComponent(lblConexoInternet, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textFieldNumero)
							.addComponent(textFieldDataInstalacao)
							.addComponent(textFieldEndereco)
							.addComponent(textFieldNome))
						.addComponent(textFieldInternet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(254, Short.MAX_VALUE))
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap(363, Short.MAX_VALUE)
					.addComponent(btnNewButtonResidencial)
					.addContainerGap())
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCapacidade))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textFieldDataInstalacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(39)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblConexoInternet)
						.addComponent(textFieldInternet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addComponent(btnNewButtonResidencial)
					.addContainerGap())
		);
		jPanel1.setLayout(jPanel1Layout);
		
		jTabbedPane1.addTab("Telefone Residêncial", jPanel1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(jTabbedPane1).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(jTabbedPane1).addGap(28, 28, 28)));
		
		JPanel panel = new JPanel();
		jTabbedPane1.addTab("Telefone Comercial", null, panel, null);
		panel.setLayout(null);
		
		lblNewLabel_5 = new JLabel("Nome:");
		lblNewLabel_5.setBounds(10, 14, 31, 14);
		panel.add(lblNewLabel_5);
		
		textFieldNome2 = new JTextField();
		textFieldNome2.setBounds(114, 11, 86, 20);
		textFieldNome2.setColumns(10);
		panel.add(textFieldNome2);
		
		lblCapacidade_1 = new JLabel("Endere\u00E7o:");
		lblCapacidade_1.setBounds(10, 45, 49, 14);
		panel.add(lblCapacidade_1);
		
		lblNewLabel_6 = new JLabel("Data Instala\u00E7\u00E3o:");
		lblNewLabel_6.setBounds(10, 79, 80, 14);
		panel.add(lblNewLabel_6);
		
		textFieldInstalacao2 = new JTextField();
		textFieldInstalacao2.setColumns(10);
		textFieldInstalacao2.setBounds(114, 73, 86, 20);
		panel.add(textFieldInstalacao2);
		
		textFieldEndereco2 = new JTextField();
		textFieldEndereco2.setColumns(10);
		textFieldEndereco2.setBounds(114, 42, 86, 20);
		panel.add(textFieldEndereco2);
		
		textFieldNumero2 = new JTextField();
		textFieldNumero2.setColumns(10);
		textFieldNumero2.setBounds(114, 104, 86, 20);
		panel.add(textFieldNumero2);
		
		JLabel lblNewLabel_7 = new JLabel("N\u00FAmero:");
		lblNewLabel_7.setBounds(10, 107, 41, 14);
		panel.add(lblNewLabel_7);
		
		JButton btnNewButtonComercial = new JButton("Cadastrar");
		btnNewButtonComercial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jButtonComercialActionPerformed(e);
			}
		});
		btnNewButtonComercial.setBounds(353, 145, 81, 23);
		panel.add(btnNewButtonComercial);
		
		lblNewLabel_11 = new JLabel("Ramo:");
		lblNewLabel_11.setBounds(10, 135, 46, 14);
		panel.add(lblNewLabel_11);
		
		textFieldRamRamo = new JTextField();
		textFieldRamRamo.setBounds(114, 132, 86, 20);
		panel.add(textFieldRamRamo);
		textFieldRamRamo.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		jTabbedPane1.addTab("Telefone Especializado", null, panel_1, null);
		panel_1.setLayout(null);
		
		lblNewLabel_8 = new JLabel("Nome:");
		lblNewLabel_8.setBounds(10, 14, 31, 14);
		panel_1.add(lblNewLabel_8);
		
		lblCapacidade_2 = new JLabel("Endere\u00E7o:");
		lblCapacidade_2.setBounds(10, 45, 49, 14);
		panel_1.add(lblCapacidade_2);
		
		lblNewLabel_9 = new JLabel("Data Instala\u00E7\u00E3o:");
		lblNewLabel_9.setBounds(10, 79, 80, 14);
		panel_1.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("N\u00FAmero:");
		lblNewLabel_10.setBounds(10, 107, 41, 14);
		panel_1.add(lblNewLabel_10);
		
		textFieldNumero3 = new JTextField();
		textFieldNumero3.setColumns(10);
		textFieldNumero3.setBounds(114, 104, 86, 20);
		panel_1.add(textFieldNumero3);
		
		textFieldInstalacao3 = new JTextField();
		textFieldInstalacao3.setColumns(10);
		textFieldInstalacao3.setBounds(114, 73, 86, 20);
		panel_1.add(textFieldInstalacao3);
		
		textFieldEndereco3 = new JTextField();
		textFieldEndereco3.setColumns(10);
		textFieldEndereco3.setBounds(114, 42, 86, 20);
		panel_1.add(textFieldEndereco3);
		
		textFieldNome3 = new JTextField();
		textFieldNome3.setColumns(10);
		textFieldNome3.setBounds(114, 11, 86, 20);
		panel_1.add(textFieldNome3);
		
		btnNewButtonEspecializado = new JButton("Cadastrar");
		btnNewButtonEspecializado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jButtonEspecializadoActionPerformed(e);
			}
		});
		btnNewButtonEspecializado.setBounds(353, 145, 81, 23);
		panel_1.add(btnNewButtonEspecializado);
		
		textFieldQtdOcorrencias = new JTextField();
		textFieldQtdOcorrencias.setBounds(114, 135, 86, 20);
		panel_1.add(textFieldQtdOcorrencias);
		textFieldQtdOcorrencias.setColumns(10);
		
		lblNewLabel_12 = new JLabel("Qtd. Ocorrencias:");
		lblNewLabel_12.setBounds(10, 132, 80, 14);
		panel_1.add(lblNewLabel_12);
		
		panel_2 = new JPanel();
		jTabbedPane1.addTab("Consultas", null, panel_2, null);
		panel_2.setLayout(null);
		
		lblNewLabel_13 = new JLabel("N\u00FAmero do telefone");
		lblNewLabel_13.setBounds(10, 14, 117, 14);
		panel_2.add(lblNewLabel_13);
		
		textFieldNumeroTelefone = new JTextField();
		textFieldNumeroTelefone.setColumns(10);
		textFieldNumeroTelefone.setBounds(255, 11, 86, 20);
		panel_2.add(textFieldNumeroTelefone);
		
		btnNewButtonConsulta = new JButton("Consultar");
		btnNewButtonConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jButtonConsultaActionPerformed(e);
			}
		});
		btnNewButtonConsulta.setBounds(340, 96, 89, 23);
		panel_2.add(btnNewButtonConsulta);
		
		textAreaConsulta = new JTextArea();
		textAreaConsulta.setBounds(10, 123, 419, 119);
		panel_2.add(textAreaConsulta);
		
		panel_3 = new JPanel();
		jTabbedPane1.addTab("Concession\u00E1ria", null, panel_3, null);
		panel_3.setLayout(null);
		
		btnNewButtonFaturamento = new JButton("Faturamento");
		btnNewButtonFaturamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jButtonFaturamentoActionPerformed(e);
			}
		});
		btnNewButtonFaturamento.setBounds(10, 22, 148, 23);
		panel_3.add(btnNewButtonFaturamento);
		
		lblNewLabel_15 = new JLabel("Faturamento:");
		lblNewLabel_15.setBounds(20, 71, 113, 14);
		panel_3.add(lblNewLabel_15);
		
		textFieldFaturamento = new JTextField();
		textFieldFaturamento.setEditable(false);
		textFieldFaturamento.setBounds(154, 68, 120, 20);
		panel_3.add(textFieldFaturamento);
		textFieldFaturamento.setColumns(10);
		
		pack();
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
	
	private void jButtonResidencialActionPerformed(java.awt.event.ActionEvent evt) {
		TelefoneResidencial telefoneResidencial = new TelefoneResidencial();
		
		telefoneResidencial.SetNome(textFieldNome.getText());
		telefoneResidencial.SetEndereco(textFieldEndereco.getText());
		telefoneResidencial.SetNumero(textFieldNumero.getText());
		telefoneResidencial.SetDataInstalacao(LocalDate.parse(textFieldDataInstalacao.getText(), formatter));
		
		if (!textFieldInternet.getText().toLowerCase().equals("não") && !textFieldInternet.getText().toLowerCase().equals("sim"))
			JOptionPane.showMessageDialog(this, "Informe sim ou não.");
		
		telefoneResidencial.SetInternet(textFieldInternet.getText());
		
		concessionaria.AdicionaTelefone(telefoneResidencial);
		
	}
	
	private void jButtonComercialActionPerformed(java.awt.event.ActionEvent evt) {
		TelefoneComercial telefoneComercial = new TelefoneComercial();
		telefoneComercial.SetNome(textFieldNome2.getText());
		telefoneComercial.SetEndereco(textFieldEndereco2.getText());
		telefoneComercial.SetNumero(textFieldNumero2.getText());
		telefoneComercial.SetDataInstalacao(LocalDate.parse(textFieldInstalacao2.getText(), formatter));
		telefoneComercial.SetRamo(textFieldRamRamo.getText());
		
		concessionaria.AdicionaTelefone(telefoneComercial);
	}
	
	private void jButtonEspecializadoActionPerformed(java.awt.event.ActionEvent evt) {
		TelefoneEspecializado telefoneEspecializado = new TelefoneEspecializado();
		
		telefoneEspecializado.SetNome(textFieldNome3.getText());
		telefoneEspecializado.SetEndereco(textFieldEndereco3.getText());
		telefoneEspecializado.SetNumero(textFieldNumero3.getText());
		telefoneEspecializado.SetDataInstalacao(LocalDate.parse(textFieldInstalacao3.getText(), formatter));
		telefoneEspecializado.SetQtdOcorrencias(Integer.parseInt(textFieldQtdOcorrencias.getText()));
		
		concessionaria.AdicionaTelefone(telefoneEspecializado);
	}
	
	private void jButtonConsultaActionPerformed(java.awt.event.ActionEvent evt) {
			
		String sMsg;
		
		if (!textFieldNumeroTelefone.getText().isEmpty())
		{
			Telefone telefone = concessionaria.ConsultaDadosTelefone(textFieldNumeroTelefone.getText());
			
			if (telefone == null)
			{
				JOptionPane.showMessageDialog(this, "Número não encontrado.");
				return;
			}
			
			sMsg = "Nome do usuário: " + telefone.GetNome() + System.lineSeparator();
			sMsg += "Endereço Instalação: " + telefone.GetEndereco() + System.lineSeparator();
			sMsg += "Data Instalação: " + telefone.GetDataInstalacao().toString() + System.lineSeparator();
			sMsg += "Número telefone: " + telefone.GetNumero() + System.lineSeparator();
			sMsg += "Valor a pagar:  " + String.valueOf(telefone.GetValorFixo()) + System.lineSeparator();
			//sMsg += "Ramo de Atividade:  " + telefoneComercial.GetRamo() + System.lineSeparator();
			
		}
		else 
			sMsg = "Digite um número de telefone para consultar";
			
		textAreaConsulta.setText(sMsg);
	}
	
	private void jButtonFaturamentoActionPerformed(java.awt.event.ActionEvent evt) {
		
		textFieldFaturamento.setText(String.valueOf(concessionaria.GetPotencialFaturamento()));
	}
	
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private JTextField textFieldNome;
	private JTextField textFieldEndereco;
	private JTextField textFieldDataInstalacao;
	private JTextField textFieldNumero;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_5;
	private JTextField textFieldNome2;
	private JLabel lblCapacidade_1;
	private JLabel lblNewLabel_6;
	private JTextField textFieldInstalacao2;
	private JTextField textFieldEndereco2;
	private JTextField textFieldNumero2;
	private JLabel lblNewLabel_8;
	private JLabel lblCapacidade_2;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JTextField textFieldNumero3;
	private JTextField textFieldInstalacao3;
	private JTextField textFieldEndereco3;
	private JTextField textFieldNome3;
	private JButton btnNewButtonEspecializado;
	private JLabel lblNewLabel_11;
	private JTextField textFieldRamRamo;
	private JTextField textFieldQtdOcorrencias;
	private JLabel lblNewLabel_12;
	private JPanel panel_2;
	private JLabel lblNewLabel_13;
	private JTextField textFieldNumeroTelefone;
	private JButton btnNewButtonConsulta;
	private JPanel panel_3;
	private JButton btnNewButtonFaturamento;
	private JLabel lblNewLabel_15;
	private JTextField textFieldFaturamento;
	private JTextField textFieldInternet;
	private JTextArea textAreaConsulta;
}