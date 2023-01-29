package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import controler.*;

import view.TelaCadastro.*;

public class TelaInicial implements ActionListener{
	private static JFrame tela;
	private static JButton btnCadastrarPet, btnBuscarPet;
	private static JLabel jlabTitulo;
	JTextField TextoBuscarPet;
	private ControleDados dados;

	
	
	TelaInicial() {
		dados = new ControleDados();
		
		tela = new JFrame("Tela Inicial!"); 
		tela.setSize(660, 800);
		tela.setLayout(null); 
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		tela.setVisible(true);
		
		titulo();
		cadastrarPet();
		buscarPet();	
	}
	
	TelaInicial(ControleDados dados) {
		this.dados = dados;
		
		tela = new JFrame("Tela Inicial!"); 
		tela.setSize(660, 800);
		tela.setLayout(null); 
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		tela.setVisible(true);
		
		titulo();
		cadastrarPet();
		buscarPet();
	}
	
	    public void titulo() {
		jlabTitulo = new JLabel("TELA INICIAL");
		jlabTitulo.setBounds(565, 250, 200, 30);
		
		tela.add(jlabTitulo);
	    }
		
	
	    public void cadastrarPet() {
			btnCadastrarPet = new JButton("Cadastrar Pet");
			btnCadastrarPet.setBounds(500, 350, 200, 30);
			
			btnCadastrarPet.addActionListener(this);
			btnCadastrarPet.setActionCommand("Cadastrar Pet");
			
			tela.add(btnCadastrarPet);
		}
		
	    public void buscarPet() {
	    	JLabel jlabBuscarPet = new JLabel("PESQUISE UM PET");
	    	jlabBuscarPet.setBounds(545, 510, 130, 30);
	    	
	    	TextoBuscarPet = new JTextField();
	    	TextoBuscarPet.setBounds(500, 560, 200, 30);
	    	
	    	btnBuscarPet = new JButton("Buscar Pet");
			btnBuscarPet.setBounds(500, 620, 200, 30);
			 
			btnBuscarPet.addActionListener(this); 
			btnBuscarPet.setActionCommand("Buscar Pet");
			
			tela.add(btnBuscarPet);		
			tela.add(TextoBuscarPet);
			tela.add(jlabBuscarPet);
	    }
	    
	
	public static void main(String[] a) { 
		new TelaInicial();		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if ("Cadastrar Pet" == ae.getActionCommand()) {
            new TelaCadastro(dados);
            tela.dispose();
         }else if ("Buscar Pet" == ae.getActionCommand()){
        	 String NomePet = TextoBuscarPet.getText();
        	 System.out.println(NomePet);
        
            int indexAnimal = dados.buscarAnimal(NomePet);
            if(indexAnimal == -1) {
            	JOptionPane.showMessageDialog(null, "Pet não encontrado!");
            }else {
            new TelaListaAnimais(dados, indexAnimal);
            tela.dispose();  
            }
        }
      }
  }  

