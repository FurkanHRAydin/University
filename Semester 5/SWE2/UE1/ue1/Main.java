public class Main {

    public static void main(String[] args) {
        Notebooktype MacBookPro = new Notebooktype("MacBookPro");

        AusstattungsteilTyp gpu = new AusstattungsteilTyp("gpu");
        AusstattungsteilTyp cpu = new AusstattungsteilTyp("cpu");

        MacBookPro.addAusstattungstyp(gpu);

        Notebook mac = new Notebook("mac", MacBookPro);

        Ausstattungsteil a = new Ausstattungsteil("a", gpu);
        Ausstattungsteil b = new Ausstattungsteil("b", cpu);

        mac.addAusstattung(a);
        mac.addAusstattung(b);
    }
}