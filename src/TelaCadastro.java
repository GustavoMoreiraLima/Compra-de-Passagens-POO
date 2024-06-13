import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame {

    private JLabel lblNome, lblSobrenome, lblCpf, lblTelefone, lblDddTelefone, lblEmail;
    private JTextField txtNome, txtSobrenome, txtCpf, txtTelefone, txtDddTelefone, txtEmail;
    private JButton btnConfirmar;
    public TelaCadastro() {
        super("Tela de Cadastro");
        // Criação dos componentes
        lblNome = new JLabel("Nome:");
        lblSobrenome = new JLabel("Sobrenome:");
        lblCpf = new JLabel("CPF:");
        lblTelefone = new JLabel("Telefone:");
        lblDddTelefone = new JLabel("(DDD) Telefone:");
        lblEmail = new JLabel("E-mail:");

        btnConfirmar = new JButton("Confirmar");

        txtNome = new JTextField(20);
        txtSobrenome = new JTextField(20);
        txtCpf = new JTextField(11);
        txtTelefone = new JTextField(9);
        txtDddTelefone = new JTextField(3);
        txtEmail = new JTextField(30);

        // Layout da tela
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.HORIZONTAL;

        constraints.gridx = 0;
        constraints.gridy = 0;
        getContentPane().add(lblNome, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        getContentPane().add(txtNome, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        getContentPane().add(lblSobrenome, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        getContentPane().add(txtSobrenome, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        getContentPane().add(lblCpf, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        getContentPane().add(txtCpf, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        getContentPane().add(lblTelefone, constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        getContentPane().add(txtTelefone, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        getContentPane().add(lblDddTelefone, constraints);

        constraints.gridx = 1;
        constraints.gridy = 4;
        getContentPane().add(txtDddTelefone, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        getContentPane().add(lblEmail, constraints);

        constraints.gridx = 1;
        constraints.gridy = 5;
        getContentPane().add(txtEmail, constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;
        getContentPane().add(btnConfirmar, constraints);

        // Definição do tamanho da tela
        pack();

        // Centralização da tela
        setLocationRelativeTo(null);

        // Visibilidade da tela
        setVisible(true);

        // Definição do padrão de fechamento da tela
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        botaoConfirmar();
    }
    //Configurando o botão.
    public void botaoConfirmar() {
        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Guardando os dados nas variaveis.
                String nome = txtNome.getText();
                String sobrenome = (txtSobrenome.getText());
                String cpf = (txtCpf.getText());
                String telefone = (txtTelefone.getText());
                String dddTelefone = (txtDddTelefone.getText());
                String email = (txtEmail.getText());

                //Iniciando a proxima tela.
                gg4 telaori = new gg4();
                //Guardando as variaveis p/ proxima tela.
                telaori.setNome(nome);
                telaori.setSobrenome(sobrenome);
                telaori.setCPF(cpf);
            }
        });
    }
}