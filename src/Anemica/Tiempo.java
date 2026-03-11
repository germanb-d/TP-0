package Anemica;

import java.time.LocalDateTime;

public class Tiempo {
    private LocalDateTime fechaHora;

    public Tiempo() {
        this.fechaHora = LocalDateTime.now();
    }

    //Al no tener metodos y estos estar en un servicio aparte, la clase Tiempo se vuelve en una clase solo con un get
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
}