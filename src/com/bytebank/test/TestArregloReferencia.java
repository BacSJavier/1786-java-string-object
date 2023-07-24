package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;

public class TestArregloReferencia {
    public static void main(String[] args) {
    CuentaCorriente cc = new CuentaCorriente(4, 124);
    CuentaCorriente[] cuentas = new CuentaCorriente[3];
    cuentas[0] = cc;
    cuentas[1] = new CuentaCorriente(3,664);
    cuentas[2] = new CuentaCorriente(3,2); 
//    System.out.println(cuentas[0]);
    /*
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
    */



    /* CONSULTA ARCHIVO TXT POO acerca de instanciar objetos de diferentes tipos
    Cuenta cc1 = new CuentaAhorros(3, 43);
    CuentaAhorros cc2 = new CuentaAhorros(21, 422);
    System.out.println(cc1);
    System.out.println(cc2);
    cc1.Ahorro(300);
    cc2.Ahorro(8000);
    */

    //Cast

    Cuenta[] cuentasgenerales = new CuentaAhorros[3];//Arreglo de tipo Cuenta pero instanciado en CuentaAhorro
    CuentaAhorros cc1 = new CuentaAhorros(3, 43);//Creamos una cuenta normal de ahorro
    //Cuenta cc2 = new CuentaCorriente(3, 53);Creamos una cuenta normal corriente, no genera error de sintaxis
    //pero lanza excepcion dado que el arreglo solo acepta CuentasAhorrro
    
    cuentasgenerales[0] = cc1;
    
    //Impresion de Array
    for(int i =0; i<cuentasgenerales.length ; i++){
    System.out.println(cuentasgenerales[i]); 
    }
    //CASTEO AHORA SI...
    /* ( CuentaAhorros cAhorros = cuentasgenerales[0]; Aqui intentamos referenciar a cuentasgenerales[0] que contiene a una cuenta Ahorro,
    pero es de tipo Cuenta por lo que no es posible instanciar cAhorros con esa referencia al menos no directo ...*/
    CuentaAhorros cAhorros =(CuentaAhorros)cuentasgenerales[0];  
    System.out.println(cAhorros);
}

}
