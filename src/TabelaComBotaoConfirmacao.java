import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TabelaComBotaoConfirmacao {
    String nome;
    String sobrenome;
    String cpf;
    String dataIda;
    String dataVolta;
    String classe;
    private JFrame frame;
    private JTable tabela;
    private JScrollPane scrollPane;
    private JButton botaoConfirmar;

    public TabelaComBotaoConfirmacao() {
        criarTela();
        mostrarTela();
        adicionarAcaoBotaoConfirmar();
    }

    private void criarTela() {
        frame = new JFrame("Tabela com Opções");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar tabela com 4 linhas e 3 colunas
        String[][] dados = {{"COMPANHIAS", "CRONOGRAMA", "R$"}, {"Empresa A", "08:00 - 18:00", "R$ 50,00"}, {"Empresa B", "09:00 - 19:00", "R$ 60,00"}, {"Empresa C", "10:00 - 20:00", "R$ 70,00"}};
        String[] colunas = {"EMPRESAS", "HORÁRIOS", "VALORES"};
        tabela = new JTable(dados, colunas);

        // Criar JScrollPane para rolagem da tabela
        scrollPane = new JScrollPane(tabela);

        // Criar botão "Confirmar"
        botaoConfirmar = new JButton("Confirmar Empresa");

        // Organizar componentes no layout
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout());
        painelPrincipal.add(scrollPane, BorderLayout.CENTER);
        painelPrincipal.add(botaoConfirmar, BorderLayout.SOUTH);

        frame.setContentPane(painelPrincipal);

        // Ajustar tamanho da tela
        frame.pack();
    }

    private void mostrarTela() {
        frame.setVisible(true);
    }

    private void adicionarAcaoBotaoConfirmar() {
        botaoConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obter linha selecionada
                int linhaSelecionada = tabela.getSelectedRow();

                if (linhaSelecionada != -1) {
                    // Obter empresa selecionada
                    String empresaSelecionada = (String) tabela.getValueAt(linhaSelecionada, 0);

                    // Exibir mensagem de confirmação
                    JOptionPane.showMessageDialog(frame, "Empresa selecionada: " + empresaSelecionada);

                    //Abrindo o relatório com as informações guardadas.
                    Relatorio relatorio = new Relatorio();
                    relatorio.setNome(nome, sobrenome);
                    relatorio.setCpf(cpf);
                    relatorio.setDataIda(dataIda);
                    relatorio.setDataVolta(dataVolta);
                    relatorio.setHora(tabela.getValueAt(linhaSelecionada, 1).toString());
                    relatorio.setClasse(classe);
                    relatorio.setEmpresa(empresaSelecionada);
                    relatorio.setValor(tabela.getValueAt(linhaSelecionada, 2).toString());

                } else {
                    // Nenhuma linha selecionada
                    JOptionPane.showMessageDialog(frame, "Selecione uma empresa para confirmar.");
                }
            }
        });
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setDataIda(String dataIda){
        this.dataIda = dataIda;
    }
    public void setDataVolta(String dataVolta){
        this.dataVolta = dataVolta;
    }
    public void setClasse(String classe){
        this.classe = classe;
    }
}