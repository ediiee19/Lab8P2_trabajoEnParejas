
import java.io.Serializable;


public class User implements Serializable{
  
    private String nombre, contra;
    
    private static final long SerialVersionUID = 333L;
            
    public User() {
    }

    public User(String nombre, String contra) {
        this.nombre = nombre;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
