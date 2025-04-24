import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String email;
    private List<Venta> ventas;

    public Cliente(String nombre, String email, List<Venta> ventas){
        this.nombre = nombre;
        this.email = email;
        this.ventas = new ArrayList<>();
    }
    public Cliente(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public List<Venta> getVentas() {
        return ventas;
    }
}
