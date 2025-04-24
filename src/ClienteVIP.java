public class ClienteVIP {
    protected float descuento;
    private Cliente cliente;

    public ClienteVIP(float descuento) {
        this.descuento = descuento;
    }
    public float getDescuento() {
        return descuento;
    }
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
