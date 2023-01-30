package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionListener;

import controler.*;

public class TelaListaAnimais implements ActionListener{
	private static JFrame tela;
	private static JPanel painelPerfilPet, painelPerfilVacina;
	private ControleAnimais ca;
	private ControleVacinas cv;
	private ControleDados dados;
	private int indexAnimal;
	private int indexVacina;
	private String listaAnimais;
	private JList<String> listaVacinas;
	private String[] vacinas;
	private JTextArea area;
	
	public TelaListaAnimais(ControleDados dados, int index) {
		this.dados = dados;
		ca = new ControleAnimais(dados);
		cv = new ControleVacinas(dados);
		
		indexAnimal = index;
		indexVacina = index;
		
		tela = new JFrame("Perfil do Pet!"); 
		tela.setSize(660, 800);;
		tela.setLayout(null); 
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		painelPerfilPet();
		painelPerfilVacina();
		tituloPet();
		tituloVacina();
		btnAdicionarVacina();
		btnEditarPerfilPet();
		btnDeletarPet();
		btnDeletarVacina();
		btnEditarVacina();
		tela.setVisible(true);
	}
	
	public void painelPerfilPet() {
		painelPerfilPet = new JPanel();
		Border blackline = BorderFactory.createLineBorder(Color.black);
		painelPerfilPet.setBounds(185, 180, 400, 600);
		
		painelPerfilPet.setBorder(blackline);
		painelPerfilPet.setLayout(null);
		tela.add(painelPerfilPet);
		
	//Lista de animais
		
		listaAnimais = new String(ca.getAnimais().get(indexAnimal).toString());
		area = new JTextArea(listaAnimais);
		area.setBackground(new Color(0, 0, 0, 0));
		area.setOpaque(false);
		area.setFont(new Font("Times New Roman", Font.BOLD, 15));
        area.setLineWrap(true);
        area.setEditable(false);
	    area.setBounds(0, 0, 295, 330);			
		painelPerfilPet.add(area);
	}
	
	public void painelPerfilVacina() {
		painelPerfilVacina = new JPanel();
		Border blackline = BorderFactory.createLineBorder(Color.black);
		painelPerfilVacina.setBounds(655, 180, 400, 600);
		
		painelPerfilVacina.setBorder(blackline);
		painelPerfilVacina.setLayout(null);
		tela.add(painelPerfilVacina);
		
		vacinas = dados.getNomeVacinas();

		listaVacinas = new JList<String>(vacinas);

		listaVacinas.setBounds(0, 0, 295, 330);
		listaVacinas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaVacinas.setBackground(new Color(0, 0, 0, 0));
		listaVacinas.setOpaque(false);
		listaVacinas.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		painelPerfilVacina.add(listaVacinas);
		
		tela.add(painelPerfilVacina);
	}

	public void tituloPet() {
		JLabel jlabTitulo = new JLabel("PET :  " + ca.getNomePet(indexAnimal));
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
	
	public void btnEditarVacina() {
		JButton btnEditarVacina = new JButton("Editar Vacina");
		
		btnEditarVacina.setActionCommand("EditarVacina");
		btnEditarVacina.addActionListener(this);
		
		btnEditarVacina.setBounds(935, 810, 120, 30);
		tela.add(btnEditarVacina);
	}
	
	public void btnDeletarPet() {
		JButton deletarPet = new JButton("Deletar Pet");
		deletarPet.setBounds(380, 810, 100, 30);
		
		deletarPet.setActionCommand("DeletarPet");
		deletarPet.addActionListener(this);
		
		tela.add(deletarPet);
	}
	
	public void btnDeletarVacina() {
		JButton deletarVacina = new JButton("Deletar Vacina");
		deletarVacina.setBounds(805, 810, 120, 30);
		
		deletarVacina.setActionCommand("DeletarVacina");
		deletarVacina.addActionListener(this);
		
		tela.add(deletarVacina);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if ("AdicionarVacina" == ae.getActionCommand()) {		
			 new TelaCadastroVacina(dados, indexAnimal);
	         tela.dispose();
		}else if ("EditarPet" == ae.getActionCommand()) {
			 new TelaEditarPet(dados, indexAnimal);
	         tela.dispose();
		}else if("EditarVacina" == ae.getActionCommand()) {
			new TelaEditarVacina(dados, indexVacina);
			tela.dispose();
		}else if("DeletarPet" == ae.getActionCommand()) {
			boolean delete = dados.removerAnimal(indexAnimal);
		 
			if(delete){
			 JOptionPane.showMessageDialog(null, "Pet removido com sucesso!");
			 new TelaInicial(dados);
			 tela.dispose();
		 
		}else if("DeletarVacina" == ae.getActionCommand()) {
			 boolean deleteVacina = dados.removerVacina(indexVacina);
			 
			 if(deleteVacina){
			  JOptionPane.showMessageDialog(null, "Vacina removida com sucesso!");
			  new TelaListaAnimais(dados, indexAnimal);
			  tela.dispose();
			 }	 
		 }
		}
	}
}
