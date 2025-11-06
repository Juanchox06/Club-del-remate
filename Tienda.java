mport java.util.ArrayList;
import java.util.Scanner;
public class Tienda {

    private ArrayList<Usuario> usuarios;
    private Usuario usuarioActual;
    private Scanner scanner;

    // Constructor: Se ejecuta cuando creas una "Tienda"
    public Tienda() {
        this.usuarios = new ArrayList<>();
        this.usuarioActual = null;
        this.scanner = new Scanner(System.in);
    }