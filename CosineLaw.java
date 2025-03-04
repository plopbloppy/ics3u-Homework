import java.util.Scanner;

public class CosineLaw {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a value for side a:");
        double a = keyboard.nextDouble();
        System.out.println("Please enter a value for side b:");
        double b = keyboard.nextDouble();
        System.out.println("Please enter a value for angle C:");
        double angleC = keyboard.nextDouble();
        keyboard.close();
        
        double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(angleC)));
        System.out.println("The value of side c is: " + c);
    }
}
