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
	private static JPanel painelPerfilPet, painelPerfilVacina;
	
	public TelaListaAnimais() {
		tela = new JFrame("Perfil do Pet!"); 
		tela.setSize(660, 800);;
		tela.setLayout(null); 
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		tela.setVisible(true);
		
		painelPerfilPet();
		painelPerfilVacina();
		tituloPet();
		tituloVacina();
		btnAdicionarVacina();
		btnEditarPerfilPet();
		btnDeletarPet();
		btnDeletarVacina();
	}
	
	public void painelPerfilPet() {
		painelPerfilPet = new JPanel();
		Border blackline = BorderFactory.createLineBorder(Color.black);
		painelPerfilPet.setBounds(185, 180, 400, 600);
		
		painelPerfilPet.setBorder(blackline);
		painelPerfilPet.setLayout(null);
		tela.add(painelPerfilPet);
		
	}
	
	public void painelPerfilVacina() {
		painelPerfilVacina = new JPanel();
		Border blackline = BorderFactory.createLineBorder(Color.black);
		painelPerfilVacina.setBounds(655, 180, 400, 600);
		
		painelPerfilVacina.setBorder(blackline);
		painelPerfilVacina.setLayout(null);
		tela.add(painelPerfilVacina);
		
	}

	public void tituloPet() {
		JLabel jlabTitulo = new JLabel("MEU PET");
	    jlabTitulo.setBounds(355, 130, 400, 30);
		
		tela.add(jlabTitulo);
	}
	
	public void tituloVacina() {
		JLabel jlabTituloVacina = new JLabel("CARTÃO VACINA");
		jlabTituloVacina.setBounds(805, 130, 400, 30);
		
		tela.add(jlabTituloVacina);
	}
	
	public void btnAdicionarVacina() {
		JButton btnAddVacina = new JButton("Adicionar Vacina");
		
		btnAddVacina.setActionCommand("AdicionarVacina");
		btnAddVacina.addActionListener(this);
		
		btnAddVacina.setBounds(665, 810, 130, 30);
		tela.add(btnAddVacina);
	}
	
	public void btnEditarPerfilPet() {
		JButton btnEditarPet = new JButton("Editar Pet");
		
		btnEditarPet.setActionCommand("EditarPet");
		btnEditarPet.addActionListener(this);
		
		btnEditarPet.setBounds(270, 810, 90, 30);
		tela.add(btnEditarPet);
	}
	
	public void btnDeletarPet() {
		JButton deletarPet = new JButton("Deletar Pet");
		deletarPet.setBounds(390, 810, 100, 30);
		
		deletarPet.setActionCommand("DeletarPet");
		deletarPet.addActionListener(this);
		
		tela.add(deletarPet);
	}
	
	public void btnDeletarVacina() {
		JButton deletarVacina = new JButton("Deletar Vacina");
		deletarVacina.setBounds(810, 810, 120, 30);
		
		deletarVacina.setActionCommand("Deletar Vacina");
		deletarVacina.addActionListener(this);
		
		tela.add(deletarVacina);
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
