public class Personas {
    private String DNI;
    private String nombre;
    private int edad;
    private String direccion;

    public Personas() {
        this.DNI = "191919191D";
        this.nombre = "Jose Manuel";
        this.edad = 23;
        this.direccion = "Salvaterra do Miño";
    }

    public Personas(String DNI, String nombre, int edad, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    static double coste(){
        return 0;
    }
}
