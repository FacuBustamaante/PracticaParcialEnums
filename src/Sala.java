import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int numero;
    private int capacidad;
    private List<Funcion> funciones;

    public Sala(int numero, int capacidad, List<Funcion> funciones) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.funciones = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }
}
