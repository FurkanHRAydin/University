package application;

public class Postion {
    private final double xPos;
    private final double yPos;
    
    public Postion(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    
    public double getXPos() {return xPos;}
    
    public double getYPos() {return yPos;}
    
    @Override
    public String toString() {
        return "Postion{" + "xPos=" +xPos + ", yPos=" + yPos + "}";
    }
}
