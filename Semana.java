import javax.swing.JOptionPane;

public class Semana {
    public static void main(String[] args) {
        int diaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7: "));

        // if (diasemana == 1) {
        // JOptionPane.showMessageDialog(null, "Domingo");
        // } else if (diasemana == 2) {
        // JOptionPane.showMessageDialog(null, "Segunda");
        // } else if (diasemana == 3) {
        // JOptionPane.showMessageDialog(null, "Terça");
        // } else if (diasemana == 4) {
        // JOptionPane.showMessageDialog(null, "Quarta");
        // } else if (diasemana == 5) {
        // JOptionPane.showMessageDialog(null, "Quinta");
        // } else if (diasemana == 6) {
        // JOptionPane.showMessageDialog(null, "Sexta");
        // } else if (diasemana == 7) {
        // JOptionPane.showMessageDialog(null, "Sábado");
        // }
        switch (diaSemana) {
            case 1: {
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            }
            case 2: {
                JOptionPane.showMessageDialog(null, "Segunda");
                break;
            }
            case 3: {
                JOptionPane.showMessageDialog(null, "Terça");
                break;
            }
            case 4: {
                JOptionPane.showMessageDialog(null, "Quarta");
                break;
            }
            case 5: {
                JOptionPane.showMessageDialog(null, "Quinta");
                break;
            }
            case 6: {
                JOptionPane.showMessageDialog(null, "Sexta");
                break;
            }
            case 7: {
                JOptionPane.showMessageDialog(null, "Sábado");
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "Número inválido");
            }

        }
    }
}
