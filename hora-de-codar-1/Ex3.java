//Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".
import java.util.Scanner;
public class Ex3{
    public static void main(String[] args){
        System.out.println("Digite seu nome");
        Scanner inNome = new Scanner(System.in);
        String nome = inNome.next();

        System.out.println("Digite sua idade");
        Scanner inIdade = new Scanner(System.in);
        int idade = inIdade.nextInt();

        System.out.println("Olá, " + nome + ", sua idade é " + idade + " anos");
    }
}