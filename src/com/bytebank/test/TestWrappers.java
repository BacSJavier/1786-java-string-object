package com.bytebank.test;

import java.util.ArrayList;

public class TestWrappers {
    public static void main(String[] args) {
        //autoboxing
        Double numeroDOble = 33.0; 
        Integer numeroInteger = 3; 
        Boolean verdadBoolean = false;

        //unboxing
        int Entero = Integer.valueOf(30);
        double Doble = Double.valueOf(42);

        System.out.println(numeroDOble);
        System.out.println(numeroInteger);
        System.out.println(verdadBoolean);

        System.out.println(Entero);
        System.out.println(Doble);

        
        //ArrayList<int> lista = new ArrayList<>();//Las listas solo aceptan Wrappers(Integer,Double,Boolean) como tipos , no aceptan primitivos(int,double,boolean)
    }
    
}
