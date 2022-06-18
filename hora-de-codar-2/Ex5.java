// 8.Faça um programa que leia 10 números informados pelo usuário e ao final da leitura escrever a soma total dos 10 números lidos.
import java.util.Scanner;
import java.util.Arrays;

public class Ex5{
    public static void main(String[] args){
        int[] nums = new int[10];
        int somaNums = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("digite um número");
            Scanner in = new Scanner(System.in);
            nums[i] = in.nextInt();
            somaNums = somaNums + nums[i];
        }

        System.out.print("A Soma dos números é " + somaNums);
    }
}