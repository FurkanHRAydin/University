import java.util.ArrayList;

public class Notebooktype {
    private String name;
    ArrayList<AusstattungsteilTyp> ausstattungsTypen = new ArrayList<>();

    public Notebooktype(String name) {
        this.name = name;
    }

    public boolean isAllowedToAdd(AusstattungsteilTyp ausstattungsteilTyp) {
        return ausstattungsTypen.contains(ausstattungsteilTyp);
    }

    public void addAusstattungstyp(AusstattungsteilTyp ausstattungsteilTyp) {
        this.ausstattungsTypen.add(ausstattungsteilTyp);
    }

    public void removeAusstattungstyp(AusstattungsteilTyp ausstattungsteilTyp) {
        this.ausstattungsTypen.remove(ausstattungsteilTyp);
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<AusstattungsteilTyp> getAusstatungstypen() {
        return this.ausstattungsTypen;
    }

    public void setAusstattungstypen(ArrayList<AusstattungsteilTyp> ausstattungsTypen) {
        this.ausstattungsTypen = ausstattungsTypen;
    }
}
