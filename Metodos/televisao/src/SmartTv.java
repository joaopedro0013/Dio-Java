public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 1;

    public void ligarTv(){
        ligada = true;
    }

    public void desligarTv(){
        ligada = false;
    }

    public void volumeAumentar(){
        volume++;
    }

    public void volumeDiminuir(){
        volume--;
    }

    public void mudarCanal(int canalNovo){
        canal = canalNovo;
    }


    public void canalAumentar(){
        canal++;
    }

    public void canalDiminuir(){
        canal--;
    }

}
