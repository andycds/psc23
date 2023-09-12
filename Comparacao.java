import javax.swing.JOptionPane;

public class Comparacao {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("Qual a primeira string?");
        String s2 = JOptionPane.showInputDialog("Qual a segunda string?");
        // considerando caixa alta e baixa
        int resultado = s1.compareTo(s2);
        if (resultado < 0) {
            JOptionPane.showMessageDialog(null, s1 + " vem antes de " + s2 + " no dicionário");
        } else if (resultado > 0) {
            JOptionPane.showMessageDialog(null, s2 + " vem antes de " + s1 + " no dicionário");
        } else {
            JOptionPane.showMessageDialog(null, s2 + " e " + s1 + " são iguais");
        }
        // desconsiderando caixa alta e baixa
        resultado = s1.compareToIgnoreCase(s2);
        if (resultado < 0) {
            JOptionPane.showMessageDialog(null, s1 + " vem antes de " + s2 + " no dicionário sem caixa");
        } else if (resultado > 0) {
            JOptionPane.showMessageDialog(null, s2 + " vem antes de " + s1 + " no dicionário sem caixa");
        } else {
            JOptionPane.showMessageDialog(null, s2 + " e " + s1 + " são iguais");
        }
    }
}
