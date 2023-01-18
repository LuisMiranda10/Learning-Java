package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaEditarPet implements ActionListener{
	private static JFrame tela;
	private static JRadioButton canina, felina, roedor;
	JLabel jlabTamanhoPelagem, jlabSituacaoDentes, jlabSituacaoFucinho;
	JComboBox<String>listaPelagem; 
	JComboBox<String>listaSituacaoDente;
	JComboBox<String>listaSituacaoFucinho;
	
	String generos[] = {"Macho", "Fêmea", "Indefinido"};
	String porte[] = {"Alto", "Médio", "Baixo"};
	
	String pelagem[] = {"Alta", "Média", "Curta"};
	String situacaoDente[] = {"Ótima", "Média", "Ruim"};
	String situacaoFucinho[] = {"Ótimo", "Médio", "Ruim"};
	
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
			pelagem();
			situacaoDentes();
			situacaoFucinho();
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
			canina = new JRadioButton("Canina");
			felina = new JRadioButton("Felina");
			roedor = new JRadioButton("Roedor");
			
			canina.setBounds(580, 600, 65, 30);
			felina.setBounds(650, 600, 60, 30);
			roedor.setBounds(720, 600, 70, 30);
			jlabEspecie.setBounds(460, 600, 150, 30);
			
			canina.addActionListener(this);
			felina.addActionListener(this);
			roedor.addActionListener(this);
			
			tela.add(jlabEspecie);
			tela.add(canina);
			tela.add(felina);
			tela.add(roedor);
			
			ButtonGroup opcoes = new ButtonGroup();
			opcoes.add(canina);
			opcoes.add(felina);
			opcoes.add(roedor);
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
			
			listaPorte.setBounds(560,450, 200, 30);
			jlabAltura.setBounds(460, 450, 150, 30);
			
			tela.add(jlabAltura);
			tela.add(listaPorte);
		}
		
		public void idadeAnimal() {
			JTextField TextoIdadeAnimal = new JTextField();
			JLabel jlabIdadeAnimal = new JLabel("Idade do seu pet: ");
			
			TextoIdadeAnimal.setBounds(560, 550, 200, 30);
			jlabIdadeAnimal.setBounds(460, 550, 100, 30);
			
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
			adicionarAnimal.setBounds(520, 750, 200, 40);
		
			adicionarAnimal.setActionCommand("Adicionar Pet");
	        adicionarAnimal.addActionListener(this);
			
			tela.add(adicionarAnimal);
		}
		
		public void pelagem() {
	        jlabTamanhoPelagem = new JLabel("Tamanho da pelagem: ");
	        jlabTamanhoPelagem.setBounds(460, 650, 150, 30);
	        jlabTamanhoPelagem.setVisible(false);
	        tela.add(jlabTamanhoPelagem);
	        
	        listaPelagem = new JComboBox<>(pelagem);	
			listaPelagem.setBounds(590, 650, 170, 30);
			listaPelagem.setVisible(false);
			tela.add(listaPelagem);
		}
		
		public void situacaoDentes() {
			jlabSituacaoDentes = new JLabel("Situação dos dentes: ");
		    jlabSituacaoDentes.setBounds(460, 650, 150, 30);
		    jlabSituacaoDentes.setVisible(false);
		    tela.add(jlabSituacaoDentes);
		        
	        listaSituacaoDente = new JComboBox<>(situacaoDente);	
	        listaSituacaoDente.setBounds(590, 650, 170, 30);
            listaSituacaoDente.setVisible(false);
			tela.add(listaSituacaoDente); 
		}
		
		public void situacaoFucinho() {
			jlabSituacaoFucinho = new JLabel("Situação do fucinho: ");
			jlabSituacaoFucinho.setBounds(460, 650, 150, 30);
			jlabSituacaoFucinho.setVisible(false);
		    tela.add(jlabSituacaoFucinho);
		        
	        listaSituacaoFucinho = new JComboBox<>(situacaoFucinho);	
	        listaSituacaoFucinho.setBounds(590, 650, 170, 30);
	        listaSituacaoFucinho.setVisible(false);
			tela.add(listaSituacaoFucinho); 
		}
		
		public void actionPerformed(ActionEvent ae) {
			if ("Adicionar Pet" == ae.getActionCommand()) {
				 new TelaListaAnimais();
		         tela.dispose();
			}
			if(felina.isSelected() == true && canina.isSelected() == false && roedor.isSelected() == false) {
				jlabTamanhoPelagem.setVisible(true);
				listaPelagem.setVisible(true);
				
				jlabSituacaoDentes.setVisible(false);
		        listaSituacaoDente.setVisible(false);
		        jlabSituacaoFucinho.setVisible(false);
		        listaSituacaoFucinho.setVisible(false);
			}
			if(roedor.isSelected() == true && canina.isSelected() == false && felina.isSelected() == false) {
				jlabSituacaoDentes.setVisible(true);
		        listaSituacaoDente.setVisible(true);
			
		        jlabTamanhoPelagem.setVisible(false);
				listaPelagem.setVisible(false);
				jlabSituacaoFucinho.setVisible(false);
				listaSituacaoFucinho.setVisible(false);
			}
			if(canina.isSelected() == true && roedor.isSelected() == false && felina.isSelected() == false) {
				jlabSituacaoFucinho.setVisible(true);
				listaSituacaoFucinho.setVisible(true);
			
		        jlabTamanhoPelagem.setVisible(false);
				listaPelagem.setVisible(false);
				jlabSituacaoDentes.setVisible(false);
		        listaSituacaoDente.setVisible(false);
			}
		  }
		
		public static void main(String[] a) { 
			new TelaEditarPet();		
		}
}
