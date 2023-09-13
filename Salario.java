public class Salario {
    public static void main(String[] args) {
        double salario = 1000;
        double percentual = 1.5;
        for (int ano = 2006; ano <= 2023; ano++) {
            salario = salario + (salario * (percentual / 100));
            percentual *= 2;
            System.out.println("Ano: " + ano + " salário: " + salario + " percentual do ano seguite: " + percentual);
        }
        System.out.println(salario);
    }
}
