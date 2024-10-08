import java.util.Random;
import java.time.Year;

public class App {
    public static void main(String[] args) throws Exception {

        int titulosTotal = 20;
        int i = 1;
        while (i <= titulosTotal) {
            String tituloAleatorio = gerarTitulo();
            int anoAleatorio = geraAno();
            System.out.println("Este é o titulo numero  "+ i +" é o titulo do(a) " + tituloAleatorio +"  foi conquistado no ano de (" + anoAleatorio + ")");
            i++;
        }
    }

    public static String gerarTitulo() {
        String[] titulos = {
            "Libertadores",
            "Copa do Brasil",
            "Estadual",
            "Campeonato Brasileiro",
            "Recopa",
            "Super Copa do Brasil",
            // Adicione mais títulos aqui
        };

        Random random = new Random();
        int indiceAleatorio = random.nextInt(titulos.length);
        return titulos[indiceAleatorio];
    }

    public static int geraAno() {
        int anoAtual = Year.now().getValue();
        int anoMinimo = 1910;
        Random random = new Random();
        return random.nextInt(anoAtual - anoMinimo + 1) + anoMinimo;
    }


}
