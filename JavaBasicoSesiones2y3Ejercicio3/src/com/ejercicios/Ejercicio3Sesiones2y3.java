package com.ejercicios;

public class Ejercicio3Sesiones2y3 {

    // Crear un bucle que permita concatenar textos e imprima el resultado final por consola.
    // Tener en cuenta que los textos pueden venir de un array de tipo String.

    public static void main(String[] args) {

        String[] palabras = {"Esto", "es", "un", "ejemplo", "de", "concatenación", "de", "texto",
                "usando", "un", "bucle", "for"};
        String cadena = "";

        for (String palabra : palabras) {
            cadena += palabra.concat(" ");
        }
        System.out.println(cadena);
    }

}

