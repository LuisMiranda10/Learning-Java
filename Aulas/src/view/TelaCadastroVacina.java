package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastroVacina implements ActionListener{
	private static JFrame tela;
	private static JTextField TextoTipoVacina, TextoDataVacina, TextoDataDose, TextoLocal, TextoLote;
	private static JLabel jlabTitulo ,jlabTipoVacina, jlabDataVacina, jlabDataDose, jlabLocal, jlabLote, jlabDoses;
	private static JComboBox listaDoses;
	private static JButton adicionarVacina;
	
	
	
	public TelaCadastroVacina() {
		tela = new JFrame("Cadastro de Vacinas!"); 
		tela.setSize(1100, 700);
		tela.setLayout(null); 
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		String doses[] = {"1", "2", "3", "Mais de 3"};
		
		listaDoses = new JComboBox(doses);
		
		TextoTipoVacina = new JTextField();
		TextoDataVacina = new JTextField();
		TextoDataDose = new JTextField();
		TextoLocal = new JTextField();
		TextoLote = new JTextField();
		
		jlabTitulo = new JLabel("CADASTRO DE VACINA");
		jlabTipoVacina = new JLabel("Tipo da vacina: ");
		jlabDataVacina = new JLabel("Data da vacina: ");
		jlabDataDose = new JLabel("Data dose: ");
		jlabLocal = new JLabel("Local da vacina: ");
		jlabLote = new JLabel("Lote da vacina: ");
		jlabDoses = new JLabel("Número de doses: ");
		
		adicionarVacina = new JButton("Adicionar Vacina");
		
		jlabTitulo.setBounds(545, 185, 400, 30);

		TextoTipoVacina.setBounds(560, 250, 200, 30);
		jlabTipoVacina.setBounds(460, 250, 100, 30);
	   
		TextoDataVacina.setBounds(560, 300, 100, 30);
	    jlabDataVacina.setBounds(460, 300, 100, 30);
	    
		TextoDataDose.setBounds(560, 350, 200, 30);
		jlabDataDose.setBounds(460, 350, 150, 30);
		
		TextoLocal.setBounds(560, 400, 200, 30);
		jlabLocal.setBounds(460, 400, 110, 30);
		
		TextoLote.setBounds(560, 450, 200, 30);
		jlabLote.setBounds(460, 450, 150, 30);
		
		listaDoses.setBounds(570,500, 190, 30);
		jlabDoses.setBounds(460, 500, 150, 30);
		
		adicionarVacina.setBounds(520, 580, 200, 40);
		
		tela.add(jlabTitulo);
		tela.add(jlabTipoVacina); 
		tela.add(jlabDataVacina); 
		tela.add(jlabDataDose); 
		tela.add(jlabLocal);
		tela.add(jlabLote);
		tela.add(jlabDoses);
		
		tela.add(TextoTipoVacina);  
		tela.add(TextoDataVacina);    
		tela.add(TextoDataDose);
		tela.add(TextoLocal);
		tela.add(TextoLote);
		tela.add(listaDoses);	
		
		tela.add(adicionarVacina);
		
		adicionarVacina.setActionCommand("Adicionar Vacina");
        adicionarVacina.addActionListener(this);
		
		tela.pack();
		tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		tela.setVisible(true); 
	}
	
	
	
	public void actionPerformed(ActionEvent ae) {
		if ("Adicionar Vacina" == ae.getActionCommand()) {
            //new Tela();
            tela.dispose();
         }
	}
	
	
	public static void main(String[] args) {
		TelaCadastroVacina telaCadastroVacina = new TelaCadastroVacina();
	}

}
