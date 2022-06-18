/*24 - Um zoológico muito louco
Escreva um programa que leia a idade de 2 javalis e 2 girafas (considere que a idade dos javalis será sempre diferente, assim como das girafas ). Calcule e escreva a soma das idades do javali mais velho com a girafa mais nova, e o produto das idades do javali mais novo com a girafa mais velha. */
import java.util.Scanner;

public class Ex20{
    public static void main(String[] args){

       System.out.println("Idade do 1º javali");
       Scanner in1 = new Scanner(System.in);
       int java1 = in1.nextInt();

       System.out.println("Idade do 2º javali");
       Scanner in2 = new Scanner(System.in);
       int java2 = in2.nextInt();

       System.out.println("Idade da 1º girafa");
       Scanner in3 = new Scanner(System.in);
       int gira1 = in3.nextInt();

       System.out.println("Idade da 2º girafa");
       Scanner in4 = new Scanner(System.in);
       int gira2 = in4.nextInt();

       int somaIdade = 0;
       int produtoIdade = 0;

       if(java1 == java2 || gira1 == gira2){
           System.out.println("Os mesmos animais devem ter idades diferentes");
       } else {
           if(java1 > java2 && gira1 < gira2){
                somaIdade = java1 + gira1;
                produtoIdade = java2 * gira2;
           } else if(java2 > java1 && gira1 < gira2){
                somaIdade = java2 + gira1;
                produtoIdade = java1 * gira2;
           } else if(java1 > java2 && gira2 < gira1){
                somaIdade = java1 + gira2;
                produtoIdade = java2 * gira1;
           } else if(java2 > java1 && gira2 < gira1){
                somaIdade = java2 + gira2;
                produtoIdade = java1 * gira1;
           }

            System.out.println("A soma das idades do javali mais velho com a girafa mais nova é: " + somaIdade);
            System.out.println("O produto das idades do javali mais novo com a girafa mais velha é: " + produtoIdade);
       }
    }
}