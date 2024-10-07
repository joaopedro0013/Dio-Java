
import java.util.Locale; 
import java.util.Scanner;
      

public class ContaTerminal {
        public static void main(String[] args) {
            //criando o objeto scanner
            

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Olá muito Obrigado por querer fazer parte do nosso banco.");
            System.out.println("Vamos começar a preencher os dados para que a crianção da sua conta seja feita.");
            System.out.println("Por favor digite o numero da Agência:");
            String agencia = scanner.next();

            System.out.println("Digite o numero da sua Conta:");
            int numero = scanner.nextInt();

            System.out.println("Digite o seu nome:");
            String nomeCliente = scanner.next();

            System.out.println("Qual o valor do seu primeiro deposito?");
            Double saldo = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá," + nomeCliente + " obrigado por criar uma conta em nosso banco,sua agência é " + agencia + ",conta " + numero + " e seu saldo de "+ saldo +" já está desponivel para saque. ");
            
    }
}
