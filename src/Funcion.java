import java.util.ArrayList;
import java.util.List;

public class Funcion {
    private String horario;
    private List<Venta> ventas;
    private List<Sala> salas;
    private List<Entrada> entradas;

    public Funcion(String horario, List<Venta> ventas, List<Sala> salas, List<Entrada> entradas){
        this.horario = horario;
        this.ventas = new ArrayList<>();
        this.salas = new ArrayList<>();
        this.entradas = new ArrayList<>();
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public List<Venta> getVentas() {
        return ventas;
    }
    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
}
