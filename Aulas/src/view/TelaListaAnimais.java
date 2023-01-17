package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class TelaListaAnimais implements ActionListener{
	private static JFrame tela;

	public TelaListaAnimais() {
		tela = new JFrame("Lista de Pets!"); 
		tela.setSize(448, 500);;
		tela.setLayout(null); 
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		
		
		
		tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		tela.setVisible(true);
	}
	
	
	
	
	public void actionPerformed(ActionEvent ae) {
		
	}
	
	public static void main(String[] args) {	
		TelaListaAnimais telaListaAnimais = new TelaListaAnimais();
	}

}
