import javax.swing.JOptionPane;

public class TesteCarro {
    public static void main(String[] args) {

        String modelo1 = JOptionPane.showInputDialog("Modelo 1");
        String cor1 = JOptionPane.showInputDialog("Cor 1");
        String marca1 = JOptionPane.showInputDialog("Marca 1");
        Carro um = new Carro(modelo1, marca1, cor1);

        String modelo2 = JOptionPane.showInputDialog("Modelo 2");
        String cor2 = JOptionPane.showInputDialog("Cor 2");
        String marca2 = JOptionPane.showInputDialog("Marca 2");
        Carro dois = new Carro(modelo2);
        dois.setCor(cor2);
        dois.setMarca(marca2);

        um.buzinar();
        dois.buzinar();

        um.frear();
        dois.frear();

        System.out.println("Um");
        System.out.println("modelo: " + um.getModelo());
        System.out.println("cor: " + um.getCor());
        System.out.println("marca: " + um.getMarca());
        System.out.println("velocidade: " + um.getVelocidade());

        System.out.println("\nDois");
        System.out.println("modelo: " + dois.getModelo());
        System.out.println("cor: " + dois.getCor());
        System.out.println("marca: " + dois.getMarca());
        System.out.println("velocidade: " + dois.getVelocidade());

    }
}
