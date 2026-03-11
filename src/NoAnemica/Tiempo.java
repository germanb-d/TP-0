package NoAnemica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tiempo {
    private LocalDateTime fechaHora;

    // Ahora tanto los atributos como los metodos estan en una misma clase.
    public Tiempo() {
        this.fechaHora = LocalDateTime.now();
    }

    public String formatoLargo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy");
        return fechaHora.format(formatter);
    }

    public String formatoCorto() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaHora.format(formatter);
    }
}