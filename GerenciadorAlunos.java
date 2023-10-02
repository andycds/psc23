import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;

public class GerenciadorAlunos extends JFrame {

    private Font font = new Font("Arial", Font.BOLD, 32);
    JTextField login = new JTextField(30);
    JPasswordField senha = new JPasswordField(30);

    public static void main(String[] args) {
        GerenciadorAlunos ga = new GerenciadorAlunos();
        ga.desenhar();
    }

    public void desenhar() {
        this.setSize(940, 240);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel painel = new JPanel();
        this.add(painel);
        painel.add(criarLabel("Login"));
        login.setFont(font);
        painel.add(login);
        painel.add(criarLabel("Senha"));
        painel.add(senha);
        senha.setFont(font);
        painel.add(criarBotaoCancelar());
        JButton ok = new JButton("ok");
        painel.add(ok);
        ok.setFont(font);
        this.setVisible(true);
    }

    JLabel criarLabel(String nome) {
        JLabel loginLabel = new JLabel(nome);
        loginLabel.setFont(font);
        return loginLabel;
    }

    JButton criarBotaoCancelar() {
        JButton cancelar = new JButton("cancelar");
        cancelar.setFont(font);
        cancelar.addActionListener(a -> {
            login.setText("");
            senha.setText("");
        });
        return cancelar;
    }

    public GerenciadorAlunos() {
        super("Login");
    }
}
