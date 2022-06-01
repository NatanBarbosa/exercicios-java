import java.util.Scanner;

public class Trapezio{
    public static void main(String[] args){
        System.out.println("Vamos calcular a área do Trapézio");

        System.out.println("Digite o tamanho da base maior em m");
        Scanner baseMaiorIn = new Scanner(System.in);
        double baseMaior = baseMaiorIn.nextDouble();

        System.out.println("Digite o tamanho da base menor em m");
        Scanner baseMenorIn = new Scanner(System.in);
        double baseMenor = baseMenorIn.nextDouble();

        System.out.println("Digite o tamanho da altura em m");
        Scanner alturaIn = new Scanner(System.in);
        double altura = alturaIn.nextDouble();

        double area = (baseMaior * baseMenor) / altura;
        System.out.println("A área desse trapézio é: " + area + "m");
    }
}