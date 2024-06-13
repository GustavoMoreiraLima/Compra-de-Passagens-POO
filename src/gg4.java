import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class gg4 {
    String nome;
    String sobrenome;
    String cpf;
    String telefone;
    String dddTelefone;
    String email;

    private JFrame frame;
    private JPanel painelPrincipal;
    private JComboBox<String> comboBoxOrigem;
    private JComboBox<String> comboBoxDestino;
    private JTextField campoDataPartida;
    private JTextField campoDataVolta;
    private JCheckBox checkboxStandard;
    private JCheckBox checkboxSemiLeito;
    private JCheckBox checkboxPremium;
    private JButton botaoEncontrarPassagem;

    public gg4() {
        inicializarComponentes();
        configurarFrame();
        adicionarComponentesAoPainel();
        configurarEventos();
    }

    private void inicializarComponentes() {
        frame = new JFrame("Seleção de Origem e Destino");
        painelPrincipal = new JPanel();
        comboBoxOrigem = new JComboBox<>();
        comboBoxDestino = new JComboBox<>();
        campoDataPartida = new JTextField(8); // Define o tamanho da coluna
        campoDataVolta = new JTextField(8); // Define o tamanho da coluna
        checkboxStandard = new JCheckBox("Standard");
        checkboxSemiLeito = new JCheckBox("Semi-Leito");
        checkboxPremium = new JCheckBox("Premium");
        botaoEncontrarPassagem = new JButton("Encontrar"); //Pode mudar os nomes aqui
    }

    private void configurarFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 550); //configurar o tamanho da tela, consegue coloca em tela cheia
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    private void adicionarComponentesAoPainel() {
        painelPrincipal.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        painelPrincipal.add(new JLabel("Origem:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        painelPrincipal.add(comboBoxOrigem, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        painelPrincipal.add(new JLabel("Destino:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        painelPrincipal.add(comboBoxDestino, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        painelPrincipal.add(new JLabel("Data de Partida:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        painelPrincipal.add(campoDataPartida, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        painelPrincipal.add(new JLabel("Data de Volta (opcional):"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        painelPrincipal.add(campoDataVolta, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        painelPrincipal.add(new JLabel("Classe:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        painelPrincipal.add(checkboxStandard, gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        painelPrincipal.add(checkboxSemiLeito, gbc);

        gbc.gridx = 3;
        gbc.gridy = 4;
        painelPrincipal.add(checkboxPremium, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 4;
        painelPrincipal.add(botaoEncontrarPassagem, gbc); //São a posição de cada elemento dentro do quadrado

        frame.add(painelPrincipal);
        //Adicionando itens ás comboBox.
        comboBoxOrigem.addItem("GO");
        comboBoxDestino.addItem("GO");
        comboBoxOrigem.addItem("BSB");
        comboBoxDestino.addItem("BSB");
        comboBoxOrigem.addItem("CE");
        comboBoxDestino.addItem("CE");
        comboBoxOrigem.addItem("SP");
        comboBoxDestino.addItem("SP");
        comboBoxOrigem.addItem("MG");
        comboBoxDestino.addItem("MG");
        comboBoxOrigem.addItem("RJ");
        comboBoxDestino.addItem("RJ");
        comboBoxOrigem.addItem("BA");
        comboBoxDestino.addItem("BA");
    }

    private void configurarEventos() {
        botaoEncontrarPassagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String origem = (comboBoxOrigem.getSelectedItem().toString());
                String destino = (comboBoxDestino.getSelectedItem().toString());
                String dataPartida = (campoDataPartida.getText());
                String dataVolta = (campoDataVolta.getText());
                String classe = "";
                if (checkboxStandard.isSelected()) {
                    classe = ("Standard");
                } else if (checkboxSemiLeito.isSelected()) {
                    classe = ("Semi-Leito");
                } else if (checkboxPremium.isSelected()) {
                    classe = ("Premium");
                }

                JOptionPane.showMessageDialog(null, "Passagens buscadas com sucesso!");

                //Iniciando a proxima tela.
                TabelaComBotaoConfirmacao tela = new TabelaComBotaoConfirmacao();

                //Guardando as variaveis p/ proxima tela.
                tela.setNome(getNome());
                tela.setSobrenome(getSobrenome());
                tela.setCpf(getCPF());
                tela.setDataIda(dataPartida);
                tela.setDataVolta(dataVolta);
                tela.setClasse(classe);
            }
        });
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    public String getCPF(){
        return cpf;
    }
}