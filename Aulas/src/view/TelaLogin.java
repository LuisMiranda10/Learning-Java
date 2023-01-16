package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.event.*;
import java.awt.*;

public class TelaLogin implements ActionListener{
	private static JFrame tela;
	private static JTextField TextoNome, TextoIdade, TextoNomePet, TextoRaca, TextoIdadeAnimal;
	private static JLabel jlabTitulo ,jlabNome, jlabGenero, jlabIdade, jlabNomePet, jlabEspecie, jlabRaca, jlabAltura, jlabIdadeAnimal;  
	private static JComboBox listaEspecie, listaGenero, listaPorte;
	private static JButton adicionarAnimal;
	
	
	public TelaLogin() {
		tela = new JFrame("Tela de Login!"); 
		tela.setSize(1100, 700);;
		tela.setLayout(null); 
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		String generos[] = {"Macho", "Fêmea", "Indefinido"};
		String especies[] = { "Canina", "Felina", "Coelho"};
		String porte[] = {"Alto", "Médio", "Baixo"};
		
		listaGenero = new JComboBox(generos);
		listaEspecie = new JComboBox(especies); 
		listaPorte = new JComboBox(porte);
		
		TextoNome = new JTextField();
		TextoIdade = new JTextField();
		TextoNomePet = new JTextField();
		TextoRaca = new JTextField();
		TextoIdadeAnimal = new JTextField();
		
		jlabTitulo = new JLabel("TELA DE CADASTRO");
		jlabNome = new JLabel("Digite seu nome: ");
		jlabIdade = new JLabel("Digite sua idade: ");
		jlabGenero = new JLabel("Gênero do Pet: ");
		jlabNomePet = new JLabel("Nome do seu Pet: ");
		jlabEspecie = new JLabel("Selecione a espécie: ");
		jlabRaca = new JLabel("Digite a raça: ");
		jlabAltura = new JLabel("Porte do Pet: ");
		jlabIdadeAnimal = new JLabel("Idade do seu pet: ");
		
		adicionarAnimal = new JButton("Adicionar Pet");
		
		jlabTitulo.setBounds(545, 185, 400, 30);

		TextoNome.setBounds(560, 250, 200, 30);
		jlabNome.setBounds(460, 250, 100, 30);
	   
		TextoIdade.setBounds(560, 300, 50, 30);
	    jlabIdade.setBounds(460, 300, 100, 30);
	    
		listaGenero.setBounds(560, 350, 200, 30);
		jlabGenero.setBounds(460, 350, 150, 30);
		
		TextoNomePet.setBounds(560, 400, 200, 30);
		jlabNomePet.setBounds(460, 400, 110, 30);
		
		listaEspecie.setBounds(580, 450, 180, 30);
		jlabEspecie.setBounds(460, 450, 150, 30);
		
		TextoRaca.setBounds(560, 500, 200, 30);
		jlabRaca.setBounds(460, 500, 100, 30);
		
		listaPorte.setBounds(560,550, 200, 30);
		jlabAltura.setBounds(460, 550, 150, 30);
		
		TextoIdadeAnimal.setBounds(560, 600, 200, 30);
		jlabIdadeAnimal.setBounds(460, 600, 100, 30);
		
		adicionarAnimal.setBounds(520, 670, 200, 40);
		
		tela.add(jlabTitulo);
		tela.add(jlabNome); 
		tela.add(jlabIdade); 
		tela.add(jlabGenero); 
		tela.add(jlabNomePet);
		tela.add(jlabEspecie);
		tela.add(jlabRaca);
		tela.add(jlabAltura);
		tela.add(jlabIdadeAnimal);
		
		tela.add(TextoNome);  
		tela.add(TextoIdade);  
		tela.add(listaGenero);  
		tela.add(TextoNomePet);
		tela.add(listaEspecie);
		tela.add(TextoRaca);
		tela.add(listaPorte);	
		tela.add(TextoIdadeAnimal);
		
		tela.add(adicionarAnimal);
		
		adicionarAnimal.setActionCommand("adicionarAnimal");
        adicionarAnimal.addActionListener(this);
		
		tela.pack();
		tela.setVisible(true); 
	}
	
	public void actionPerformed(ActionEvent ae) { 
		if ("adicionarAnimal" == ae.getActionCommand()) {
            //new Tela();
            tela.dispose();
         }
		
	}
	
	
	
	
	public static void main(String[] a) { 
		TelaLogin telaLogin = new TelaLogin();		
	}

}
