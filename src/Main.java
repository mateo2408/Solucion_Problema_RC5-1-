import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a nuestro restaurante");
        Scanner sc = new Scanner(System.in);
        int opcion;
        Restaurante restaurante = new Restaurante("", "", "");

        do {
            System.out.println("Ingrese la opcion que desea realizar");
            System.out.println("1. Informacion del Restaurante");
            System.out.println("2. Crear un plato");
            System.out.println("3. Ver Menu");
            System.out.println("4. Modificar Precio de un plato");
            System.out.println("5. Eliminar un plato");
            System.out.println("6. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Ingrese el nombre del restaurante");
                    String nombreR = sc1.next();
                    System.out.println("Ingrese la direccion del restaurante");
                    String direccion = sc1.next();
                    System.out.println("Ingrese el telefono del restaurante");
                    String telefono = sc1.next();
                    restaurante = new Restaurante(nombreR, direccion, telefono);
                    System.out.println("Informacion del restaurante actualizada.");
                    break;
                case 2:
                    Scanner sc2 = new Scanner(System.in);
                    Scanner sc7 = new Scanner(System.in);
                    System.out.println("Ingrese el nombre del plato");
                    String nombre = sc2.next();
                    System.out.println("Ingrese el precio del plato");
                    double precioPlato = sc2.nextDouble();
                    System.out.println("Ingrese el ID del plato");
                    String platoID1 = sc7.nextLine();
                    Plato plato = new Plato(nombre, precioPlato, platoID1);
                    restaurante.getMenu().agregarPlato(plato);
                    System.out.println("Plato creado y agregado al menu.");
                    break;
                case 3:
                    System.out.println("Menu del restaurante:");
                    restaurante.mostrarMenu();
                    break;
                case 4:
                    Scanner sc3 = new Scanner(System.in);
                    Scanner sc9 = new Scanner(System.in);
                    System.out.println("Ingrese el ID del plato que desea modificar");
                    String platoID2 = sc9.nextLine();
                    System.out.println("Ingrese el nuevo precio del plato");
                    double precioNuevo = sc3.nextDouble();
                    restaurante.getMenu().modificarPrecioPlato(platoID2, precioNuevo);
                    System.out.println("Precio del plato modificado.");
                    break;
                case 5:
                    Scanner sc0 = new Scanner(System.in);
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Ingrese el ID del plato que desea eliminar");
                    String platoID3 = sc0.nextLine();
                    restaurante.getMenu().eliminarPlato(platoID3);
                    System.out.println("Plato eliminado del menu.");
                    break;
                case 6:
                    System.out.println("Gracias por visitar nuestro restaurante");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 6);
    }
}