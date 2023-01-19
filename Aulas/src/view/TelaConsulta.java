package view;

import java.util.List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class TelaConsulta implements ActionListener {
    
    private JFrame janela;
    private JLabel lblBusca;
    private JTextField txtBusca;
    private JButton btnBusca;
    private JTable tabela;
    private JScrollPane scroll;
    private List<String> dados;
    private String colunas[];

    public TelaConsulta() {

        String colunas[] = {"Nome", "Idade", "Nome Pet"};

        Object [] []dados= {
            {"Bruna Griphao", "20", "Zezin"},
            {"Joao Gomes", "43", "Arrascaneta"},
            {"Pedro Certezas", "55", "Paulito Sousita"}
        };
        

        janela = new JFrame("Consulta de Clientes!");
        janela.setSize(600, 400);
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        lblBusca = new JLabel("Busca:");
        lblBusca.setBounds(10, 10, 50, 20);
        janela.add(lblBusca);

        txtBusca = new JTextField();
        txtBusca.setBounds(60, 10, 200, 20);
        janela.add(txtBusca);

        btnBusca = new JButton("Buscar");
        btnBusca.setBounds(270, 10, 100, 20);
        btnBusca.setActionCommand("buscar");
        btnBusca.addActionListener(this);


        janela.add(btnBusca);

        tabela = new JTable(dados, colunas);
        scroll = new JScrollPane(tabela);
        scroll.setBounds(10, 40, 560, 300);
        janela.add(scroll);

        janela.setVisible(true);
    }


    public void fazerBusca(String nome) {
        int idx;
        JOptionPane.showMessageDialog(null, "Buscando cliente...");

        for(idx = 0; idx < dados.size(); idx++) {
            if (dados.get(idx).equals(nome)) {
                JOptionPane.showMessageDialog(null, "Cliente encontrado!");
                
                tabela.setValueAt(dados.get(idx), idx, 0);
            }
        }
    }

    public static void main(String[] args) {
        new TelaConsulta();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("buscar")) {
            fazerBusca(txtBusca.getText());
        }
    }
}