import java.io.Serializable;
import java.util.UUID;

public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String nombre;
    private String descripcion;
    private String categoria;
    private double precio;
    private int cantidad;
    private String estado;
    private String idVendedor;
    public Producto(String nombre, String descripcion, String categoria, double precio, int cantidad, String estado, String idVendedor) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
        this.estado = estado;
        this.idVendedor = idVendedor;
    }
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getCategoria() { return categoria; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public void reducirCantidad(int cantidadComprada) { this.cantidad -= cantidadComprada; if (this.cantidad < 0) this.cantidad = 0; }
    public String getEstado() { return estado; }
    public String getIdVendedor() { return idVendedor; }
    @Override
    public String toString() { return nombre + " - $" + precio + " (" + estado + ")"; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public void setEstado(String estado) { this.estado = estado; }
}