package com.bytebank.test;

import java.util.ArrayList;

import com.bytebank.modelo.Contador;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Cuenta> lista = new ArrayList<>(2);
        CuentaAhorros cuentaAhorros = new CuentaAhorros(12,122);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(233, 032);
        Contador contador = new Contador();
        lista.add(cuentaAhorros);
        lista.add(cuentaCorriente);
        //lista.add(contador); SOlo se permiten CuentasAhorro
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
    }
    

}
