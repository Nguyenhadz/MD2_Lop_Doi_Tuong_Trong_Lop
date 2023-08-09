package Class_QuadraticEquation;
import java.util.Scanner;
public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation() {
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    Scanner scanner = new Scanner(System.in);
    public double getDelta() {
        return (this.b*this.b-4*this.a*this.c);
    }
    public double getRoot1() {
        return (-this.b + Math.sqrt(this.getDelta()))/(2*this.a);
    }
    public double getRoot2() {
        return (-this.b - Math.sqrt(this.getDelta()))/(2*this.a);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
