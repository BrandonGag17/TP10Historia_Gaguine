import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Urna<T extends ElementoSorteable> {
    private List<T> elementos;
    private Random random;

    public Urna() {
        elementos = new ArrayList<>();
        random = new Random();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T extraer() {
        if (estaVacia()) {
            throw new IllegalStateException("No se puede extraer: la urna está vacía.");
        }

        int posicion = random.nextInt(elementos.size());
        // Al eliminarlo, el elemento no puede volver a salir sorteado.
        return elementos.remove(posicion);
    }

    public int cantidad() {
        return elementos.size();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}
