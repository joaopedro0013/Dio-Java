public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligarTv();
        smartTv.mudarCanal(570);
        smartTv.volumeAumentar();
        smartTv.volumeAumentar();
        smartTv.volumeAumentar();
        smartTv.volumeAumentar();
        smartTv.volumeAumentar();
        smartTv.volumeAumentar();
        smartTv.volumeAumentar();
        smartTv.volumeAumentar();
        smartTv.volumeAumentar();
        smartTv.volumeAumentar();
        smartTv.volumeAumentar();
        smartTv.volumeAumentar();
        
        System.out.println("Ligando a Tv " + smartTv.ligada);
        System.out.println("O canal atual é : " + smartTv.canal);
        System.out.println("O volume atual é : " +smartTv.volume);
    }
}
