package Class_QuadraticEquation;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDelta()>0) {
            System.out.println("The equation has 2 roots: "+ quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDelta() == 0) {
            System.out.println("The equation has 1 roots: "+ quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no real root");
        }
    }
}
