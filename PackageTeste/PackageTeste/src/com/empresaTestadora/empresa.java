package com.empresaTestadora;
import com.empresaTestadora.master.empresa.*;

public class empresa {
    public static void main(String[] args) {

        areaAtendimento areaAtendimento = new areaAtendimento();
        areaAtendimento.vitrine();
        areaAtendimento.caixa();


        estoque estoque = new estoque();
        estoque.perguntarItemDisponivel();


        funcionario funcionario = new funcionario();
        funcionario.atenderCliente();

        manutencao manutencao = new manutencao();
        manutencao.informacoesManutencao();




    }
}
