import java.time.LocalDate;
import java.util.HashMap;

public class AreasIngreso extends Areas{
private LocalDate fechaIngreso;
private LocalDate fechaSalida;


    public AreasIngreso(int id, String nombreEspecialidad) {
        super(id, nombreEspecialidad);
    }

    public AreasIngreso() {
        super();
        this.fechaIngreso = LocalDate.of(2022,9,22);
        this.fechaSalida = LocalDate.of(2022,9,24);
    }

    public AreasIngreso(int id, String nombreEspecialidad, LocalDate fechaIngreso, LocalDate fechaSalida) {
        super(id, nombreEspecialidad);
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
