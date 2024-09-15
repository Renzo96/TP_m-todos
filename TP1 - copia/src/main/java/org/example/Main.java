package org.example;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Seleccione el ejercicio que desea ejecutar");
            System.out.println("1. Mensaje de bienvenida");
            System.out.println("2.");
            System.out.println("3. Operaciones con 2 variables");
            System.out.println("4. Comparar dos numeros");
            System.out.println("5.");
            System.out.println("6. Precio + IVA");
            System.out.println("7. Numeros del 1-100");
            System.out.println("8.");
            System.out.println("9. Numeros 1-100 divisibles por 2 y 3");
            System.out.println("10. Leer y validar numero");
            System.out.println("11.");
            System.out.println("12. Dia de la semana");
            System.out.println("13. Número primo");
            System.out.println("14.");
            System.out.println("0. Salir");
            System.out.println("0pción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    ejercicio1();
                    break;
//                case 2:
//                    ejercicio2(scanner);
//                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4(scanner);
                    break;
//                case 5:
//                    ejercicio5();
//                    break;
                case 6:
                    ejercicio6(scanner);
                    break;
                case 7:
                    ejercicio7();
                    break;
//                case 8:
//                    ejercicio8();
//                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10(scanner);
                    break;
//                case 11:
//                    ejercicio11();
//                    break;
                case 12:
                    ejercicio12(scanner);
                    break;
                case 13:
                    ejercicio13(scanner);
                    break;
//                case 14:
//                    ejercicio14();
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

    public static void ejercicio1() {
        String name = "Pepe";
        System.out.println("Bienvenido " + name);
    }


    public static void ejercicio3() {
        double a=7;
        double b=4;
        System.out.println(
                "La suma entre "+a+" y "+b+" es = " +(a+b)+ "\n"+
                        "La resta entre "+a+" y "+b+" es = "+(a-b)+" \n"+
                        "La multiplicacion entre "+a+" y "+b+" es = "+(a*b)+"\n"+
                        "La division entre "+a+" y "+b+" es = "+(a/b)+"\n"+
                        "El resto entre "+a+" y "+b+" es = "+(a%b)+"\n"        );

    }

    public static void ejercicio4(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int n2 = scanner.nextInt();

        if (n1 != n2) {
            if (n1 > n2) {
                System.out.println("El mayor entre " + n1 + " y " + n2 + " es " + n1);
            } else {
                System.out.println("El mayor entre " + n1 + " y " + n2 + " es " + n2);
            }
        } else {
            System.out.println("Los números son iguales.");
        }

    }

    public static void ejercicio6(Scanner scanner) {
        Scanner sc = new Scanner(System.in);
        double iva=0.21;
        System.out.println("Ingrese el precio del producto");
        double precio=sc.nextDouble();
        double precioFinal= (precio*iva + precio) ;
        System.out.println("EL PRECIO FINAL CON EL 21% ES : "+precioFinal);
    }

    public static void ejercicio7() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
    public static void ejercicio9() {
        for (int i=1;i<=100;++i){
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("Los numeros divisibles por 2 y 3 son "+i);
            }
        }
    }
    public static void ejercicio10(Scanner scanner) {
        int n3;
        do {
            System.out.print("Ingrese un número mayor o igual a 0: ");
            n3 = scanner.nextInt();
        } while (n3 < 0);
        System.out.println("El número es " + n3);
    }
    public static void ejercicio12(Scanner scanner) {
        int dia;
        do {
            System.out.print("Ingrese un numero del 1 al 7 que corresponda a un dia de la semana: \n ");
            dia = scanner.nextInt();

            if (dia < 1 || dia > 7) {
                System.out.println("Numero no valido. Por favor, ingrese un valor entre 1 y 7:\n");
            }
        } while (dia < 1 || dia > 7);

        String NombreDia;
        switch (dia){
            case 1: System.out.print("Lunes \n");
                break;
            case 2:System.out.print("Martes \n");
                break;
            case 3:System.out.print("Miercoles \n");
                break;
            case 4:System.out.print("Jueves \n");
                break;
            case 5:System.out.print("Viernes \n");
                break;
            case 6:System.out.print("Sabado \n");
                break;
            case 7:System.out.print("Domingo \n");
                break;
        }
        if (dia <=5){
            System.out.print("Es un dia laboral");}
        else{
            System.out.print("No es un dia laboral");

        }
    }
    public static void ejercicio13(Scanner scanner) {
        System.out.print("Ingrese un número para determinar si es primo o no: ");
        int n4 = scanner.nextInt();
        boolean esPrimo = true;
        int counter = 0;

        if (n4 <= 1) {
            esPrimo = false;
        } else {
            for (int i = 1; i <= n4; i++) {
                if (n4 % i == 0) {
                    counter++;
                }
            }
            if (counter > 2) {
                esPrimo = false;
            }
        }

        if (esPrimo) {
            System.out.println("El número " + n4 + " es primo");
        } else {
            System.out.println("El número " + n4 + " no es primo");
        }
    }
}