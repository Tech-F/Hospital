import java.time.LocalDate;

public class Trabajadores extends Personas{
    private LocalDate fechaIncorporacion;
    private String areaTrabajo;
    private String cargoHospital;
    private double salario;
    private LocalDate fechaIngreso;

    public Trabajadores() {
        super();
        this.fechaIncorporacion = LocalDate.of(2000,1,1);
        this.areaTrabajo = "Reumatoloxia";
        this.cargoHospital = "Reumatologa";
        this.salario = 8000;
        this.fechaIngreso = LocalDate.of(2019,9,8);
    }

    public Trabajadores(String DNI, String nombre, int edad, String direccion, LocalDate fechaIncorporacion, String areaTrabajo, String cargoHospital, double salario, LocalDate fechaIngreso) {
        super(DNI, nombre, edad, direccion);
        this.fechaIncorporacion = fechaIncorporacion;
        this.areaTrabajo = areaTrabajo;
        this.cargoHospital = cargoHospital;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public String getCargoHospital() {
        return cargoHospital;
    }

    public void setCargoHospital(String cargoHospital) {
        this.cargoHospital = cargoHospital;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    static double coste(){
        double coste
        this.salario;
    }

}
