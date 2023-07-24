package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Contador;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.Gerente;
import com.bytebank.modelo.GuardarReferencia;

public class TestGuardarReferencia {
    public static void main(String[] args) {
        GuardarReferencia guardarReferencia = new GuardarReferencia();
        Cliente cliente = new Cliente();
        Contador contador = new Contador();
        Gerente gerente = new Gerente();
        CuentaCorriente cuentaCorriente = new CuentaCorriente(120, 9002);

        guardarReferencia.agregarObjecto(cliente, 0);
        guardarReferencia.agregarObjecto(cuentaCorriente, 1);
        guardarReferencia.agregarObjecto(contador, 2);
        guardarReferencia.agregarObjecto(gerente, 3);
    
        for(int i =0; i < 4; i++){
            System.out.println(guardarReferencia.obtenerObjecto(i)); 
        }    
    }
    
}
