import java.util.Scanner;
public class RavioliRavioliGiveMeTheConeFormuoli {
    final static double PI = 3.14159;
    public static void main(String [] args) {
        double height = 0;
        double r = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the height of the cone?");
        height = userInput.nextDouble();
        System.out.println("What is the radius of the base of the cone?");
        r = userInput.nextDouble();
        double coneRadius = coneCalculation(height,r);
        System.out.println("The volume of your cone is "+coneRadius+" units cubed.");
    }

    private static double coneCalculation(double h, double rad) {
        double temp = (1.0/3.0) * h * PI * (rad * rad);
        return temp;
    }
}
