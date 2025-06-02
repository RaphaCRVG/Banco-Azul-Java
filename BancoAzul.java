import java.util.Locale;
import java.util.Scanner;

public class BancoAzul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double saldo = 0;
        StringBuilder extrato = new StringBuilder();
        int numeroSaques = 0;
        final int limiteSaques = 3;
        final double limiteValor = 500;

        while (true) {
            System.out.println("================");
            System.out.println("Selecione uma opção:");
            System.out.println("[d] - Deposito");
            System.out.println("[s] - Saque");
            System.out.println("[e] - extrato");
            System.out.println("[q] - Sair");
            System.out.println("================");

            String menu = scanner.nextLine();

            if (menu.equals("d")) {
                System.out.printf("Informe o valor do deposito: R$");
                double valor = scanner.nextDouble();
                scanner.nextLine();

                if (valor > 0) {
                    saldo += valor;
                    extrato.append(String.format("Depósito: R$ %.2f \n", valor));
                    System.out.printf("Depósito de R$ %.2f realizado com sucesso! %n", valor);

                } else {
                    System.out.println("@@@ Operação falhou, o valor informado é invalido @@@");
                }
            } 
            else if (menu.equals("s")) {
                System.out.printf("Informe o valor do saque: R$ ");
                double valor = scanner.nextDouble();
                scanner.nextLine();

                if (valor > saldo) {
                    System.out.println("@@@ A operação falhou! você não tem saldo suficiente! @@@");
                } else if (valor > limiteValor) {
                    System.out.println("@@@ Operação falhou! O valor do saque excede o limite! @@@");
                } else if (numeroSaques >= limiteSaques) {
                    System.out.println(
                            "@@@ Operação falhou! O número máximo de saques diários foi excedido! @@@");
                } else if (valor > 0) {
                    saldo -= valor;
                    numeroSaques++;
                    extrato.append(String.format("Saque: R$ %.2f \n", valor));
                    System.out.printf("Saque de R$ %.2f realizado com sucesso! \n", valor);
                } else {
                    System.out.println("@@@ Operação falhou! o valor anunciado é invalido @@@");
                }
            } 
            else if (menu.equals("e")) {
                System.out.println("======= EXTRATO =======");
                if (extrato.length() == 0) {
                    System.out.println("Não foram realizadas movimentações.");
                } else {
                    System.out.println(extrato);
                }
                System.out.printf("Saldo: R$ %.2f \n", saldo);
                System.out.println("=======================");
            } 
            else if (menu.equals("q")) {
                System.out.println("Obrigado por usar o banco azul!");
                break;
            } 
            else {
                System.out.println("@@@ Opção inválida, selecione uma opção válida. @@@");
            }
        }
        scanner.close();
    }
}

