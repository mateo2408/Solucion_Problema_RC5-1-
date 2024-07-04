public class Plato {
    private String nombre;
    private double precio;
    private String platoID;

    public Plato(String nombre, double precio, String platoID) {
        this.nombre = nombre;
        this.precio = precio;
        this.platoID = platoID;
    }

    public void actualizarPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarPlato() {
        System.out.println("Plato: " + nombre + " Precio: " + precio + " ID: " + platoID);
    }

    public String getPlatoID() {
        return platoID;
    }
}
