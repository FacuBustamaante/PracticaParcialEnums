import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
    private Date fecha;
    private Pago pago;
    private List<Funcion> funciones;
    private List<Cliente> clientes;


    public Venta(Date fecha, List<Funcion> funciones, List<Cliente> clientes, Pago pago){
        this.fecha = fecha;
        this.pago = pago;
        this.funciones = new ArrayList<>();
        this.clientes = new ArrayList<>();

    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    @Override
    public String toString() {
        return "Venta{" + "fecha=" + fecha + '}';
    }
}
