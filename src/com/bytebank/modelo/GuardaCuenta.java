package com.bytebank.modelo;

public class GuardaCuenta {
    Cuenta[] guardaCuenta = new Cuenta[5];

    public void agregarCuenta(Cuenta cuenta, int posicion){
        guardaCuenta[posicion] = cuenta;
    }

    public Cuenta obtenerCuenta(int posicion){
        return guardaCuenta[posicion];
    }

    public void removerCuenta(int posicion){
        guardaCuenta[posicion] = null;
    }
}
