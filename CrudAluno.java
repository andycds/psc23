import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

public class CrudAluno extends JFrame {

    private Font font = new Font("Arial", Font.BOLD, 32);
    private JTextField matricula = new JTextField(30);
    private JTextField nome = new JTextField(30);
    private JTextField email = new JTextField(30);
    private JButton novo = new JButton("novo");
    private JButton apagar = new JButton("apagar");
    private JButton voltar = new JButton("<");
    private JButton avancar = new JButton(">");
    private JButton salvar = new JButton("salvar");

    public static void main(String[] args) {
        CrudAluno ca = new CrudAluno();
        ca.desenhar();
    }

    public void desenhar() {
        setSize(940, 340);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel painel = new JPanel(new BorderLayout());
        add(painel);

        JPanel painelCentral = new JPanel(new GridLayout(6, 1));
        painel.add(painelCentral, BorderLayout.CENTER);

        JPanel painelInferior = new JPanel();
        painel.add(painelInferior, BorderLayout.SOUTH);

        painelCentral.add(criarLabel("Matrícula"));
        painelCentral.add(matricula);
        painelCentral.add(criarLabel("Aluno"));
        painelCentral.add(nome);
        painelCentral.add(criarLabel("Email"));
        painelCentral.add(email);
        estilizarComponentes();

        painelInferior.add(novo);
        painelInferior.add(apagar);
        painelInferior.add(voltar);
        painelInferior.add(avancar);
        painelInferior.add(salvar);

        this.setVisible(true);
    }

    private void estilizarComponentes() {
        matricula.setFont(font);
        nome.setFont(font);
        email.setFont(font);
        novo.setFont(font);
        apagar.setFont(font);
        voltar.setFont(font);
        avancar.setFont(font);
        salvar.setFont(font);
    }

    public CrudAluno() {
        super("Alunos");
    }

    JLabel criarLabel(String nome) {
        JLabel label = new JLabel(nome);
        label.setFont(font);
        return label;
    }
}
