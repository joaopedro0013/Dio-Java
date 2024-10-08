import java.util.Scanner;
public class VerificacaoCombo {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;
        String total = "";
        // TODO: Itere sobre os serviços contratados
        for(int i=0; i < servicosContratados.length;i++){
           total += servicosContratados[i] +",";
        }
        System.out.println(total);
        String novoTotal = total.substring(0, total.length()-1);
        System.out.println(novoTotal);
        // TODO: Verifique se todos os serviços foram contratados
        if (novoTotal.equals("movel,banda larga,tv") || novoTotal.equals("banda larga,tv,movel")) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}
