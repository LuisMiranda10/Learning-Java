package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controler.ControleDados;

public class TelaEditarVacina implements ActionListener {
	private static JFrame tela;
	private ControleDados dados;
	int indexVacina;
	
	JTextField TextoTipoVacina;
	JTextField TextoDataVacina;
	JTextField TextoDataDose;
	JTextField TextoLocal;
	JTextField TextoLote;
	
	JComboBox listaDoses;
	
	String doses[] = {"1", "2", "3", "Mais de 3"};
	
	TelaEditarVacina(ControleDados dados, int index) {
		this.dados = dados;
		indexVacina = index;
		dados.removerVacina(indexVacina);
		
		tela = new JFrame("Editar Vacina!"); 
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
		btnEditarVacina();
	}
	
	public void titulo() {
		JLabel jlabTitulo = new JLabel("EDITAR VACINA");
		jlabTitulo.setBounds(565, 185, 400, 30);
		
		tela.add(jlabTitulo);
	}
	
	public void tipoVacina() {
		TextoTipoVacina = new JTextField();
		JLabel jlabTipoVacina = new JLabel("Tipo da vacina: ");
		
		TextoTipoVacina.setBounds(560, 250, 200, 30);
		jlabTipoVacina.setBounds(460, 250, 100, 30);
		
		tela.add(jlabTipoVacina);
		tela.add(TextoTipoVacina);
	}
	
	public void dataVacina() {
		TextoDataVacina = new JTextField();
		JLabel jlabDataVacina = new JLabel("Data da vacina: ");
		
		TextoDataVacina.setBounds(560, 300, 100, 30);
	    jlabDataVacina.setBounds(460, 300, 100, 30);
	    
	    tela.add(jlabDataVacina); 
	    tela.add(TextoDataVacina);      
	}
	
	public void dataDose() {
		TextoDataDose = new JTextField();
		JLabel jlabDataDose = new JLabel("Data dose: ");
		
		TextoDataDose.setBounds(560, 350, 200, 30);
		jlabDataDose.setBounds(460, 350, 150, 30);
		
		tela.add(jlabDataDose); 
		tela.add(TextoDataDose);
	}
	
	public void local() {
		TextoLocal = new JTextField();
		JLabel jlabLocal = new JLabel("Local da vacina: ");
		
		TextoLocal.setBounds(560, 400, 200, 30);
		jlabLocal.setBounds(460, 400, 110, 30);
		
		tela.add(jlabLocal);
		tela.add(TextoLocal);
	}
	
	public void lote() {
		TextoLote = new JTextField();
		JLabel jlabLote = new JLabel("Lote da vacina: ");
		
		TextoLote.setBounds(560, 450, 200, 30);
		jlabLote.setBounds(460, 450, 150, 30);
		
		tela.add(jlabLote);
		tela.add(TextoLote);
	}
	
	public void doses() {
        listaDoses = new JComboBox<>(doses);
		JLabel jlabDoses = new JLabel("Número de doses: ");
		
		listaDoses.setBounds(570,500, 190, 30);
		jlabDoses.setBounds(460, 500, 150, 30);
		
		tela.add(jlabDoses);
		tela.add(listaDoses);
	}
	
	public void btnEditarVacina() {
		JButton EditarVacina = new JButton("Editar Vacina");
		EditarVacina.setBounds(520, 580, 200, 40);
	
		EditarVacina.setActionCommand("EditarVacina");
        EditarVacina.addActionListener(this);
		
		tela.add(EditarVacina);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if ("EditarVacina" == ae.getActionCommand()) {
			String tipoVacinaNova = TextoTipoVacina.getText();
			String novaDataVacina = TextoDataVacina.getText();
			String novaDataDose = TextoDataDose.getText();
			String novoLocal = TextoLocal.getText();
			String novoLote = TextoLote.getText();
			String novaDose = (String) listaDoses.getSelectedItem();

			boolean addVacina = dados.adicionarVacina(tipoVacinaNova, novaDataVacina , novaDataDose , novoLocal, novoLote, novaDose);

			int index = dados.buscarVacina(tipoVacinaNova, novaDataVacina);
			
            new TelaListaAnimais(dados, index);
            tela.dispose();
         }
	}
}
