import java.util.Scanner;

public class Losango{
    public static void main(String[] args){
        System.out.println("Vamos calcular a área do losango");

        System.out.println("Digite o tamanho da diagonal maior em m");
        Scanner diagMaiorIn = new Scanner(System.in);
        double diagMaior = diagMaiorIn.nextDouble();

        System.out.println("Digite o tamanho da diagonal menor em m");
        Scanner diagMenorIn = new Scanner(System.in);
        double diagMenor = diagMenorIn.nextDouble();

        double area = (diagMaior * diagMenor) / 2;
        System.out.println("A área desse losango é: " + area + "m");
    }
}