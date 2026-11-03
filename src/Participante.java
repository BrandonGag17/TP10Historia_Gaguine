public class Participante extends ElementoSorteable {
    private String nombre;
    private String apellido;
    private int edad;

    public Participante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String mostrarInformacion() {
        return "Participante: " + nombre + " " + apellido + ", edad: " + edad;
    }
}
