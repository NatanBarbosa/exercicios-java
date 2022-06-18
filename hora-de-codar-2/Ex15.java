//19 - Escreva um programa para ler o número de gols marcados pelo Grêmio e o número de gols marcados pelo Inter em um GRENAL. Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.

import java.util.Scanner;

public class Ex15{
    public static void main(String[] args){

       System.out.println("Número de gols do grêmio");
       Scanner in1 = new Scanner(System.in);
       int gremio = in1.nextInt();

       System.out.println("Números de gols do Grenal");
       Scanner in2 = new Scanner(System.in);
       double grenal = in2.nextDouble();

       if(gremio > grenal){
           System.out.println("Grêmio vencedor");
       } else if (grenal > gremio){
           System.out.println("Grenal vencedor");
       } else {
           System.out.println("Empate");
       }
    }
}