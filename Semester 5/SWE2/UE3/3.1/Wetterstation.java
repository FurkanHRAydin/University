public class Wetterstation implements IWetterstation {
    
    private double fahrenheit;

    public double getTemperatur() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }
}