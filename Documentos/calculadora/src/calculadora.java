public class calculadora {
    public static void main(String[] args) throws Exception {

        calculo calculo = new calculo();

        calculo.calculosSimples(13, 21, "S");

        System.out.println("Este é o resultado da sua conta ? " + calculo.getResultado());
    }
}
