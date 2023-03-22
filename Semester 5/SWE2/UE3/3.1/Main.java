public class Main {
    public static void main(String args[]) {
        IWetterstation wetterstation = new ProxyWetter();
        wetterstation.setFahrenheit(70);
        System.out.println(wetterstation.getTemperatur());
    }
}