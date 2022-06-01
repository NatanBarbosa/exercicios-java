import java.util.Scanner;

public class Circulo{
    public static void main(String[] args){
        System.out.println("Vamos calcular a área do círculo");

        System.out.println("Digite o tamanho da raio em m");
        Scanner raioIn = new Scanner(System.in);
        double raio = raioIn.nextDouble();

        double area = 3.14 * (raio * raio);
        System.out.println("A área desse circulo é: " + area + "m");
    }
}