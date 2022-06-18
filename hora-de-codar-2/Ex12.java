//16 - As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas (considere que o usuário informará a quantidade), e calcule e escreva o valor total da compra.

import java.util.Scanner;

public class Ex12{
    public static void main(String[] args){
       System.out.println("Quantas maçãs desejas comprar?");
       Scanner in = new Scanner(System.in);
       int qntMacas = in.nextInt();

        double valorCompra = 0;

       if(qntMacas >= 12){
           valorCompra = qntMacas * 0.25;
       } else {
           valorCompra = qntMacas * 0.3;
       }

       System.out.println("O valor da compra foi de R$" + valorCompra);
    }
}