import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterfaceGrafica extends JFrame {

    public static void main(String[] args) {
        InterfaceGrafica ig = new InterfaceGrafica();
        ig.setSize(300, 200);
        ig.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(3, 2));
        ig.add(painel);
        JLabel alunoLabel = new JLabel("Aluno");
        painel.add(alunoLabel);
        JTextField alunoTextField = new JTextField(20);
        painel.add(alunoTextField);
        JLabel matriculaLabel = new JLabel("Matricula");
        painel.add(matriculaLabel);
        JTextField matriculaTextField = new JTextField(10);
        painel.add(matriculaTextField);
        JButton salvar = new JButton("salvar");
        painel.add(salvar);
        ig.setVisible(true);
    }

    public InterfaceGrafica() {
        super("Cadastro de Clientes");
    }

}
