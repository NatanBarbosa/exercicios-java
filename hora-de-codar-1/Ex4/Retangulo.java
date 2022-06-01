import java.util.Scanner;

public class Retangulo{
    public static void main(String[] args){
        System.out.println("Vamos calcular a área do retângulo");

        System.out.println("Digite a base o retângulo em m");
        Scanner baseIn = new Scanner(System.in);
        double base = baseIn.nextDouble();

        System.out.println("Digite a altura o retângulo em m");
        Scanner alturaIn = new Scanner(System.in);
        double altura = alturaIn.nextDouble();

        double area = base * altura;
        System.out.println("A área desse retângulo é: " + area + "m");
    }
}