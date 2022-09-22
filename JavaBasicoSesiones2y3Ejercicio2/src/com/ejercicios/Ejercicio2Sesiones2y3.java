package com.ejercicios;

import java.util.Scanner;

public class Ejercicio2Sesiones2y3 {

    // Crear una función que reciba un precio y devuelva el precio con el IVA incluido.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio del producto: ");

            double precio = scanner.nextDouble();
            double iva = .21d;
            double ivaPorcentaje = iva * 100;

            double precioIva = precio * iva;
            System.out.println("\nEL IVA (" + ivaPorcentaje + " %) del artículo es: " + precioIva + " €");

            double precioTotal = precio + precioIva;
            System.out.println("\nEl precio total con IVA incluido es: " + precioTotal + " €");
        }
}