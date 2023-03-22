import java.util.*;

public class Kunde {

    ArrayList<Notebook> bestellung = new ArrayList<>();

    public Kunde() {}

    public void addNotebook(Notebook notebook) {
        bestellung.add(notebook);
    }

    public void removeNotebook( Notebook notebook) {
        bestellung.remove(notebook);
    }

    public ArrayList<Notebook> getBestellung() {
        return this.bestellung;
    }

    public void setBestellung(ArrayList<Notebook> bestellung) {
        this.bestellung = bestellung;
    }
}
