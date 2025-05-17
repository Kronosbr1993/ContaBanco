
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da conta
        System.out.print("Por favor, digite o numero da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha

        // Solicita o número da agência
        System.out.print("Por favor, digite o numero da Agência: ");
        String agencia = scanner.nextLine();

        // Solicita o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicita o saldo
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem de confirmação
        String mensagem = "Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agencia eh " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque.";
        System.out.println("\n" + mensagem);

        scanner.close();
    }
}
