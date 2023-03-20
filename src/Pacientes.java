import java.time.LocalDate;
import java.util.HashMap;
import java.util.TreeSet;

public class Pacientes extends Personas {
private LocalDate fechaIngreso;
private String patologia;
private AreasIngreso areas;
private HashMap<Integer,AreasIngreso> registro=new HashMap<>();

    public Pacientes(String DNI, String nombre, int edad, String direccion, LocalDate fechaIngreso, String patologia, AreasIngreso areas, HashMap<Integer, AreasIngreso> registro) {
        super(DNI, nombre, edad, direccion);
        this.fechaIngreso = fechaIngreso;
        this.patologia = patologia;
        this.areas = areas;
        this.registro = registro;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public AreasIngreso getAreas() {
        return areas;
    }

    public void setAreas(AreasIngreso areas) {
        this.areas = areas;
    }

    public HashMap<Integer, AreasIngreso> getRegistro() {
        return registro;
    }

    public void setRegistro(HashMap<Integer, AreasIngreso> registro) {
        this.registro = registro;
    }
}
