//Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. 
import java.util.Scanner;

public class Ex6{
    public static void main(String[] args){
        System.out.println("Digite um número");
        Scanner num1In = new Scanner(System.in);
        double num1 = num1In.nextDouble();

        System.out.println("Digite outro número");
        Scanner num2In = new Scanner(System.in);
        double num2 = num2In.nextDouble();

        System.out.println("Digite outro número");
        Scanner num3In = new Scanner(System.in);
        double num3 = num3In.nextDouble();

        if(num1 > num2 && num1 > num3){
            System.out.println("O número " + num1 + " é o maior");
        } else if(num2 > num1 && num2 > num3){
            System.out.println("O número " + num2 + " é o maior");
        } else if(num3 > num1 && num3 > num2){
            System.out.println("O número " + num3 + " é o maior");
        } else {
            System.out.println("Não digite números iguais");
        }
    }
}