//Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero nem negativo e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. 
import java.util.Scanner;

public class Ex8{
    public static void main(String[] args){
        System.out.println("Digite o primeiro valor");
        Scanner val1In = new Scanner(System.in);
        double val1 = val1In.nextDouble();

        double val2;

        do{
            System.out.println("Digite o segundo valor (não 0 nem negativo)");
            Scanner val2In = new Scanner(System.in);
            val2 = val2In.nextDouble();
        } while(val2 <= 0);

        double divisao = val1 / val2;
        System.out.println(val1 + "/" + val2 + " = " + divisao);
    }
}