import java.util.ArrayList;
public class vendedor extends Usuario {
    
    final private double comisionPagina = 0.80;
    private int totalVentas;
    private double dineroRecaudado;
    private arraylist<Productos> listaProductosVendedor;


    public vendedor(String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
        this.totalVentas = 0;
        this.dineroRecaudado = 0;
        this.listaProductosVendedor = new ArrayList<>();
    }


    public double getComisionPagina() {
        
        return comisionPagina*totalVentas;
    }

    public void mostrarProductosVendedor() {
        for (Productos producto : listaProductosVendedor) {
            System.out.println("Producto: " + producto.getNombreProducto() + ", Precio: " + producto.getPrecioProducto()+", Estado: " + producto.getEstadoProducto() + ". \n Descripción: " + producto.getDescripcionProducto());
        }
    }

    public void agregarProductoVendedor(Productos producto) {
        listaProductosVendedor.add(producto);
    }
    


}