public class Main {
    public static void main(String args[]) throws NullPointerException {
        Park park = new Park();
        try {
            park.create("Klosterpark");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}