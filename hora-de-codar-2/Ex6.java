//9. Faça um programa que leia 6 números que o usuário vai informar. Todos os números lidos com valor inferior a 72 devem ser somados. Escreva o valor final da soma efetuada e também todos valores que o usuário informou.  

import java.util.Scanner;
import java.util.Arrays;

public class Ex6{
    public static void main(String[] args){
        int[] nums = new int[6];
        int soma = 0;

        for(int i = 0; i < 6; i++){
            System.out.println("Digite o " + (i + 1) + "º número");
            Scanner in = new Scanner(System.in);
            nums[i] = in.nextInt();

            if(nums[i] < 72){
                soma = soma + nums[i];
            }
        }

        System.out.println("Seus números: " + Arrays.toString(nums));
        System.out.println("Soma dos números < 72: " + soma);
    }
}