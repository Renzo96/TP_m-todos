package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Seleccione el ejercicio que desea ejecutar");
            System.out.println("1. ");
            System.out.println("2. Fuera de rango (byte, short, int, long, float, double)");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. Contador de caracteres");
            System.out.println("7. ");
            System.out.println("8. ");
            System.out.println("9. ");
            System.out.println("10. ");
            System.out.println("11.)");
            System.out.println("12. ");
            System.out.println("13. ");
            System.out.println("14. ");
            System.out.println("15. ");
            System.out.println("16. ");
            System.out.println("17. ");
            System.out.println("18. ");
            System.out.println("19. ");
            System.out.println("20. ");
            System.out.println("21.)");
            System.out.println("22. ");
            System.out.println("23. ");
            System.out.println("0. Salir");
            System.out.println("Opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

//            2- Si se asigna un valor a una variable fuera de rango (mayor de lo establecido)
//           ¿Qué ocurre? ¿Existe alguna forma de resolverlo? Ejemplifique.
//            Depende del tipo de dato, si es primitivo(byte, int, short, long)Si intentas asignar un valor
//            fuera del rango permitido, obtendrás un error de compilación. Por ejemplo, el tipo byte tiene un rango
//            de -128 a 127. Si intentas asignar un valor fuera de este rango, como 200, obtendrás un error.
//            Ej byte dato = 200; // Error de compilación: incompatible types: possible lossy conversion from int to byte
//             Ahora si los tipos de datos son de punto flotante(float, double): Estos tipos pueden manejar valores muy grandes
//             o muy pequeños, pero si el valor es demasiado grande probablemente asignará infinity y si es demasiado pequeñp,
//            puede resultar en 0.0. Ej
//            double valorGrande = 1.0e308 * 10; // Resulta en Infinity
//            double valorPequeno = 1.0e-324 / 10; // Resulta en 0.0
//            Para resolverlo se puede realizar manejo de exepciones, ejemplo:
//            try {
//                int valor = Integer.parseInt("9999999999"); // Esto lanzará una NumberFormatException
//            } catch (NumberFormatException e) {
//                System.out.println("Valor fuera de rango para tipo int.");
//            }
//            Validaciones de entrada:
//            int valor = 200;
//            if (valor >= Byte.MIN_VALUE && valor <= Byte.MAX_VALUE) {
//                byte dato = (byte) valor;
//            } else {
//                System.out.println("Valor fuera de rango para tipo byte.");
//            }
//            14- Indique cual es la diferencia entre los datos primitivos (por valor) ejemplo el int
//            y su contraparte por referencia ejemplo Integer.
//
//            Datos Primitivos (por valor)
//            Definición: Los datos primitivos son tipos de datos básicos integrados en el lenguaje Java. Ejemplos incluyen int, char, boolean, byte, short, long, float, y double.
//            Almacenamiento: Los valores de los tipos primitivos se almacenan directamente en la memoria.
//            Tamaño fijo: Cada tipo primitivo tiene un tamaño fijo. Por ejemplo, un int siempre ocupa 4 bytes.
//            No pueden ser nulos: Los tipos primitivos no pueden tener un valor null.
//            Operaciones rápidas: Las operaciones con tipos primitivos son generalmente más rápidas debido a su simplicidad y almacenamiento directo en la memoria.
//            Tipos por Referencia (por referencia)
//            Definición: Los tipos por referencia son objetos que encapsulan los tipos primitivos. Ejemplos incluyen Integer, String, Character, Boolean, Byte, Short, Long, Float, y Double.
//            Almacenamiento: Los objetos de tipos por referencia se almacenan en el heap y la variable contiene una referencia (puntero) a la ubicación en la memoria donde se almacena el objeto.
//            Tamaño variable: El tamaño de los objetos de tipos por referencia puede variar y generalmente es mayor que el de los tipos primitivos.
//            Pueden ser nulos: Los tipos por referencia pueden tener un valor null, lo que indica que no apuntan a ningún objeto.
//            Métodos adicionales: Los tipos por referencia proporcionan métodos adicionales para manipular y convertir valores. Por ejemplo, Integer tiene métodos como parseInt, toString, y compareTo.


            switch (option) {
//                case 1:
//                    ejercicio1();
//                    break;
                case 2:
                    ejercicio2(scanner);
                    break;
//                case 3:
//                    ejercicio3();
//                    break;
//                case 4:
//                    ejercicio4(scanner);
//                    break;
//                case 5:
//                    ejercicio5(scanner);
//                    break;
                case 6:
                    ejercicio6(scanner);
                    break;
//                case 7:
//                    ejercicio7();
//                    break;
//                case 8:
//                    ejercicio8(scanner);
//                    break;
//                case 9:
//                    ejercicio9();
//                    break;
                case 10:
                    ejercicio10(scanner);
                    break;
//                case 11:
//                    ejercicio11();
//                    break;
//                case 12:
//                    ejercicio12(scanner);
//                    break;
//                case 13:
//                   ejercicio13(scanner);
//                    break;
                case 14:
                    ejercicio14(scanner);
                    break;
//                case 15:
//                    ejercicio15(scanner);
//                    break;
//                case 16:
//                    ejercicio16(scanner);
//                    break;
                case 17:
                    ejercicio17(scanner);
                    break;
                case 18:
                    ejercicio18(scanner);
                    break;
//                case 19:
//                    ejercicio19(scanner);
//                    break;
//                case 20:
//                    ejercicio20();
//                    break;
//                case 21:
//                    ejercicio21(scanner);
//                    break;
                case 22:
                    ejercicio22(scanner);
                    break;
//                case 23:
//                    ejercicio23(scanner);
//                    break;
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

    public static void ejercicio2(Scanner scanner) {
        System.out.println("Ingrese un número para validar");
        int valor = scanner.nextInt();
        if (valor > Byte.MAX_VALUE || valor < Byte.MIN_VALUE) {
            System.out.println("El valor " + valor + " está fuera del rango de byte. Transformando a int...");
            int dato = valor; // Transformar a int
            System.out.println("El valor transformado es: " + dato);
        } else {
            byte dato = (byte) valor;
            System.out.println("El valor " + valor + " está dentro del rango de byte y se ha asignado correctamente.");
        }
    }


    public static void ejercicio6(Scanner scanner) {
        System.out.println("Ingrese el string para calcular su número de caracteres");
        String frase = scanner.nextLine();
        int numeroCaracteres = frase.length();
        System.out.println("La frase " + frase + " tiene caracteres " + numeroCaracteres);
    }

    public static void ejercicio10(Scanner scanner) {
        System.out.println("Ingrese una frase para transformar a mayúsculas o minúsculas");
        String frase = scanner.nextLine();
        System.out.println("Desea transformar el texto a mayúsculas o minúsculas? (a/A mayúsculas, b/B minúsculas");
        String opcion = scanner.nextLine();
        if (opcion.equalsIgnoreCase("a")) {
            String frase_mayuscula = frase.toUpperCase();
            System.out.println("La frase en mayúscula es " + frase_mayuscula + "");
        } else if (opcion.equalsIgnoreCase("b")) {
            String frase_minuscula = frase.toLowerCase();
            System.out.println("La frase en minúscula es " + frase_minuscula + "");
        } else {
            System.out.println("Opción no valida, intente de nuevo");
        }
    }

    public static void ejercicio14(Scanner scanner) {
    }

    public static void ejercicio17(Scanner scanner) {
        System.out.println("Ingrese la fecha a transformar en string (formato: dd/MM/yyyy)");
        String fechaInput = scanner.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date fecha = formato.parse(fechaInput);
            String fechaString = FuncionesPrograma.getFechaString(fecha);
            System.out.println("La fecha transformada es: " + fechaString);
        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido. Por favor, ingrese la fecha en el formato dd/MM/yyyy.");
            scanner.next();
        }
    }
    public static void ejercicio18(Scanner scanner) {
        int dia;
        int mes;
        int anio;

        while (true) {
            System.out.println("Ingrese el día");

            if (scanner.hasNextInt()) {
                dia = scanner.nextInt();
                if (dia < 1 || dia > 31) {
                    System.out.println("Día invalido, ingrese un número entre 1 y 31");
                } else {
                    break;
                }
            } else {
                System.out.println("Entrada invalida. Ingrese nuevamente el día");
                scanner.next();
            }
        }
//        System.out.println("El día ingresado es: " + dia);
        while (true) {
            System.out.println("Ingrese el mes");

            if (scanner.hasNextInt()) {
                mes = scanner.nextInt();

                if (mes < 1 || mes > 12) {
                    System.out.println("Mes inválido. Por favor, ingrese un mes entre 1 y 12.");
                } else {
                    break;
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                scanner.next();
            }
        }

        while (true) {
            System.out.println("Ingrese el año");

            if (scanner.hasNextInt()) {
                anio = scanner.nextInt();

                if (anio < 1) {
                    System.out.println("Año inválido. Por favor, ingrese un año positivo.");
                } else {
                    break;
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                scanner.next();
            }
        }

        Date fecha = FuncionesPrograma.getFechaDate(dia, mes, anio);
        System.out.println("La fecha es: " + fecha);
    }

    public static void ejercicio22(Scanner scanner) {
        int numero;
        int suma = 0;

        while (true) {
            System.out.println("Ingrese un número para sumar los dígitos");

            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                suma += sumarDigitos(numero);

                System.out.println("La suma de los dígitos del " + numero + " es: " + suma);
                break;
            } else {
                System.out.println("Entrada inválida. Ingrese un número entero.");
                scanner.next();
            }
        }
    }

    public static int sumarDigitos(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return (numero % 10) + sumarDigitos(numero / 10);
        }
    }
}
