public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        if (denominador != 0) {
            this.numerador = numerador;
            this.denominador = denominador;
        } else {
            throw new IllegalArgumentException("El denominador no puede ser nulo");
        }
    }

    //    @Getters and setters
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            throw new RuntimeException("El denominador no puede ser nulo");
        }
    }

    //    Métodos para operaciones
    public static Fraccion sumarFracciones(Fraccion f1, Fraccion f2) {
        int nuevoNumerador = f1.getNumerador() * f2.getDenominador() + f2.getNumerador() * f1.getDenominador();
        int nuevoDenominador = f1.getDenominador() * f2.getDenominador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }
    public static Fraccion restarFracciones(Fraccion f1, Fraccion f2) {
        int nuevoNumerador = f1.getNumerador() * f2.getDenominador() - f2.getNumerador() * f1.getDenominador();
        int nuevoDenominador = f1.getDenominador() * f2.getDenominador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public static Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2) {
        int nuevoNumerador = f1.getNumerador()  * f2.getNumerador();
        int nuevoDenominador = f1.getDenominador() * f2.getDenominador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }
    public static Fraccion dividirFracciones(Fraccion f1, Fraccion f2) {
        if (f2.getNumerador() == 0){
            throw new RuntimeException("El numerador no puede ser cero");
        }
        int nuevoNumerador = f1.getNumerador() * f2.getDenominador();
        int nuevoDenominador = f1.getDenominador() * f2.getNumerador();

        return new Fraccion(nuevoNumerador, nuevoDenominador);

    }
    @Override
    public String toString(){
        return numerador + "/" + denominador;
    }
}

