/*20 - Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
Calcular e imprimir o seguinte: 
Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor do seu perímetro. 
Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área. 
Se o número de lados for igual a 5 escrever PENTÁGONO. 

Observação: Considere que o usuário só informará os valores 3, 4 ou 5. 

Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO. 
Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.*/

import java.util.Scanner;

public class Ex16{
    public static void main(String[] args){

       System.out.println("Número de lados do polígono");
       Scanner inl = new Scanner(System.in);
       int qntLados = inl.nextInt();

       System.out.println("Medida do lado (em cm)");
       Scanner inm = new Scanner(System.in);
       double medidaLado = inm.nextDouble();

       if(qntLados == 3){
           double perimetro = medidaLado * 3;
           System.out.println("Seu polígono é um triângulo, com perímetro de " + perimetro + "cm");
       } else if(qntLados == 4){
           double area = medidaLado * medidaLado;
           System.out.println("Seu polígono é um quadrado, com área de " + area + "cm^2");
       } else if(qntLados == 5){
           System.out.println("Seu polígono é um Pentágono");
       } else if(qntLados < 3) {
            System.out.println("Isso não é um polígono");
       } else {
            System.out.println("Polígono não identificado");
       }
    }
}