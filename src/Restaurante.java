public class Restaurante {
    private String nombreR;
    private String direccion;
    private String telefono;
    private Menu menu;

    public Restaurante(String nombreR, String direccion, String telefono) {
        this.nombreR = nombreR;
        this.direccion = direccion;
        this.telefono = telefono;
        this.menu = new Menu();
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public Menu getMenu() {
        return menu;
    }

    public void mostrarMenu() {
        menu.mostrarMenu();
    }
}
