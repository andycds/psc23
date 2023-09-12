import javax.swing.JOptionPane;

public class Strings {
    public static void main(String[] args) {
        String teste = "Hello, strings";
        int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição desejada"));
        String resultado = String.format(
                "O caractere na posição %d é o %c.", posicao, teste.charAt(posicao));
        JOptionPane.showMessageDialog(null, resultado);
    }

}
