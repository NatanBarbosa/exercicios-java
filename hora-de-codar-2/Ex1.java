//1. Escreva um programa em que o usuário informe dois números utilizando o "prompt". Então escreva em tela o maior deles.
import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){
        System.out.println("digite um número");
        Scanner num1In = new Scanner(System.in);
        double num1 = num1In.nextDouble();

        System.out.println("digite outro número");
        Scanner num2In = new Scanner(System.in);
        double num2 = num2In.nextDouble();

        if(num1 > num2){
            System.out.println("O número " + num1 + " é o maior");
        } else {
            System.out.println("O número " + num2 + " é o maior");
        }
    }
}