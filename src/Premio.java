public class Premio extends ElementoSorteable {
    private String nombre;
    private String ubicacion;
    private double valor;

    public Premio(String nombre, String ubicacion, double valor) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.valor = valor;
    }

    @Override
    public String mostrarInformacion() {
        return "Premio: " + nombre + ", ubicación: " + ubicacion + ", valor: $" + valor;
    }
}
