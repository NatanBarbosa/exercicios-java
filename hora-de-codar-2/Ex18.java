//22. A Loja Remi du Fromage está com uma promoção onde cada capacete artesanal para tartaruga custa R$18.230 e pode ser pago em até 15 vezes sem juros. Crie um programa onde o usuário possa informar o valor parcelas que deseja pagar e exiba o valor de cada parcela.

import java.util.Scanner;

public class Ex18{
    public static void main(String[] args){

       System.out.println("Em quantas parcelas você vai pagar o capacete artesanal para tartaruga (R$18.230)");
       Scanner in = new Scanner(System.in);
       int parcelas = in.nextInt();

       if(parcelas > 15){
           System.out.println("A promoção do capacete só permite até 15 parcelas sem juros");
       } else {
           double precoParcela = 18230 / parcelas;
           System.out.println("O preço da parcela (" + parcelas + " parcelas) sai por R$" + precoParcela);
       }
    }
}