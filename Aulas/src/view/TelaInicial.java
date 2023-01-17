package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import view.TelaLogin.*;

public class TelaInicial implements ActionListener{
	private static JFrame tela;
	private static JButton cadastrarPet, buscarPet;
	private static JLabel jlabTitulo;

	
	
	public TelaInicial() {
		tela = new JFrame("Tela Inicial!"); 
		tela.setSize(1100, 700);;
		tela.setLayout(null); 
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		cadastrarPet = new JButton("Cadastrar Pet");
		buscarPet = new JButton("Buscar Pet");
		
		jlabTitulo = new JLabel("TELA INICIAL");
		
		jlabTitulo.setBounds(565, 250, 200, 30);
		
		cadastrarPet.setBounds(500, 350, 200, 30);
		buscarPet.setBounds(500, 420, 200, 30);
		
		cadastrarPet.addActionListener(this); 
		buscarPet.addActionListener(this); 
		
		cadastrarPet.setActionCommand("Cadastrar Pet");
		buscarPet.setActionCommand("Buscar Pet");
		
		tela.add(jlabTitulo);
		tela.add(cadastrarPet);
		tela.add(buscarPet);
		
		tela.pack();
		tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		tela.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		if ("Cadastrar Pet" == ae.getActionCommand()) {
            new TelaLogin();
            tela.dispose();
         }else if
        	("Buscar Pet" == ae.getActionCommand()){
        	//new Tela();
            tela.dispose();
         }
	}
	
	public static void main(String[] a) { 
		TelaInicial telaInicial = new TelaInicial();		
	}

}

