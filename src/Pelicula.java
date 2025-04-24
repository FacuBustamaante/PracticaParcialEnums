import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String titulo;
    private Genero genero;
    private List<Funcion> funciones;

    public Pelicula(String titulo, Genero genero, List<Funcion> funciones){
        this.titulo = titulo;
        this.genero = genero;
        this.funciones = new ArrayList<>();
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }
}
