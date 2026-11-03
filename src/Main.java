public class Main {
    public static void main(String[] args) {
        Urna<ElementoSorteable> urna = new Urna<>();

        urna.agregar(new Participante("Ana", "García", 17));
        urna.agregar(new Participante("Mateo", "López", 18));
        urna.agregar(new Premio("Auriculares", "Oficina central", 25000.0));
        urna.agregar(new Entrada("Festival de Música", "Fila 12", 148));

        System.out.println("Cantidad inicial de elementos: " + urna.cantidad());

        while (!urna.estaVacia()) {
            ElementoSorteable elemento = urna.extraer();
            System.out.println("Sorteado: " + elemento.mostrarInformacion());
            System.out.println("Elementos restantes: " + urna.cantidad());
        }

        try {
            urna.extraer();
        } catch (IllegalStateException excepcion) {
            System.out.println("Extracción no disponible: " + excepcion.getMessage());
        }

        System.out.println("Estado final: urna vacía = " + urna.estaVacia()
                + ", cantidad = " + urna.cantidad());
    }
}
