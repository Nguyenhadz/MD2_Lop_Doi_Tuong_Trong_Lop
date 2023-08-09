package Class_Fan;

public class Fan {
    final private int SLOW = 1;
    final private int MEDIUM = 2;
    final private int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan(){
        this.speed = 1;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toStringON() {
        return "The Fan: Speed - " + this.speed +", Color - " + this.color + ", Radius -" + this.radius +", Fan is ON";
    }
    public String toStringOFF() {
        return "The Fan: Color - " + this.color + ", Radius - " + this.radius + ", Fan is OFF";
    }
}
