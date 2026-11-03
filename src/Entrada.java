public class Entrada extends ElementoSorteable {
    private String nombreEvento;
    private String ubicacion;
    private int numeroEntrada;

    public Entrada(String nombreEvento, String ubicacion, int numeroEntrada) {
        this.nombreEvento = nombreEvento;
        this.ubicacion = ubicacion;
        this.numeroEntrada = numeroEntrada;
    }

    @Override
    public String mostrarInformacion() {
        return "Entrada: " + nombreEvento + ", ubicación: " + ubicacion
                + ", número: " + numeroEntrada;
    }
}
