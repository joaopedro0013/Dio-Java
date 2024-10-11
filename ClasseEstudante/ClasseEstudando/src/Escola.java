import java.util.Locale; 
import java.util.Scanner;

public class Escola {
    public static void main(String[] args) throws Exception {
        Estudante student1 = new Estudante();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
   

        System.out.println("Seja bem Vindo ao Sistema nutricional dos Alunos.");
        System.out.println("Por favor informe os dados para pedidos.");

        System.out.println("Nome do Aluno");
        student1.name = scanner.next();

        System.out.println("Idade do Aluno");
        student1.age = scanner.nextInt();

        System.out.println("Cor da Pele");
        student1.corPele = scanner.next();

        System.out.println("Sexo do Aluno");
        student1.sexo = scanner.next();

        System.out.println("O que você está comendo Hoje?");
        student1.comida  = scanner.next();

        System.out.println("O que está bebendo Hoje?");
        student1.bebida = scanner.next();

        System.out.println("Obrigado pela ajuda.Agora aqui estão algumas segestões para você.");

        student1.comendo(student1.comida);

        student1.bebendo(student1.bebida);
    }
}



    