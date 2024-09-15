package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Declarar e inicializar una matriz de 20x4 (20 países y 3 ciudades por país)
        String[][] paisesCiudades = {
                {"Argentina", "Buenos Aires", "Córdoba", "Rosario"},
                {"Brasil", "São Paulo", "Río de Janeiro", "Brasilia"},
                {"Estados Unidos", "Nueva York", "Los Ángeles", "Chicago"},
                {"Canadá", "Toronto", "Vancouver", "Montreal"},
                {"México", "Ciudad de México", "Guadalajara", "Monterrey"},
                {"España", "Madrid", "Barcelona", "Valencia"},
                {"Francia", "París", "Marsella", "Lyon"},
                {"Alemania", "Berlín", "Múnich", "Hamburgo"},
                {"Italia", "Roma", "Milán", "Nápoles"},
                {"Reino Unido", "Londres", "Manchester", "Birmingham"},
                {"Japón", "Tokio", "Osaka", "Kioto"},
                {"China", "Pekín", "Shanghái", "Guangzhou"},
                {"India", "Nueva Delhi", "Mumbai", "Bangalore"},
                {"Australia", "Sídney", "Melbourne", "Brisbane"},
                {"Rusia", "Moscú", "San Petersburgo", "Novosibirsk"},
                {"Sudáfrica", "Johannesburgo", "Ciudad del Cabo", "Durban"},
                {"Egipto", "El Cairo", "Alejandría", "Giza"},
                {"Turquía", "Estambul", "Ankara", "Esmirna"},
                {"Corea del Sur", "Seúl", "Busan", "Incheon"},
                {"Indonesia", "Yakarta", "Surabaya", "Bandung"}
        };

        // Imprimir la matriz
        for (int i = 0; i < paisesCiudades.length; i++) {
            System.out.print("País: " + paisesCiudades[i][0] + " - Ciudades: ");
            for (int j = 1; j < paisesCiudades[i].length; j++) {
                System.out.print(paisesCiudades[i][j]);
                if (j < paisesCiudades[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
