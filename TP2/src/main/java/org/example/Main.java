package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Seleccione el ejercicio que desea ejecutar");
            System.out.println("1. ");
            System.out.println("2. )");
            System.out.println("3. ");
            System.out.println("4. Mayor, menor y rango");
            System.out.println("5. ");
            System.out.println("6. ");
            System.out.println("7. ");
            System.out.println("8. Arreglo ascendente y descendente");
            System.out.println("9. ");
            System.out.println("10. ");
            System.out.println("11.)");
            System.out.println("12. Eliminar elementos de un arreglo");
            System.out.println("0. Salir");
            System.out.println("Opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
//                case 1:
//                    ejercicio1();
//                    break;
//                case 2:
//                    ejercicio2(scanner);
//                    break;
//                case 3:
//                    ejercicio3();
//                    break;
                case 4:
                    ejercicio4(scanner);
                    break;
//                case 5:
//                    ejercicio5(scanner);
//                    break;
//                case 6:
//                    ejercicio6(scanner);
//                    break;
//                case 7:
//                    ejercicio7();
//                    break;
                case 8:
                    ejercicio8(scanner);
                    break;
//                case 9:
//                    ejercicio9();
//                    break;
//                case 10:
//                    ejercicio10(scanner);
//                    break;
//                case 11:
//                    ejercicio11();
//                    break;
                case 12:
                    ejercicio12(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");

            }
            System.out.println();
        } while (option != 0);

        scanner.close();
    }

    public static void ejercicio4(Scanner scanner) {
        double[] numeros = new double[20];
        int arreglo[] = new int[20];
        int contador = 0;

        while (contador < 20) {
            System.out.print("Ingrese un número decimal (" + (contador + 1) + "/20): ");

            // Leer la entrada como cadena
            String entrada = scanner.next();

            try {
                // Convertimos la cadena a double
                double numero = Double.parseDouble(entrada);

                // Verificar si el número contiene un punto decimal
                if (entrada.contains(".")) {
                    numeros[contador] = numero; // Almacenar en el arreglo
                    contador++; // Incrementar el contador
                } else {
                    System.out.println("Error: Debe ingresar un número decimal (con punto decimal).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese un número decimal válido.");
            }
        }

        double mayor_2 = numeros[0];
        double menor_2 = numeros[0];
        double rango_2 = numeros[0];
        for (int i = 1; i < 20; i++) {
            if (numeros[i] > mayor_2) {
                mayor_2 = numeros[i];
            }
            if (numeros[i] < menor_2) {
                menor_2 = numeros[i];
            }
        }
        rango_2 = mayor_2 - menor_2;
        System.out.println("El mayor es " + mayor_2);
        System.out.println("El menor es " + menor_2);
        System.out.println("El rango es " + rango_2);

    }

    public static void ejercicio8(Scanner scanner) {
        int arreglo_1[] = new int[10];
        int arreglo_ascendente[] = new int[10];
        int arreglo_descendente[] = new int[10];

        // Ingresar los números
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.println("Introduce un número entero (" + (i + 1) + "/10): ");
                try {
                    int numero = Integer.parseInt(scanner.nextLine());
                    arreglo_1[i] = numero;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida, debes ingresar un número entero");
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            arreglo_ascendente[i] = arreglo_1[i];
            arreglo_descendente[i] = arreglo_1[i];
        }


        for (int i = 0; i < 10 - 1; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (arreglo_ascendente[i] > arreglo_ascendente[j]) {
                    int aux = arreglo_ascendente[i];
                    arreglo_ascendente[i] = arreglo_ascendente[j];
                    arreglo_ascendente[j] = aux;
                }
            }
        }

        for (int i = 0; i < 10 - 1; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (arreglo_descendente[i] < arreglo_descendente[j]) {
                    int aux = arreglo_descendente[i];
                    arreglo_descendente[i] = arreglo_descendente[j];
                    arreglo_descendente[j] = aux;
                }
            }
        }

        System.out.print("El primer arreglo es: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo_1[i] + " ");
        }
        System.out.println();

        System.out.print("El arreglo ascendente es: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo_ascendente[i] + " ");
        }
        System.out.println();

        System.out.print("El arreglo descendente es: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo_descendente[i] + " ");
        }
        System.out.println();
    }

//    Crea un programa que permita al usuario ingresar un conjunto de números en un
//    array unidimensional de 10 elementos. Posteriormente el programa debe permitir al
//    usuario ingresar un número y si este existe en el array eliminarlo, generando un nuevo
//    array con los elementos distintos al buscado.
public static void ejercicio12(Scanner scanner) {
    int cantidad = 10;
    double[] arreglo = new double[cantidad];

    // Llenar el arreglo con números ingresados por el usuario
    for (int i = 0; i < cantidad; i++) {
        while (true) {
            System.out.println("Introduce un número: ");
            String entrada = scanner.nextLine();
            try {
                double numero = Double.parseDouble(entrada);
                arreglo[i] = numero;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un número, intentalo de nuevo");
            }
        }
    }

    // Mostrar el arreglo inicial
    System.out.println("El primer arreglo es: ");
    for (double numero : arreglo) {
        System.out.print(numero + " ");
    }
    System.out.println();

    // Eliminar elementos del arreglo según lo ingresado por el usuario
    while (true) {
        System.out.println("Introduce un número a eliminar (o 'salir' para terminar): ");
        String entrada = scanner.nextLine();
        if (entrada.equalsIgnoreCase("salir")) {
            break;
        }
        try {
            double numero = Double.parseDouble(entrada);
            arreglo = eliminarElemento(arreglo, numero);
            System.out.println("Arreglo después de eliminar " + numero + ": ");
            for (double num : arreglo) {
                System.out.print(num + " ");
            }
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Eso no es un número, intentalo de nuevo");
        }
    }
}

    public static double[] eliminarElemento(double[] arreglo, double elemento) {
        int index = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Elemento no encontrado en el arreglo.");
            return arreglo;
        }

        double[] nuevoArreglo = new double[arreglo.length - 1];
        for (int i = 0, j = 0; i < arreglo.length; i++) {
            if (i != index) {
                nuevoArreglo[j++] = arreglo[i];
            }
        }
        return nuevoArreglo;
    }

}
