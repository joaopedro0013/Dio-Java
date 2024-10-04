public class calculo {

    private int resultado = 0;

    public int calculosSimples (int numero1, int numero2, String acao){
         // r é igual ao resultado
        if (acao == "M"){ // M= multiplicação
            resultado= numero1 * numero2;
        }else if(acao == "D"){
            // se não soma mesmo
            resultado = numero1 / numero2;
        }
        else if(acao == "S"){
            // se não soma mesmo
            resultado = numero1 + numero2;
        }
        else if(acao == "SU"){
            // se não soma mesmo
            resultado = numero1 - numero2;
        }
        return resultado;
    }

    public int getResultado() {
        return resultado;
    }
}
