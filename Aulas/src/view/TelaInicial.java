package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import view.TelaCadastro.*;

public class TelaInicial implements ActionListener{
	private static JFrame tela;
	private static JButton btnCadastrarPet, btnBuscarPet;
	private static JLabel jlabTitulo;

	
	
	TelaInicial() {
		tela = new JFrame("Tela Inicial!"); 
		tela.setSize(660, 800);
		tela.setLayout(null); 
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		tela.pack();
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
	    	btnBuscarPet = new JButton("Buscar Pet");
			btnBuscarPet.setBounds(500, 420, 200, 30);
			 
			btnBuscarPet.addActionListener(this); 
			btnBuscarPet.setActionCommand("Buscar Pet");
			
			tela.add(btnBuscarPet);			
	    }
	
	public void actionPerformed(ActionEvent ae) {
		if ("Cadastrar Pet" == ae.getActionCommand()) {
            new TelaCadastro();
            tela.dispose();
         }else if
        	("Buscar Pet" == ae.getActionCommand()){
        	//new Tela();
            tela.dispose();
         }
	}
	
	public static void main(String[] a) { 
		new TelaInicial();		
	}

}

