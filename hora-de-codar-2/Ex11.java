//15 - Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).

import java.util.Scanner;

public class Ex11{
    public static void main(String[] args){
       System.out.println("Ano que você nasceu");
       Scanner in = new Scanner(System.in);
       int anoNasc = in.nextInt();

       int idade = 2022 - anoNasc;

       if(idade > 16){
           System.out.println("Você já pode votar");
       } else {
           System.out.println("Você ainda não pode votar");
       }
    }
}