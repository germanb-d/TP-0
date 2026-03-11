package Anemica;

public class Main {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo();
        TiempoServicio servicio = new TiempoServicio();

        System.out.println(servicio.formatoLargo(tiempo));
        System.out.println(servicio.formatoCorto(tiempo));
    }
}