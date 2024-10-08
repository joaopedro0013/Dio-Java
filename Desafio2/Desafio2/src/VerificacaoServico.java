import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        System.out.println(servico);
        // TODO: Verifique se o serviço está na lista de serviços contratados
        
        if (servico.equals("movel") || servico.equals("tv")) {
          System.out.println("Sim");
      } else if (servico.equals("fixa")) {
          System.out.println("Nao");
      }
        
        scanner.close();
    }
}