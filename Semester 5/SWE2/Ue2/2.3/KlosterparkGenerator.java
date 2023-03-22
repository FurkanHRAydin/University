public class KlosterparkGenerator implements AbstractParkFactory {
    
    @Override public Boden createBoden() {
        return new Steinplatten();
    }
    
    @Override public Pflanze createPflanze() {
        return new Kraeuter();
    }

    @Override public Umrandung createUmrandung() {
        return new Steinmauer();
    }
}