//7. Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro, o último e o maior de todos eles (considere que todos os números informados serão diferentes)
import java.util.Scanner;
import java.util.Arrays;

public class Ex4{
    public static void main(String[] args){
        int[] nums = new int[4];
        int maior = 0;

        for(int i = 0; i < 4; i++){
            System.out.println("digite um número");
            Scanner in = new Scanner(System.in);
            nums[i] = in.nextInt();

            if(i == 0){
                maior = nums[i];
            }
            
            if(nums[i] > maior){
                maior = nums[i];
            }
        }

        System.out.println("Primeiro número: " + nums[0]);
        System.out.println("Ultimo número: " + nums[3]);
        System.out.println("Maior número: " + maior);
    }
}