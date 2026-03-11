package Anemica;

import java.time.format.DateTimeFormatter;

// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
// Aca yo tengo los metodos de la clase Tiempo separada en un servicio, sin cumplir con los principios de POO
// Tiempo se convierte en una bolsa de getters y setters
public class TiempoServicio {
    public String formatoLargo(Tiempo tiempo) { //Corrección: Los metodos devuelven String no System.out
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy");
        return tiempo.getFechaHora().format(formatter);
    }

    public String formatoCorto(Tiempo tiempo) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return tiempo.getFechaHora().format(formatter);
    }
}