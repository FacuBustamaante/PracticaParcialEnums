import java.util.ArrayList;
import java.util.List;

public class Cine {
    private String nombre;
    private String direccion;
    private List<Empleado> empleados;
    private List<Pelicula> peliculas;
    private List<Venta> ventas;
    private List<SalaVIP> salasVIP;
    private List<Sala> salasNormal;
    private List<Compra> compras;

    public Cine(String nombre, String direccion, List<Empleado> empleados, List<Pelicula> peliculas, List<Venta> ventas, List<SalaVIP> salasVIP, List<Sala> salasNormal, List<Compra> compras) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = new ArrayList<>();
        this.peliculas = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.salasVIP = new ArrayList<>();
        this.salasNormal = new ArrayList<>();
        this.compras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public List<SalaVIP> getSalasVIP() {
        return salasVIP;
    }

    public void setSalasVIP(List<SalaVIP> salasVIP) {
        this.salasVIP = salasVIP;
    }

    public List<Sala> getSalasNormal() {
        return salasNormal;
    }

    public void setSalasNormal(List<Sala> salasNormal) {
        this.salasNormal = salasNormal;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
}
