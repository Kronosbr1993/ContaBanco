
    public class ContaTerminal {
        public static void main(String[] args) {
            // Informações pré-definidas
            int numero = 1021;
            String agencia = "067-8";
            String nomeCliente = "MARIO ANDRADE";
            double saldo = 237.48;
            
            System.out.println("Por favor, digite o número da Agência:");
            String agenciaDigitada = System.console().readLine();


            // Mensagem final
            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
            System.out.println(mensagem);
        }
    }