
import java.util.ArrayList;


public class Torneo {
   private String nombre;
   private ArrayList<Participante> lista;
   private boolean entrada;
   private boolean estado;

    public Torneo() {
    }

    public Torneo(String nombre, ArrayList<Participante> lista, boolean entrada, boolean estado) {
        this.nombre = nombre;
        this.lista = lista;
        this.entrada = entrada;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Participante> lista) {
        this.lista = lista;
    }

    public boolean isEntrada() {
        return entrada;
    }

    public void setEntrada(boolean entrada) {
        this.entrada = entrada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
   
}
