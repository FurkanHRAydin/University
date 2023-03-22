public class StadtparkGenerator implements AbstractParkFactory {
   
    @Override public Boden createBoden() {
        return new Gras();
    }
    
    @Override public Pflanze createPflanze() {
        return new Rose();
    }

    @Override public Umrandung createUmrandung() {
        return new Hecke();
    }
}