import java.util.*;
public class Producto {
    public String nombre;
    private int codigo;

    public Producto(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
