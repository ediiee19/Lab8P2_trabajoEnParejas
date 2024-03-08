
public class admin extends User{
    private int torneoCreados;

    public admin() {
    }

    public admin(int torneoCreados, String nombre, String contra) {
        super(nombre, contra);
        this.torneoCreados = 0;
    }

    public int getTorneoCreados() {
        return torneoCreados;
    }

    public void setTorneoCreados(int torneoCreados) {
        this.torneoCreados = torneoCreados;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
