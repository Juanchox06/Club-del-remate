import java.util.ArrayList;
java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombreVendedor = sc.nextLine();
        String contraseñaVendedor = sc.nextLine();
        String rolUsuario = sc.nextLine();

        if(rolUsuario.equalsIgnoreCase("vendedor")) {

            vendedor vendedor1 = new vendedor(nombreVendedor, contraseñaVendedor);

            String nombreProducto = sc.nextLine();
            double precioProducto = sc.nextDouble();
            String estadoProducto = sc.nextLine();
            String descripcionProducto = sc.nextLine();

            productos producto1 = new productos(nombreProducto, precioProducto, estadoProducto, descripcionProducto);
           
            System.out.println("Cuantos productos desea agregar hoy?");
            int x = sc.nextInt();
            for (int i = 0; i < x; i++) {
                sc.nextLine(); 
                String nombreProd = sc.nextLine();
                double precioProd = sc.nextDouble();
                sc.nextLine(); 
                String estadoProd = sc.nextLine();
                String descripcionProd = sc.nextLine();

                productos nuevoProducto = new productos(nombreProd, precioProd, estadoProd, descripcionProd);
                vendedor1.agregarProductoVendedor(nuevoProducto);
            }
            vendedor1.mostrarProductosVendedor();
        }else if(rolUsuario.equalsIgnoreCase("comprador")) {
            String nombreComprador = sc.nextLine();
            String contraseñaComprador = sc.nextLine();

            comprador comprador1 = new comprador(nombreComprador, contraseñaComprador);
        }else{
            System.out.println("Rol de usuario no válido.");
            return 0;
        }
        sc.close();
    }
}