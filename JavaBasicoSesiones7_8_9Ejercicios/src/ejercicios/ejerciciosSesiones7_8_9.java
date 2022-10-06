package ejercicios;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class ejerciciosSesiones7_8_9 {


    public static void main(String[] args) {


        // 1. Escribe el código que devuelva una cadena al revés:

        System.out.println("\nEjercicio 1. Cadena al revés:");
        Scanner scanner = new Scanner(System.in);
        String textoOriginal;

        System.out.println("Introduce el texto que desees voltear:");
        textoOriginal = scanner.nextLine();
        StringBuilder textoInverso = new StringBuilder(textoOriginal);
        textoOriginal = textoInverso.reverse().toString();

        System.out.println("El texto inverso es: \n" + textoOriginal);


        // 2. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores:

        System.out.println("\nEjercicio 2. Mostrar los valores de un Array Unidimensional:");

        String[] lenguajes = {"Java ", "Python ", "JavaScript ", "C# ", "PHP ", "C++"};
        for (String lenguaje : lenguajes) {
            System.out.print(lenguaje);
        }


        // 3. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada
        //    elemento en ambas dimensiones:

        System.out.println("\n\nEjercicio 3. Mostrar posición y valor de un Array Bidimensional:");

        Integer[][] numbers = {
                {8, 7, 6, 5},
                {-12, 24, -48, 96}
        };
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                System.out.println("Fila." + (i + 1) + "_Columna." + (j + 1) +
                        " | Valor = " + numbers[i][j]);
            }
        }


        // 4. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2.o y 3.er
        //    elemento y muestra el resultado final.

        System.out.println("\nEjercicio 4. Operaciones con Vector:");

        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        System.out.println("Vector origen: " + vector);

        vector.remove(2);
        vector.remove(1);

        System.out.println("Vector final (borrando elementos 2 y 3): " + vector);


        // 5. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000
        //    elementos para ser añadidos al mismo.

        System.out.println("\nEjercicio 5. Problema con la capacidad por defecto en un vector con 1000 elementos:");

        Vector<String> vectorPorDefecto = new Vector<>();
        System.out.println("La capacidad de un vector por defecto es: " + vectorPorDefecto.capacity());
        System.out.println("Al desbordarse permanentemente debe generar una copia y duplicar su tamaño," +
                " lo que tiene un coste computacional muy grande.\nLo ideal es inicializarlo" +
                " con la capacidad conocida, en este caso 1.000 elementos.");


        // 6. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos
        //    mostrando únicamente el valor de cada elemento.

        System.out.println("\nEjercicio 6. Copiar un Array en un LinkedList y mostrar los valores:");

        ArrayList<String> citric = new ArrayList<>();
        citric.add("naranja");
        citric.add("limón");
        citric.add("mandarina");
        citric.add("pomelo");

        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < citric.size(); i++) {
            linkedList.add(i, citric.get(i));
        }

        System.out.println("Elementos del Array <cítricos>: ");
        for (String elementos : citric) {
            System.out.print(elementos + " ");
        }

        System.out.println("\nElementos de la LinkedList <cítricos>:");
        for (String elementos : linkedList) {
            System.out.print(elementos + " ");
        }


        // 7. Crea un ArrayList de tipo int y, utilizando un bucle, rellénalo con elementos 1...10. A continuación,
        //    con otro bucle, recórrelo y elimina los números pares. Por último, vuelve a recorrerlo y muestra el
        //    ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer
        //    "for" de relleno.

        System.out.println("\n\nEjercicio 7. Eliminar los números pares de un ArrayList:");

        ArrayList<Integer> numerousPares = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            numerousPares.add(i);
            for (int num = 0; num < numerousPares.size(); num++) {
                if (numerousPares.get(num) % 2 == 0) {
                    numerousPares.remove(num);
                }
            }
        }

        System.out.println(numerousPares);


        // 8. Crea una función DividePorCero. Esta debe generar una excepción ("throws") a su llamante del
        //    tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se
        //    dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en
        //    cualquier caso: "Demo de código".

        System.out.println("\nEjercicio 8. Función DividePorCero:");

        Scanner scannerDivision = new Scanner(System.in);
        System.out.println("¿Que dos números deseas dividir?");
        System.out.print("Dividendo: ");
        int dividendo = scannerDivision.nextInt();
        System.out.print("Divisor: ");
        int divisor = scannerDivision.nextInt();
        try {
            System.out.println("Resultado de la división: " + DividirPorCero(dividendo, divisor));
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }


        // 9. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn"
        //    y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro
        //    "fileIn" al fichero dado en "fileOut".

        Scanner scannerFichero = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero origen (nota ficheroOrigen.txt en esta prueba): ");
        String fileIn = scannerFichero.nextLine();
        System.out.println("Introduce el nombre del fichero destino (nota: ficheroDestino.txt en esta prueba): ");
        String fileOut = scannerFichero.nextLine();
        CopiarFichero(fileIn, fileOut);

    }

    public static int DividirPorCero(int dividendo, int divisor) throws ArithmeticException {
        return dividendo / divisor;
    }

    public static void CopiarFichero(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();

        } catch (Exception e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}