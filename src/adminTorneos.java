
import java.io.*;
import java.util.*;

public class adminTorneos {

    private ArrayList<Torneo> torneos = new ArrayList();
    private File archivo = null;

    public adminTorneos(String ruta) {
        archivo = new File(ruta);
    }

    public ArrayList<Torneo> getListatorneos() {
        return torneos;
    }

    public void setListaUsuarios(ArrayList<Torneo> listatorneos) {
        this.torneos = listatorneos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listatorneos=" + torneos;
    }

    public void setTorneo(Torneo torneo) {
        this.torneos.add(torneo);
    }

    public void cargarArchivo() {
        try {
            torneos = new ArrayList();
            Torneo temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Torneo) objeto.readObject()) != null) {
                        torneos.add(temp);
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
            for (Torneo torneo : torneos) {
                bw.writeObject(torneo);
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
