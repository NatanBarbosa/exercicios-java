//Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores. 
import java.util.Scanner;

public class Ex7{
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

        if(num1 < num2 && num1 < num3){
            System.out.println("Os números " + num2 + " e " + num3 +  " são os maiores");
        } else if(num2 < num1 && num2 < num3){
            System.out.println("Os números " + num1 + " e " + num3 +  " são os maiores");
        } else if(num3 < num1 && num3 < num2){
            System.out.println("Os números " + num1 + " e " + num2 +  " são os maiores");
        } else {
            System.out.println("Não digite números iguais");
        }
    }
}