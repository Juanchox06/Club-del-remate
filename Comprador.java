public class comprador extends Usuario {
    
    private arraylist<Productos> HistorialCompras;

    public comprador(String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
        this.HistorialCompras = new ArrayList<>();
    }

   
    }
}