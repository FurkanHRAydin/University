public abstract class Fahrzeug {
    double preis;

    public Fahrzeug(double preis) {
        this.preis = preis;
    }

    public double getPreis() {
        return this.preis;
    }

    public String getBeschreibung() {
        return "Bestelltes Fahrzeug: Ein Fahrzeug des " + this;
    }

    
}