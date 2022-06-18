//6. Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.
import java.util.Scanner;
import java.util.Arrays;

public class Ex3{
    public static void main(String[] args){
        int[] nums = new int[10];
        int somaNums = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("digite um número");
            Scanner in = new Scanner(System.in);
            nums[i] = in.nextInt();
            somaNums = somaNums + nums[i];
        }

        double media = somaNums / nums.length;

        System.out.print("A média dos números " + Arrays.toString(nums));
        System.out.print(" é " + media);
    }
}