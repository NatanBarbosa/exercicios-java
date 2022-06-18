/*Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
Sabendo-se que o preço do combustível é de R$ 2,90, escreva um programa para ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia, o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. Sabendo que o carro desse taxista roda 14 kilômetros por litro de gasolina, crie um programa que calcule e escreva: a média do consumo em Km/L e o lucro (líquido) do dia.*/

import java.util.Scanner;

public class Ex8{
    public static void main(String[] args){
        System.out.println("Marcação do odômetro (km) no início do dia: ");
        Scanner inOi = new Scanner(System.in);
        double odometroInicio = inOi.nextDouble();

        System.out.println("Marcação do odômetro (km) no fim do dia: ");
        Scanner inOf = new Scanner(System.in);
        double odometroFim = inOf.nextDouble();

        System.out.println("Valor total recebido pelos passageiros: ");
        Scanner inVb = new Scanner(System.in);
        double valorBruto = inVb.nextDouble();

        //14km por litro de gasolina

        double litrosGasolina = (odometroFim - odometroInicio) / 14;
        double gastoGasolina = litrosGasolina * 2.9;
        double lucroLiquido = valorBruto - gastoGasolina;

        System.out.println("Você gastou hoje: " + litrosGasolina + " L de gasolina (" + gastoGasolina + "R$)");
        System.out.println("Seu lucro foi de: " + lucroLiquido);
    }
}