package com.bytebank.test;

public class TestMain {
    public static void main(String[] args) {
        int[] edades = {1,2,3};
        int tamano = edades.length;
        System.out.println(tamano);
       /*El tamaño del array indica el numero de espacios disponibles 
       */ 
        
        int [] edades2 = new int[5];
        for(int i = 0 ; i < edades2.length; i++){
            edades2[i]= i;
        }
        for(int i = 0 ; i < edades2.length; i++){
            System.out.println(edades2[i]);
             //Imprime el metodo toString() que tenga si lo tiene sobreescrito imprime ese si no imprime su valor de correspondencia o referencia si es objeto            
        }
    }
}
