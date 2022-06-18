/*A equipe Mercedes deseja calcular o número mínimo de litros que deverá colocar no tanque de seu carro para que ele possa percorrer um determinado número de voltas até o primeiro reabastecimento

Escreva um programa que leia o comprimento da pista (em metros), o número total de voltas a serem percorridas no grande prêmio, o número de reabastecimentos desejados e o consumo de combustível do carro (em Km/L).

O programa deve calcular e escrever o número mínimo de litros necessários para percorrer até o primeiro reabastecimento.
Observação: considere que o número de voltas entre os reabastecimentos é o mesmo.

O usuário deve informar a quantidade de quilômetros total do circuito e a quantidade de litros que o carro pode possuir.*/

import java.util.Scanner;

public class Ex9{
    public static void main(String[] args){
        System.out.println("Marinsira o comprimento da pista (em metros): ");
        Scanner inC = new Scanner(System.in);
        double comprimentoPista = inC.nextDouble();
        comprimentoPista = comprimentoPista / 1000; //em km

        System.out.println("Insira o consumo de combustível do carro (em Km/L): ");
        Scanner inCons = new Scanner(System.in);
        double consumoComb = inCons.nextDouble();

        double litrosNecessarios = comprimentoPista / consumoComb;

        System.out.println("Para andar " + comprimentoPista + "km o carro vai precisar de " + litrosNecessarios + " litros");
    }
}