public class Ausstattungsteil {
    String name;
    AusstattungsteilTyp ausstattungsteilTyp;

    public Ausstattungsteil(String name, AusstattungsteilTyp ausstatungsteilTyp) {
        this.name = name;
        this.ausstattungsteilTyp = ausstatungsteilTyp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AusstattungsteilTyp getTyp() {
        return ausstattungsteilTyp;
    }

    public void setTyp(AusstattungsteilTyp ausstattungsteilTyp) {
        this.ausstattungsteilTyp = ausstattungsteilTyp;
    }
}
