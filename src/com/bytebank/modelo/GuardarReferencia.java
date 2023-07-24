package com.bytebank.modelo;

public class GuardarReferencia {
    Object[] guardaObject = new Object[4];
    public void agregarObjecto(Object objecto, int posicion){
        guardaObject[posicion] = objecto;
    }

    public Object obtenerObjecto(int posicion){
        return guardaObject[posicion];
    }

    public void removerObjecto(int posicion){
        guardaObject[posicion] = null;
    }

}
