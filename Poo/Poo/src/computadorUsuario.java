public class computadorUsuario {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        

        MSNmensager MSN = new MSNmensager();
        MSN.enviarMensagem();

        facebook facebook = new facebook();
        facebook.enviarMensagem();

        telegram telegram = new telegram();
        telegram.enviarMensagem();


    }
}
