import java.util.Scanner;

public class Triangulo{
    public static void main(String[] args){
        System.out.println("Vamos calcular a área do triângulo");

        System.out.println("Digite o tamanho da base em m");
        Scanner baseIn = new Scanner(System.in);
        double base = baseIn.nextDouble();

        System.out.println("Digite o tamanho da altura em m");
        Scanner alturaIn = new Scanner(System.in);
        double altura = alturaIn.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("A área desse triângulo é: " + area + "m");
    }
}