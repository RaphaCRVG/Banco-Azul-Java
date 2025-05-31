import java.util.Locale;
import java.util.Scanner;

public class Pratica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // System.out.println("Digite o seu nome: ");
        // String nome = entrada.nextLine();
        // System.out.println("Seja bem vindo " + nome + "!");

        // System.out.print("Digite sua idade: ");
        // int idade = entrada.nextInt();
        // System.out.println("Sua idade é " + idade);

        System.out.print("Digite sua altura para descobrir sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println("Sua altura é: " + altura);


        entrada.close();
    }    
}
