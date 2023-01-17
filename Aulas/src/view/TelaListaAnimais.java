package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import view.TelaCadastroVacina;
import view.TelaEditarPet;

public class TelaListaAnimais implements ActionListener{
	private static JFrame tela;
	private static JPanel painelPerfilPet;
	
	public TelaListaAnimais() {
		tela = new JFrame("Perfil do Pet!"); 
		tela.setSize(660, 800);;
		tela.setLayout(null); 
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		tela.setVisible(true);
		
		painelPerfilPet();
		titulo();
		botaoEditarPerfilPet();
		botaoAdicionarVacina();
	}
	
	public void painelPerfilPet() {
		painelPerfilPet = new JPanel();
		Border blackline = BorderFactory.createLineBorder(Color.black);
		painelPerfilPet.setBounds(420, 180, 400, 600);
		
		painelPerfilPet.setBorder(blackline);
		painelPerfilPet.setLayout(null);
		tela.add(painelPerfilPet);
		
	}

	public void titulo() {
		JLabel jlabTitulo = new JLabel("MEU PET");
	    jlabTitulo.setBounds(595, 130, 400, 30);
		
		tela.add(jlabTitulo);
	}
	
	public void botaoEditarPerfilPet() {
		JButton botaoEditarPet = new JButton("Editar Pet");
		
		botaoEditarPet.setActionCommand("EditarPet");
		botaoEditarPet.addActionListener(this);
		
		botaoEditarPet.setBounds(650, 810, 90, 30);
		tela.add(botaoEditarPet);
	}
	
	public void botaoAdicionarVacina() {
		JButton botaoAddVacina = new JButton("Adicionar Vacina");
		
		botaoAddVacina.setActionCommand("AdicionarVacina");
		botaoAddVacina.addActionListener(this);
		
		botaoAddVacina.setBounds(490, 810, 150, 30);
		tela.add(botaoAddVacina);
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		if ("AdicionarVacina" == ae.getActionCommand()) {
			 new TelaCadastroVacina();
	         tela.dispose();
		}else if ("EditarPet" == ae.getActionCommand()) {
			 new TelaEditarPet();
	         tela.dispose();
		}
	}
	
	public static void main(String[] args) {	
		new TelaListaAnimais();
	}
}
