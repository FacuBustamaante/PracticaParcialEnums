import java.util.ArrayList;
import java.util.List;

public class Pago {
    private double monto;
    private TipoPago tipoPago;
    private List<Venta> ventas;
    public Pago(double monto, TipoPago tipoPago, List<Venta> ventas) {
        this.monto = monto;
        this.tipoPago = tipoPago;
        this.ventas = new ArrayList<>();
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
}
