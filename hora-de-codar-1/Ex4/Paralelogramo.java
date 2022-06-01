import java.util.Scanner;

public class Paralologramo{
    public static void main(String[] args){
        System.out.println("Vamos calcular a área do paralelogramo");

        System.out.println("Digite a base o paralelogramo em m");
        Scanner baseIn = new Scanner(System.in);
        double base = baseIn.nextDouble();

        System.out.println("Digite a altura o paralelogramo em m");
        Scanner alturaIn = new Scanner(System.in);
        double altura = alturaIn.nextDouble();

        double area = base * altura;
        System.out.println("A área desse paralelogramo é: " + area + "m");
    }
}