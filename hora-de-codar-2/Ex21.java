/*25 - Uma micro calculadora
Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a serem
executadas (codificada da seguinte forma: 1.Adição, 2.Subtração, 3.Divisão, 4.Multiplicação).
O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos. Observação: Considere
que só serão lidos os valores 1, 2, 3 ou 4 para as operações*/

import java.util.Scanner;

public class Ex21{
    public static void main(String[] args){

       System.out.println("Digite o 1º número");
       Scanner in1 = new Scanner(System.in);
       double n1 = in1.nextDouble();

       System.out.println("Digite o 2º número");
       Scanner in2 = new Scanner(System.in);
       double n2 = in2.nextDouble();

       System.out.println("Que operação deseja fazer entre " + n1 + " e " + n2);
       System.out.println("1.Adição, 2.Subtração, 3.Divisão, 4.Multiplicação");
       Scanner in3 = new Scanner(System.in);
       int operacao = in3.nextInt();

        double resultado = 0;

       switch(operacao){
            case 1:
                resultado = n1 + n2;
                break;
            case 2:
                resultado = n1 - n2;
                break;
            case 3:
                resultado = n1 / n2;
                break;
            case 4:
                resultado = n1 * n2;
                break;
            default:
                resultado = 0;
       }

       System.out.println("O resultado da operação é " + resultado);

    }
}