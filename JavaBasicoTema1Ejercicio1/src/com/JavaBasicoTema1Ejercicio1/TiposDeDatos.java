package com.JavaBasicoTema1Ejercicio1;

public class TiposDeDatos {

    public static void main(String[] args) {

        // Datos numéricos:

        byte numero1 = 1;
        short numero2 = 2;
        int numero3 = 3;
        long numero4 = 4L;
        float decimal1 = 4.9f;
        double decimal2 = 9.99d;

        System.out.println("Datos de tipo numérico:");
        System.out.println ("byte: " + numero1 +
                " / short: " + numero2 +
                " / int: " + numero3 +
                " / long: " + numero4 +
                " / float: " + decimal1 +
                " / double: " + decimal2);


        // Carácter:

        char texto1 = 'a';

        System.out.println("Datos de tipo texto:");
        System.out.println("Carácter: " + texto1);


        // booleanos:

        boolean verdadero = true;
        boolean falso = false;

        System.out.println("Datos Booleanos:");
        System.out.println("Boolean Verdadero: " + verdadero +
                " / Boolean Falso: " + falso);


        // Cadena de texto (Clase):

        String cadena = "Esto es una cadena";

        System.out.println("Cadenas de texto:");
        System.out.println("String: " + cadena);


        // Datos envoltorio (Clase):

        Integer envoltorio1 = null;
        Long envoltorio2 = 2L;
        Float envoltorio3 = 3.2F;
        Double envoltorio4 = 5.65D;

        System.out.println("Datos tipo envoltorio:");
        System.out.println ("Integer: " + envoltorio1 +
                " / Long: " + envoltorio2 +
                " / Float: " + envoltorio3 +
                " / Double: " + envoltorio4);




    }
}
