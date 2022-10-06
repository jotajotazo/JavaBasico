package ejercicios;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

/*
    El programa muestra un menu para realizar operaciones con un vector de enteros ya inicializado
    con 5 posiciones. Seguro que se puede optimizar, ya que hay partes del código muy repetitivas
    (principalmente en los try-catch)
 */

public class ejercicioAdicional {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int number;
        int position;
        int option;
        String action;

        Vector<Integer> actualVector = new Vector<>();
        actualVector.add(1);
        actualVector.add(2);
        actualVector.add(3);
        actualVector.add(4);
        actualVector.add(5);

        do {
            try {
                System.out.println("\nOperaciones con Lista y Vector");
                System.out.println(" ----------- Menú -----------");
                System.out.println("[1] Mostrar el vector.");
                System.out.println("[2] Insertar al principio.");
                System.out.println("[3] Insertar al final.");
                System.out.println("[4] Insertar en una posición concreta.");
                System.out.println("[5] Borrar al principio.");
                System.out.println("[6] Borrar al final.");
                System.out.println("[7] Borrar una posición concreta.");
                System.out.println("[8] Borrar todo el vector.");
                System.out.println("[9] Salir.\n");
                System.out.print("Elija la operación que desee: ");
                option = read.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Sólo se aceptan números del 1 al 9. Por favor, introduce una opción válida: ");
                read.nextLine();
                option = read.nextInt();
            }
            if (option < 0 || option > 9) {
                System.out.print("Debes seleccionar una opción válida (1-9): ");
                read.nextLine();
                option = read.nextInt();
            }

            int lastPosition = actualVector.size() - 1;

            switch (option) {
                case 1 -> {
                    System.out.println("\nEl vector actual es el siguiente:");
                    for (int i = 0; i < actualVector.size(); i++) {
                        System.out.println("Valor en posición " + i + " del vector actual es: " + actualVector.get(i));
                    }
                }
                case 2 -> {
                    try {
                        System.out.print("Introduce el número entero a insertar en 1ª posición: ");
                        number = read.nextInt();
                    } catch (InputMismatchException e2) {
                        System.out.print("Sólo se pueden insertar números enteros. Prueba de nuevo: ");
                        read.nextLine();
                        number = read.nextInt();
                    }
                    actualVector.add(0, number);
                }
                case 3 -> {
                    try {
                        System.out.print("Introduce el número entero a insertar en última posición: ");
                        number = read.nextInt();
                    } catch (InputMismatchException e3) {
                        System.out.print("Sólo se pueden insertar números enteros. Prueba de nuevo: ");
                        read.nextLine();
                        number = read.nextInt();
                    }
                    actualVector.addElement(number);
                }
                case 4 -> {
                    try {
                        System.out.print("Introduce la posición en la que quieres insertar (0 a "
                                + actualVector.size() + "): ");
                        position = read.nextInt();
                        if (position < 0 || position > actualVector.size()) {
                            System.out.print("Debes seleccionar una posición válida (0-"
                                    + actualVector.size() + "): ");
                            read.nextLine();
                            position = read.nextInt();
                        }
                    } catch (InputMismatchException e4) {
                        System.out.print("La posición debe ser un número entero. Prueba de nuevo: ");
                        read.nextLine();
                        position = read.nextInt();
                    }


                    try {
                        System.out.print("Introduce el número entero que quieres insertar: ");
                        number = read.nextInt();
                    } catch (InputMismatchException e4) {
                        System.out.print("Sólo se pueden insertar números enteros. Prueba de nuevo: ");
                        read.nextLine();
                        number = read.nextInt();
                    }
                    actualVector.insertElementAt(number, position);
                }
                case 5 -> {
                    actualVector.removeElementAt(0);
                    System.out.println("Se ha borrado el primer elemento");
                }
                case 6 -> {
                    actualVector.removeElementAt(lastPosition);
                    System.out.println("Se ha borrado el ultimo elemento");
                }
                case 7 -> {
                    try {
                        System.out.print("Introduce la posición que quieres borrar (0 a " + lastPosition + "): ");
                        position = read.nextInt();
                        if (position < 0 || position > lastPosition) {
                            System.out.print("Debes seleccionar una posición válida (0-"
                                    + lastPosition + "): ");
                            read.nextLine();
                            position = read.nextInt();
                        }
                    } catch (InputMismatchException e4) {
                        System.out.print("La posición debe ser un número entero. Prueba de nuevo: ");
                        read.nextLine();
                        position = read.nextInt();
                    }
                    actualVector.removeElementAt(position);
                }
                case 8 -> {
                    System.out.println("¡AVISO! Se borrarán todos los elementos del vector");
                    System.out.print("¿Desea realmente borrar todo el contenido del vector? (S/N): ");
                    action = read.next();
                    if (Objects.equals(action, "s") || Objects.equals(action, "S")) {
                        actualVector.removeAllElements();
                        System.out.println("Se ha borrado todo el contenido del vector");
                    } else {
                        System.out.println("Acción de borrado cancelada");
                    }
                }
                case 9 -> System.out.println("¡Hasta pronto!");

            }

        } while (option > 0 && option != 9);

    }

}