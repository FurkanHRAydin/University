public class Park {
    private Boden boden;
    private Umrandung umrandung;
    private Pflanze pflanze;
    private String type;

    private AbstractParkFactory abstractFactory;
    private ParkGeneratorFactory parkgenFactory;

    public Park(String type) {} {
        this.type = type;
    }

    public void create() throws Exception {
        abstractFactory = parkgenFactory.createParkGenerator(this.type);
        boden = abstractFactory.createBoden();
        umrandung = abstractFactory.createUmrandung();
        pflanze = abstractFactory.createPflanze();
    }
}