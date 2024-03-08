
import java.io.*;
import java.util.*;

public class adminUsuarios {

    private ArrayList<User> listaUsuarios = new ArrayList();
    private File archivo = null;

    public adminUsuarios(String ruta) {
        archivo = new File(ruta);
    }

    public ArrayList<User> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<User> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    @Override
    public String toString() {
        return "listaUuarios=" + listaUsuarios;
    }
    
    public void setUsuario(User user){
        this.listaUsuarios.add(user);
    }
    
    public void cargarArchivo() {
        try {
            listaUsuarios = new ArrayList();
            User temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (User) objeto.readObject()) != null) {
                        listaUsuarios.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (User user : listaUsuarios) {
                bw.writeObject(user);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
