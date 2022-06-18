//23 - Faça um programa em que o usuário informe 20 valores e no final, escreva o maior e o menor valor lido.

import java.util.Scanner;
import java.util.Arrays;

public class Ex19{
    public static void main(String[] args){
        int[] nums = new int[4];
        int maior = 0;
        int menor = 0;

        for(int i = 0; i < 4; i++){
            System.out.println("Digite o " + (i + 1) + "º número");
            Scanner in = new Scanner(System.in);
            nums[i] = in.nextInt();

            if(i == 0){
                maior = nums[i];
                menor = nums[i];
            }

            if(nums[i] > maior){
                maior = nums[i];
            }

            if(nums[i] < menor){
                menor = nums[i];
            }
        }

        System.out.println("Seus números: " + Arrays.toString(nums));
        System.out.println("O maior desses números é o " + maior);
        System.out.println("O menor desses números é o " + menor);
    }
}