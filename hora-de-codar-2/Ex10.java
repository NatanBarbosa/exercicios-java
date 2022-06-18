//13. Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas). 14 - Acrescente ao exercício anterior a mensagem "Infelizmente, você foi reprovado!" caso a média calculada seja menor que 6.0.

import java.util.Scanner;

public class Ex10{
    public static void main(String[] args){
        double soma = 0;
        double nota = 0;

        for(int i = 0; i < 4; i++){
            do{
                System.out.println("Digite a " + (i + 1) + "º nota");
                Scanner in = new Scanner(System.in);
                nota = in.nextDouble();
            } while (nota < 0 || nota > 10);

            soma = soma + nota;
        }

        double media = soma / 4;

        if(media > 6){
            System.out.println("Você foi aprovado");
        } else {
            System.out.println("Infelizmente você foi reprovado");
        }
    }
}