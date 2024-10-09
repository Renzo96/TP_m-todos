import java.util.Scanner;

public class OperacionesFraccion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numerador de la primera fracción");
        int numerador1 = scanner.nextInt();
        System.out.println("Ingrese el denominaors de la primera fracción");
        int denominador1 = scanner.nextInt();
        System.out.println("Ingrese el numerador de la segunda fracción");
        int numerador2 = scanner.nextInt();
        System.out.println("Ingrese el denominador de la segunda fracción");
        int denominador2 = scanner.nextInt();

        Fraccion fraccion1 = new Fraccion(numerador1, denominador1);
        Fraccion fraccion2 = new Fraccion(numerador2, denominador2);

        Fraccion suma = Fraccion.sumarFracciones(fraccion1, fraccion2);
        Fraccion resta = Fraccion.restarFracciones(fraccion1, fraccion2);
        Fraccion division = Fraccion.dividirFracciones(fraccion1, fraccion2);
        Fraccion multiplicacion = Fraccion.multiplicarFracciones(fraccion1, fraccion2);

        System.out.println("Suma " + suma);
        System.out.println("Resta " + resta);
        System.out.println("División " + division);
        System.out.println("Multiplicación " + multiplicacion);
    }
}
