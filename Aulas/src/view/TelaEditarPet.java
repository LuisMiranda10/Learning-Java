package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaEditarPet implements ActionListener{
	private static JFrame tela;
	
	String generos[] = {"Macho", "Fêmea", "Indefinido"};
	String especies[] = { "Canina", "Felina", "Roedor"};
	String porte[] = {"Alto", "Médio", "Baixo"};
	
	TelaEditarPet(){
		tela = new JFrame("Tela de editar Pet!"); 
		tela.setSize(660, 800);
		tela.setLayout(null); 
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		tela.setVisible(true); 
		
		titulo();
		construirCadastro();
	}
	
	public void titulo() {
		JLabel jlabTitulo = new JLabel("EDITE SEU PET");
		jlabTitulo.setBounds(565, 185, 400, 30);
		
		tela.add(jlabTitulo); 
	}
	
	 public void construirCadastro() {
			nome();
			idade();
			nomePet();
			especie();
			raca();
			altura();
			idadeAnimal();
			genero();
			adicionarAnimal();	
	    }
	 
	 public void nome() {
			JTextField TextoNome = new JTextField();
			JLabel jlabNome = new JLabel("Digite seu nome: ");
			
			TextoNome.setBounds(560, 250, 200, 30);
			jlabNome.setBounds(460, 250, 100, 30);
			
			tela.add(TextoNome);
			tela.add(jlabNome);
		}
		
		public void idade() {
			JTextField TextoIdade = new JTextField();
			JLabel jlabIdade = new JLabel("Digite sua idade: ");
			
			TextoIdade.setBounds(560, 300, 50, 30);
		    jlabIdade.setBounds(460, 300, 100, 30);
		    
		    tela.add(TextoIdade);
		    tela.add(jlabIdade);
		}
		
		public void nomePet() {
			JTextField TextoNomePet = new JTextField();
			JLabel jlabNomePet = new JLabel("Nome do seu Pet: ");
			
			TextoNomePet.setBounds(560, 400, 200, 30);
			jlabNomePet.setBounds(460, 400, 110, 30);
			
			tela.add(TextoNomePet);
			tela.add(jlabNomePet);
		}
		
		public void especie() {
			JLabel jlabEspecie = new JLabel("Selecione a espécie: ");
			JComboBox listaEspecie = new JComboBox<>(especies); 
			
			listaEspecie.setBounds(580, 450, 180, 30);
			jlabEspecie.setBounds(460, 450, 150, 30);
			
			tela.add(jlabEspecie);
			tela.add(listaEspecie);
		}
		
		public void raca() {
			JTextField TextoRaca = new JTextField();
			JLabel jlabRaca = new JLabel("Raca: ");
			
			TextoRaca.setBounds(560, 500, 200, 30);
			jlabRaca.setBounds(460, 500, 100, 30);
		
			tela.add(jlabRaca);
			tela.add(TextoRaca);
		}
		
		public void altura() {
			JLabel  jlabAltura = new JLabel("Porte do Pet: ");
			JComboBox listaPorte = new JComboBox<>(porte);
			
			listaPorte.setBounds(560,550, 200, 30);
			jlabAltura.setBounds(460, 550, 150, 30);
			
			tela.add(jlabAltura);
			tela.add(listaPorte);
		}
		
		public void idadeAnimal() {
			JTextField TextoIdadeAnimal = new JTextField();
			JLabel jlabIdadeAnimal = new JLabel("Idade do seu pet: ");
			
			TextoIdadeAnimal.setBounds(560, 600, 200, 30);
			jlabIdadeAnimal.setBounds(460, 600, 100, 30);
			
			tela.add(jlabIdadeAnimal);
			tela.add(TextoIdadeAnimal);	
		}
		
		public void genero() {
			JLabel jlabGenero = new JLabel("Gênero do Pet: ");
			JComboBox listaGenero = new JComboBox<>(generos); 
			
			listaGenero.setBounds(560, 350, 200, 30);
			jlabGenero.setBounds(460, 350, 150, 30);
			
			tela.add(jlabGenero); 	
			tela.add(listaGenero);  	
		}
		
		public void adicionarAnimal() {
			JButton adicionarAnimal = new JButton("Adicionar Pet");
			adicionarAnimal.setBounds(520, 670, 200, 40);
		
			adicionarAnimal.setActionCommand("Adicionar Pet");
	        adicionarAnimal.addActionListener(this);
			
			tela.add(adicionarAnimal);
		}
		
		public void actionPerformed(ActionEvent ae) {
			if ("Adicionar Pet" == ae.getActionCommand()) {
				 new TelaListaAnimais();
		         tela.dispose();
			}
		  }
		
		public static void main(String[] a) { 
			new TelaEditarPet();		
		}
}
