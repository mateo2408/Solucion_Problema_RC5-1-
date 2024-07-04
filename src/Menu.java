import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<Plato> platos;

    public Menu() {
        this.platos = new ArrayList<>();
    }

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public void eliminarPlato(String platoID) {
        for (Plato plato : platos) {
            if (equals(plato.getPlatoID()))
            {
                platos.remove(plato);
                break;
            }
        }
    }

    public void modificarPrecioPlato(String platoID, double precio) {
        for (Plato plato : platos) {
            if (equals(plato.getPlatoID())){
                plato.actualizarPrecio(precio);
                break;
            }
        }
    }

    public void mostrarMenu() {
        for (Plato plato : platos) {
            plato.mostrarPlato();
        }
    }
}
