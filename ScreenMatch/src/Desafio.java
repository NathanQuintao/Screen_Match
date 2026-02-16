import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner cliente = new Scanner(System.in);


        System.out.println("Bem vindo ao Banco! Informe seus dados a seguir para criarmos sua conta!");

        System.out.println("Digite seu nome: ");
        String nome = cliente.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpf = cliente.nextLine();
        System.out.println("Informe o tipo da conta: ");
        String tipoDaConta = cliente.nextLine();
        System.out.println("Informe seu saldo: ");
        double saldoConta = cliente.nextInt();

        System.out.println("Conta criada com sucesso!");

        System.out.println("""
                Operações
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """);
        while (true) {
            System.out.println("Digite a opção desejada: ");
            int opcao = cliente.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual da conta é de: " + saldoConta);
            }
            if (opcao == 2) {
                System.out.println("Informe seus dados para recebimento: Pix: " + cpf);
            }
            if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                double valorTranferir = cliente.nextDouble();
                if (saldoConta > valorTranferir) {
                    saldoConta -= valorTranferir;
                }
                System.out.println("Valor transferido! Saldo atual: " + saldoConta);
            }
            if (opcao == 4) {
                System.out.println("Saiu da conta!");
                break;
            }
            if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
