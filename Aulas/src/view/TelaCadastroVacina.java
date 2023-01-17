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
	
	String doses[] = {"1", "2", "3", "Mais de 3"};
	
	TelaCadastroVacina() {
		tela = new JFrame("Cadastro de Vacinas!"); 
		tela.setSize(660, 800);
		tela.setLayout(null); 
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		tela.pack();
		tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		tela.setVisible(true); 
	
		titulo();
		tipoVacina();
		dataVacina();
		dataDose();
		local();
		lote();
		doses();
		btnAdicionarVacina();
	}
	
	public void titulo() {
		jlabTitulo = new JLabel("CADASTRO DE VACINA");
		jlabTitulo.setBounds(545, 185, 400, 30);
		
		tela.add(jlabTitulo);
	}
	
	public void tipoVacina() {
		TextoTipoVacina = new JTextField();
		jlabTipoVacina = new JLabel("Tipo da vacina: ");
		
		TextoTipoVacina.setBounds(560, 250, 200, 30);
		jlabTipoVacina.setBounds(460, 250, 100, 30);
		
		tela.add(jlabTipoVacina);
		tela.add(TextoTipoVacina);
	}
	
	public void dataVacina() {
		TextoDataVacina = new JTextField();
		jlabDataVacina = new JLabel("Data da vacina: ");
		
		TextoDataVacina.setBounds(560, 300, 100, 30);
	    jlabDataVacina.setBounds(460, 300, 100, 30);
	    
	    tela.add(jlabDataVacina); 
	    tela.add(TextoDataVacina);      
	}
	
	public void dataDose() {
		TextoDataDose = new JTextField();
		jlabDataDose = new JLabel("Data dose: ");
		
		TextoDataDose.setBounds(560, 350, 200, 30);
		jlabDataDose.setBounds(460, 350, 150, 30);
		
		tela.add(jlabDataDose); 
		tela.add(TextoDataDose);
	}
	
	public void local() {
		TextoLocal = new JTextField();
		jlabLocal = new JLabel("Local da vacina: ");
		
		TextoLocal.setBounds(560, 400, 200, 30);
		jlabLocal.setBounds(460, 400, 110, 30);
		
		tela.add(jlabLocal);
		tela.add(TextoLocal);
	}
	
	public void lote() {
		TextoLote = new JTextField();
		jlabLote = new JLabel("Lote da vacina: ");
		
		TextoLote.setBounds(560, 450, 200, 30);
		jlabLote.setBounds(460, 450, 150, 30);
		
		tela.add(jlabLote);
		tela.add(TextoLote);
	}
	
	public void doses() {
		listaDoses = new JComboBox<>(doses);
		jlabDoses = new JLabel("Número de doses: ");
		
		listaDoses.setBounds(570,500, 190, 30);
		jlabDoses.setBounds(460, 500, 150, 30);
		
		tela.add(jlabDoses);
		tela.add(listaDoses);
	}
	
	public void btnAdicionarVacina() {
		adicionarVacina = new JButton("Adicionar Vacina");
		adicionarVacina.setBounds(520, 580, 200, 40);
	
		adicionarVacina.setActionCommand("Adicionar Vacina");
        adicionarVacina.addActionListener(this);
		
		tela.add(adicionarVacina);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if ("Adicionar Vacina" == ae.getActionCommand()) {
            new TelaListaAnimais();
            tela.dispose();
         }
	}
	
	
	public static void main(String[] args) {
		TelaCadastroVacina telaCadastroVacina = new TelaCadastroVacina();
	}

}
