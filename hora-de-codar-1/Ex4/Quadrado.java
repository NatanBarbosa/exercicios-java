import java.util.Scanner;

public class Quadrado{
    public static void main(String[] args){
        System.out.println("Vamos calcular a área do quadrado");

        System.out.println("Digite o lado do quadrado em m");
        Scanner ladoIn = new Scanner(System.in);
        double lado = ladoIn.nextDouble();

        double area = lado * lado;
        System.out.println("A área desse quadrado é: " + area + "m");
    }
}