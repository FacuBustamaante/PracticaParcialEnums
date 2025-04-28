public class SalaVIP {
    protected String beneficios;
    private Sala sala;


    /*En este punto para realizar la herencia de Sala y SalaVIP
    * resolvi crear un objeto tipo Sala y un constructor vacio, esa solucion
    * encontre investigando en internet pero me genera dudas de si es correcto.
    * MISMO CASO EN CLIENTE Y CLIENTEVIP
    * */

    public SalaVIP(String beneficios, Sala sala) {
        this.beneficios = beneficios;
        this.sala = sala;
    }
    public String getBeneficios() {
        return beneficios;
    }
    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
