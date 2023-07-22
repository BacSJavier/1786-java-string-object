package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.CuentaAhorros;

public class TestArregloReferencia {
    public static void main(String[] args) {
    CuentaCorriente cc = new CuentaCorriente(4, 124);
    CuentaCorriente[] cuentas = new CuentaCorriente[3];
    cuentas[0] = cc;
    cuentas[1] = new CuentaCorriente(3,664);
    cuentas[2] = new CuentaCorriente(3,2); 
//    System.out.println(cuentas[0]);

    CuentaAhorros[] cuentas2 = new CuentaAhorros[10];
    CuentaAhorros ca1 = new CuentaAhorros(11,22);
    CuentaAhorros ca2 = new CuentaAhorros(33,44);
    cuentas2[0] = ca1;
    cuentas2[1] = ca1;
    cuentas2[4] = ca2;
    cuentas2[5] = ca2;
    CuentaAhorros ref1 = cuentas2[1];
    CuentaAhorros ref2 = cuentas2[4];
    System.out.println(ref1);
    System.out.println(ref2);
}

}
