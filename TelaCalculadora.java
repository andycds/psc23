import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.*;

public class TelaCalculadora extends JFrame {
    public static void main(String[] args) {
        TelaCalculadora tc = new TelaCalculadora();
        JPanel painel = new JPanel(new GridLayout(1, 2));
        tc.add(painel);
        // tc.setLayout(new GridLayout(1, 2));
        JLabel l = new JLabel("Cliente");
        painel.add(l);
        JButton b = new JButton("Clique");
        painel.add(b);
        tc.setSize(300, 200);
        tc.setVisible(true);
        tc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public TelaCalculadora() {
        super("Frame");
    }

}