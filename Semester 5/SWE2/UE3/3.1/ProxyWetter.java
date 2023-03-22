public class ProxyWetter implements IWetterstation {
    
    IWetterstation wetterstation;
    private double fahrenheit;

    public ProxyWetter() {
        wetterstation = new Wetterstation();
    }

    public double getTemperatur() {
        return (fahrenheit-32) * 5/9;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}