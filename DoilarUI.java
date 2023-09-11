import javax.swing.JOptionPane;

public class DoilarUI {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        double cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do Dólar:"));
        double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de Dólares: "));
        double real = cotacao * quantidade;
        JOptionPane.showMessageDialog(null,
                "Olá " + nome + "\nQuantidade em Dólar: " + quantidade + "; em Real: " + real);
    }
}
