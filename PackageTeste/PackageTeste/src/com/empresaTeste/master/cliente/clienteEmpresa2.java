package com.empresaTeste.master.cliente;
import com.empresaTestadora.master.cliente.*;

public class clienteEmpresa2 {
    public static void main(String[] args) throws Exception {

        clientesEmpresa1 clientesEmpresa1 = new clientesEmpresa1();

        //clientesEmpresa1.devolver();

        //com.empresaTestadora.master.cliente.cliente clienteRival = new com.empresaTestadora.master.cliente.cliente();
        
        int clientes = 66;

        int diferenca = clientes - clientesEmpresa1.devolver();

        System.out.println("A diferenca é de:" + diferenca);

    }

    public int devolvendo(){
        int clientes = 66;
        return clientes;
    }
}
