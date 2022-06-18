/*18 - Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino 2: masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas:
- Para homens: (72.7 * h) - 58
- Pra mulheres: (62.1 * h) - 44.7
*/

import java.util.Scanner;
import java.util.Locale;

public class Ex14{
    public static void main(String[] args){

       System.out.println("Qual seu sexo (1: feminino 2: masculino)?");
       Scanner inS = new Scanner(System.in);
       int sexo = inS.nextInt();

       System.out.println("Qual sua altura? (em metros)");
       Scanner inh = new Scanner(System.in).useLocale(Locale.ENGLISH);
       double h = inh.nextDouble();

       double pesoIdeal = 0;

       if(sexo == 1){
           pesoIdeal = (62.1 * h) - 44.7;
       } else {
           pesoIdeal = (72.7 * h) - 58;
       }

       System.out.println("Seu peso ideal é " + pesoIdeal + "kg");
    }
}