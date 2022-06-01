//Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".
import java.util.Scanner;

public class Ex2{
    public static void main(String[] args){
        System.out.println("Digite seu nome");

        Scanner entradaTeclado = new Scanner(System.in);
        String nome = entradaTeclado.next();

        System.out.println("Olá, " + nome);
    }
}