import javax.swing.*;

public class Relatorio {
    private JFrame frame;
    private JLabel lblnome;
    private JLabel nome;
    private JLabel lblcpf;
    private JLabel cpf;
    private JLabel lblDataIda;
    private JLabel dataIda;
    private JLabel lblDataVolta;
    private JLabel dataVolta;
    private JLabel lblHora;
    private JLabel hora;
    private JLabel empresa;
    private JLabel lblEmpresa;
    private JLabel lblValor;
    private JLabel valor;
    private JPanel painelPrincipal;
    private JLabel lblClasse;
    private JLabel classe;

    public Relatorio() {
        criarTela();
    }
    public void setNome(String nome1, String sobrenome){
        nome.setText(nome1 + " " + sobrenome);
    }
    public void setCpf(String cpf1){
        cpf.setText(cpf1);
    }
    public void setDataIda(String dataIda1){
        dataIda.setText(dataIda1);
    }
    public void setDataVolta(String dataVolta1){
        dataVolta.setText(dataVolta1);
    }
    public void setHora(String hora1){
        hora.setText(hora1);
    }
    public void setEmpresa(String empresa1){
        empresa.setText(empresa1);
    }
    public void setValor(String valor1){
        valor.setText(valor1);
    }
    public void setClasse(String classe1){
        classe.setText(classe1);
    }

    public void criarTela() {
        frame = new JFrame("Relatório");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(painelPrincipal);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLocation(500, 150);
        frame.setSize(420, 580);
    }
}
