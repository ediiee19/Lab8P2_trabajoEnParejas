
import java.util.ArrayList;

public class Participante extends User {

    private ArrayList<Torneo> torneos, torneosGanados;

    public Participante() {
    }

    public Participante(String nombre, String contra) {
        super(nombre, contra);
        this.torneos = new ArrayList();
        this.torneosGanados = new ArrayList();
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

    public ArrayList<Torneo> getTorneosGanados() {
        return torneosGanados;
    }

    public void setTorneosGanados(ArrayList<Torneo> torneosGanados) {
        this.torneosGanados = torneosGanados;
    }

    public void addTorneoPart(Torneo torneo) {
        torneos.add(torneo);
    }

    public void addTorneoWin(Torneo torneo) {
        torneosGanados.add(torneo);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
