import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
    private Date fecha;
    private List<Insumo> insumos;
    private List<Proveedor> proveedores;

    public Compra(Date fecha, List<Insumo> insumos, List<Proveedor> proveedores){
        this.fecha = fecha;
        this.insumos = new ArrayList<>();
        this.proveedores = new ArrayList<>();
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Insumo> getInsumos() {
        return insumos;
    }
    public void setInsumos(List<Insumo> insumos) {
        this.insumos = insumos;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }
    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
}
