/*Escreva uma classe para representar carros. Adicione a ela dois atributos e dois
métodos que lhe pareçam razoáveis. Os dois atributos devem ser encapsulados.
Escreva métodos getters/setters para cada um deles.*/

public class Carro {

    private String cor;
    private String marca;
    private String modelo;
    private int velocidade = 0;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public Carro(String modelo, String marca, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (!modelo.isBlank()) {
            this.modelo = modelo;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void buzinar() {
        System.out.println("fom");
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void frear() {
        System.out.println("rrrrrrr...");
        this.velocidade = 0;
    }

}
