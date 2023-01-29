package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controler.*;

public class TelaCadastroVacina implements ActionListener {
	private static JFrame tela;
	private ControleDados dados;
	private ControleVacinas dadosVacina;
	int indexAnimal; 
	int indexVacina;

	JTextField TextoTipoVacina;
	JTextField TextoDataVacina;
	JTextField TextoDataDose;
	JTextField TextoLocal;
	JTextField TextoLote;

	JComboBox listaDoses;

	String doses[] = { "1", "2", "3", "Mais de 3" };

	TelaCadastroVacina(ControleDados dados, int index) {
		this.dados = dados;
		indexAnimal = index;
		dadosVacina = new ControleVacinas(dados);
		
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
		JLabel jlabTitulo = new JLabel("CADASTRO DE VACINA");
		jlabTitulo.setBounds(545, 185, 400, 30);

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

		listaDoses.setBounds(570, 500, 190, 30);
		jlabDoses.setBounds(460, 500, 150, 30);

		tela.add(jlabDoses);
		tela.add(listaDoses);
	}

	public void btnAdicionarVacina() {
		JButton adicionarVacina = new JButton("Adicionar Vacina");
		adicionarVacina.setBounds(520, 580, 200, 40);

		adicionarVacina.setActionCommand("AdicionarVacina");
		adicionarVacina.addActionListener(this);

		tela.add(adicionarVacina);
	}

	public void actionPerformed(ActionEvent ae) {
		if ("AdicionarVacina" == ae.getActionCommand()) {

			String tipoVacina = TextoTipoVacina.getText();
			String dataVacina = TextoDataVacina.getText();
			String dataDose = TextoDataDose.getText();
			String local = TextoLocal.getText();
			String lote = TextoLote.getText();
			String doses = (String) listaDoses.getSelectedItem();

			boolean addVacina = dados.adicionarVacina(tipoVacina, dataVacina, dataDose, local, lote, doses);

			int index = dados.buscarVacina(tipoVacina, dataVacina);

			if (addVacina) {
				new TelaListaAnimais(dados, indexAnimal);
				tela.dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Vacina já cadastrada!");
			}
		}
	}
}
