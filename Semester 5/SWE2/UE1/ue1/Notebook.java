import java.util.*;

public class Notebook {

    private String name;
    ArrayList<Ausstattungsteil> ausstattung = new ArrayList<>();
    Notebooktype typ;

    public Notebook(String name, Notebooktype typ) {
        this.name = name;
        this.typ = typ;
    }

    public void addAusstattung(Ausstattungsteil ausstattungsTeil) {
        if(this.getType().isAllowedToAdd(ausstattungsTeil.getTyp())) {
            this.ausstattung.add(ausstattungsTeil);
            System.out.println("Ausstattung Hinzugefuegt");
        } else {
            System.out.println("Konnte nicht hinzugefuegt werden");
        }    
    }

    public void removeAusstattung(Ausstattungsteil ausstattungsTeil) {
        this.ausstattung.remove(ausstattungsTeil);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Ausstattungsteil> getAusstatung() {
        return this.ausstattung;
    }

    public void setAusstattungsteilTyp(ArrayList<Ausstattungsteil> ausstattung) {
        this.ausstattung = ausstattung;
    }

    public Notebooktype getType() {
        return this.typ;
    }

    public void setTyp(Notebooktype typ) {
        this.typ = typ;
    }
}
