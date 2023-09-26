public class CarroAcesso {
    public static void main(String[] args) {
        Carro uno = new Carro("Uno");
        uno.setCor("vermelho");
        uno.setMarca("Fiat");
        Carro renegade = new Carro("Renegade", "Jeep", "Prata");
        System.out.println("modelo: " + uno.getModelo());
        System.out.println("cor: " + renegade.getCor());
    }
}
