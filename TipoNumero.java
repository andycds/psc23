import javax.swing.JOptionPane;

public class TipoNumero {
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "Positivo");
        } else if (numero == 0) {
            JOptionPane.showMessageDialog(null, "Neutro");
        } else {
            JOptionPane.showMessageDialog(null, "Negativo");
        }
    }
}
