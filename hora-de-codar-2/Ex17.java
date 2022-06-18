/*21 - Escreva um programa que leia as notas das duas avaliações normais e a nota da avaliação optativa. Calcular a média do semestre considerando que a prova optativa substitui a nota mais baixa entre as duas primeiras avaliações. Escrever a média e mensagens que indiquem se o aluno foi aprovado, reprovado ou está em exame, de acordo com as informações abaixo:*/

import java.util.Scanner;

public class Ex17{
    public static void main(String[] args){

       System.out.println("Nota da 1º avaliação");
       Scanner in1 = new Scanner(System.in);
       double n1 = in1.nextDouble();

       System.out.println("Nota da 2º avaliação");
       Scanner in2 = new Scanner(System.in);
       double n2 = in2.nextDouble();

       System.out.println("Nota da 3º avaliação");
       Scanner in3 = new Scanner(System.in);
       double nopt = in3.nextDouble();

       if(n1 < n2 && nopt > n1){
           n1 = nopt;
       } else if (n2 < n1 && nopt > n2){
           n2 = nopt;
       }

       double media = (n1 + n2) / 2;

        if(media >= 6){
            System.out.println("Aprovado");
        } else if(media >= 3 && media < 6){
            System.out.println("Exame");
        } else {
            System.out.println("Reprovado");
        }
    }
}