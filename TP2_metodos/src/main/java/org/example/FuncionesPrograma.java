package org.example;
import java.util.Calendar;
import java.util.Date;
public class FuncionesPrograma {
    public static Date getFechaDate(int dia, int mes, int anio){
        Calendar calendario = Calendar.getInstance();
        calendario.set(anio,mes - 1,dia);
        return calendario.getTime();
    }
    public static String getFechaString(Date fecha){
        return fecha.toString();
    }
}
