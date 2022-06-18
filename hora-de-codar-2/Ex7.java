//Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se esses números forem maiores que 0 e menores que 10. No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste". Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"

import java.util.Scanner;

public class Ex7{
    public static void main(String[] args){
        int soma = 0;
        int length = 0;

        for(int i = 0; i < 4; i++){
            System.out.println("Digite o " + (i + 1) + "º número");

            Scanner in = new Scanner(System.in);
            int num = in.nextInt();

            if(num > 0 && num <= 10){
                soma = soma + num;
                length = length + 1;
            }
        }

        double media = soma / length;

        if(media > 5){
            System.out.println("Você passou no teste com média " + media);
        } else {
             System.out.println("Tente novamente. Média: " + media);   
        }

    }
}