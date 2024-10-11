package com.empresaTestadora.master.cliente;
import com.empresaTeste.master.cliente.*;



public class clientesEmpresa1 {
    public static void main(String[] args) throws Exception {

        clienteEmpresa2 clienteEmpresa2 = new clienteEmpresa2();
        //cliente clientesDeRival = new com.empresaTeste.master.cliente.cliente();
       

        int clientes = 76;

        int diferenca = clientes - clienteEmpresa2.devolvendo();

        System.out.println("A diferenca é de:" + diferenca);
        //clientesDeRival.devolvendo;
    }

    public int devolver(){
        int clientes = 76;
        return clientes;
    }
}
