package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Dialog;
import visual.PanelCadastrar;
import visual.PanelCadastrarConsulta;
import visual.PanelCadastrarExame;
import visual.PanelCadastrarMaterial;
import visual.PanelCadastrarMedico;
import visual.PanelCadastrarPaciente;

public class ControladorPanelCadastrar implements ActionListener {

	PanelCadastrar panelCadastrar;
	
	public ControladorPanelCadastrar(PanelCadastrar panelCadastrar) {
		this.panelCadastrar = panelCadastrar;
		addEventos();
	}
	
	public void addEventos() {
		panelCadastrar.getButtonCadastrarPaciente().addActionListener(this);
		panelCadastrar.getButtonCadastrarMedico().addActionListener(this);
		panelCadastrar.getButtonCadastrarExame().addActionListener(this);
		panelCadastrar.getButtonCadastrarConsulta().addActionListener(this);
		panelCadastrar.getButtonCadastrarMaterial().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrar.getButtonCadastrarPaciente()) {
			PanelCadastrarPaciente panelCadastrarPaciente = new PanelCadastrarPaciente();
			Dialog dialog = new Dialog(panelCadastrarPaciente);
			
		} else if(e.getSource() == panelCadastrar.getButtonCadastrarMedico()) {
			PanelCadastrarMedico panelCadastrarMedico = new PanelCadastrarMedico();
			Dialog dialog = new Dialog(panelCadastrarMedico);
			
		} else if(e.getSource() == panelCadastrar.getButtonCadastrarExame()) {
			PanelCadastrarExame panelCadastrarExame = new PanelCadastrarExame();
			Dialog dialog = new Dialog(panelCadastrarExame);
			
		} else if(e.getSource() == panelCadastrar.getButtonCadastrarConsulta()) {
			PanelCadastrarConsulta panelCadastrarConsulta = new PanelCadastrarConsulta();
			Dialog dialog = new Dialog(panelCadastrarConsulta);
			
		} else if(e.getSource() == panelCadastrar.getButtonCadastrarMaterial()) {
			PanelCadastrarMaterial panelCadastrarMaterial = new PanelCadastrarMaterial();
			Dialog dialog = new Dialog(panelCadastrarMaterial);
			
		}
	}

}
