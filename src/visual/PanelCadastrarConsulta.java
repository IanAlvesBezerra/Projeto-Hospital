package visual;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class PanelCadastrarConsulta extends JPanel {

	private JPanel panelPrincipal;
	private JLabel labelTitlePanel;
	
	private JLabel labelData;
	private JLabel labelHora;
	private JLabel labelQueixaPaciente;
	private JLabel labelObservacoes;
	private JLabel labelMaterial;
	private JLabel labelMedico;
	private JLabel labelPaciente;
	private JLabel labelTipoDeConsulta;
	private JLabel labelConvenio;
	
	private JTextField textFieldData;
	private JTextField textFieldHora;
	private JTextField textFieldPaciente;
	
	private JTextArea textAreaObservacoes;
	private JTextArea textAreaMaterial;
	private JTextArea textAreaQueixaPaciente;

	private JComboBox<String> comboBoxMedico;
	private JComboBox<String> comboBoxTipoDeConsulta;
	private JComboBox<String> comboBoxConvenio;
	
	private JButton buttonCadastrar;
	private JButton buttonLimpar;
	
	public PanelCadastrarConsulta() {
		setBackground(new Color(2, 83, 112));
		setSize(1280, 750);
		setLayout(null);
		add(getLabelTitlePanel());
		add(getPanelMain());
		add(getButtonCadastrar());
		add(getButtonLimpar());
	}
	
	public JPanel getPanelMain() {
		if (panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBorder(new LineBorder(null));
			panelPrincipal.setBackground(new Color(204, 229, 233));
			panelPrincipal.setBounds(140, 130, 1000, 475);
			panelPrincipal.setLayout(null);
			panelPrincipal.add(getLabelData());
			panelPrincipal.add(getLabelHora());
			panelPrincipal.add(getLabelQueixaPaciente());
			panelPrincipal.add(getLabelObservacoes());
			panelPrincipal.add(getLabelMaterial());
			panelPrincipal.add(getLabelMedico());
			panelPrincipal.add(getLabelPaciente());
			panelPrincipal.add(getLabelTipoDeConsulta());
			panelPrincipal.add(getLabelConvenio());
			
			panelPrincipal.add(getTextFieldPaciente());
			panelPrincipal.add(getTextFieldHora());
			panelPrincipal.add(getTextFieldData());
			
			panelPrincipal.add(getTextAreaQueixaPaciente());
			panelPrincipal.add(getTextAreaObservacoes());
			panelPrincipal.add(getTextAreaMaterial());
			
			panelPrincipal.add(getComboBoxMedico());
			panelPrincipal.add(getComboBoxTipoDeConsulta());
			panelPrincipal.add(getComboBoxConvenio());
		}
		return panelPrincipal;
	}
	
	/* ----------------------------------------------------------------- Labels -------------------------------------------------------------- */
	public JLabel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new JLabel();
			labelTitlePanel.setForeground(new Color(255, 255, 255));
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setText("Cadastrar Consultas");
			labelTitlePanel.setBounds(481, 50, 317, 44);
		}
		return labelTitlePanel;
	}
	
	public JLabel getLabelData() {
		if(labelData == null) {
			labelData = new JLabel();
			labelData.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelData.setBounds(625, 15, 150, 20);
			labelData.setText("Data");
		}
		return labelData;
	}
	
	public JLabel getLabelHora() {
		if(labelHora == null) {
			labelHora = new JLabel();
			labelHora.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelHora.setBounds(800, 15, 100, 20);
			labelHora.setText("Hora");
		}
		return labelHora;
	}
	
	public JLabel getLabelQueixaPaciente() {
		if(labelQueixaPaciente == null) {
			labelQueixaPaciente = new JLabel();
			labelQueixaPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelQueixaPaciente.setBounds(100, 130, 800, 20);
			labelQueixaPaciente.setText("Queixa do Paciente");
		}
		return labelQueixaPaciente;
	}
	
	public JLabel getLabelObservacoes() {
		if(labelObservacoes == null) {
			labelObservacoes = new JLabel();
			labelObservacoes.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelObservacoes.setBounds(100, 240, 800, 20);
			labelObservacoes.setText("Observações");
		}
		return labelObservacoes;
	}
	
	public JLabel getLabelMaterial() {
		if(labelMaterial == null) {
			labelMaterial = new JLabel();
			labelMaterial.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelMaterial.setBounds(100, 350, 800, 20);
			labelMaterial.setText("Materiais");
		}
		return labelMaterial;
	}
	
	public JLabel getLabelMedico() {
		if(labelMedico == null) {
			labelMedico = new JLabel();
			labelMedico.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelMedico.setBounds(100, 75, 350, 20);
			labelMedico.setText("Médico");
		}
		return labelMedico;
	}
	
	public JLabel getLabelPaciente() {
		if(labelPaciente == null) {
			labelPaciente = new JLabel();
			labelPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelPaciente.setBounds(100, 15, 220, 20);
			labelPaciente.setText("Paciente");
		}
		return labelPaciente;
	}
	
	public JLabel getLabelTipoDeConsulta() {
		if(labelTipoDeConsulta == null) {
			labelTipoDeConsulta = new JLabel();
			labelTipoDeConsulta.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelTipoDeConsulta.setBounds(475, 75, 200, 20);
			labelTipoDeConsulta.setText("Tipo De Consulta");
		}
		return labelTipoDeConsulta;
	}
	
	public JLabel getLabelConvenio() {
		if(labelConvenio == null) {
			labelConvenio = new JLabel();
			labelConvenio.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelConvenio.setBounds(700, 75, 200, 20);
			labelConvenio.setText("Convênio");
		}
		return labelConvenio;
	}
	
	/* ----------------------------------------------------------------- Imputs -------------------------------------------------------------- */
	public JTextField getTextFieldData() {
		if (textFieldData == null) {
			textFieldData = new JTextField();
			textFieldData.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldData.setBounds(100, 40, 500, 25);
			textFieldData.setColumns(10);
		}
		return textFieldData;
	}
	
	public JTextField getTextFieldHora() {
		if (textFieldHora == null) {
			textFieldHora = new JTextField();
			textFieldHora.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldHora.setBounds(800, 40, 100, 25);
			textFieldHora.setColumns(10);
		}
		return textFieldHora;
	}
	
	public JTextArea getTextAreaQueixaPaciente() {
		if (textAreaQueixaPaciente == null) {
			textAreaQueixaPaciente = new JTextArea();
			textAreaQueixaPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textAreaQueixaPaciente.setBounds(100, 155, 800, 75);
			textAreaQueixaPaciente.setColumns(10);
		}
		return textAreaQueixaPaciente;
	}
	
	public JTextArea getTextAreaObservacoes() {
		if (textAreaObservacoes == null) {
			textAreaObservacoes = new JTextArea();
			textAreaObservacoes.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textAreaObservacoes.setBounds(100, 265, 800, 75);
			textAreaObservacoes.setColumns(10);
		}
		return textAreaObservacoes;
	}
	
	public JTextArea getTextAreaMaterial() {
		if (textAreaMaterial == null) {
			textAreaMaterial = new JTextArea();
			textAreaMaterial.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textAreaMaterial.setBounds(100, 375, 800, 75);
			textAreaMaterial.setColumns(10);
		}
		return textAreaMaterial;
	}
	
	public JComboBox getComboBoxMedico() {
		if (comboBoxMedico == null) {
			comboBoxMedico = new JComboBox();
			comboBoxMedico.setFont(new Font("Tahoma", Font.PLAIN, 14));
			comboBoxMedico.setBounds(100, 100, 350, 25);
			comboBoxMedico.addItem("NOME MÉDICO");
			
			// Definir seu padrão como nenhum dos itens acima
	    	comboBoxMedico.setSelectedIndex(-1);
		}
		return comboBoxMedico;
	}
	
	public JTextField getTextFieldPaciente() {
		if (textFieldPaciente == null) {
			textFieldPaciente = new JTextField();
			textFieldPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldPaciente.setBounds(625, 40, 150, 25);
		}
		return textFieldPaciente;
	}
	
	public JComboBox getComboBoxTipoDeConsulta() {
		if (comboBoxTipoDeConsulta == null) {
			comboBoxTipoDeConsulta = new JComboBox();
			comboBoxTipoDeConsulta.setFont(new Font("Tahoma", Font.PLAIN, 14));
			comboBoxTipoDeConsulta.setBounds(475, 100, 200, 25);
			comboBoxTipoDeConsulta.addItem("TIPO DE CONSULTA");
			
			// Definir seu padrão como nenhum dos itens acima
	    	comboBoxTipoDeConsulta.setSelectedIndex(-1);
		}
		return comboBoxTipoDeConsulta;
	}
	
	public JComboBox getComboBoxConvenio() {
		if (comboBoxConvenio == null) {
			comboBoxConvenio = new JComboBox();
			comboBoxConvenio.setFont(new Font("Tahoma", Font.PLAIN, 14));
			comboBoxConvenio.setBounds(700, 100, 200, 25);
			comboBoxConvenio.addItem("TIPO DE CONVÊNIO");
			
			// Definir seu padrão como nenhum dos itens acima
	    	comboBoxConvenio.setSelectedIndex(-1);
		}
		return comboBoxConvenio;
	}
	
	/* ---------------------------------------------------------------- Buttons -------------------------------------------------------------- */
	public JButton getButtonCadastrar() {
		if (buttonCadastrar == null) {
			buttonCadastrar = new JButton("Cadastrar");
			buttonCadastrar.setBounds(1040, 630, 100, 35);
		}
		return buttonCadastrar;
	}
	
	public JButton getButtonLimpar() {
		if (buttonLimpar == null) {
			buttonLimpar = new JButton("Limpar");
			buttonLimpar.setBounds(140, 630, 100, 35);
		}
		return buttonLimpar;
	}
}
