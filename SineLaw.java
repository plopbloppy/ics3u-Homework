import java.util.Scanner;

public class SineLaw {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter a value for side a:");
        double a = keyboard.nextDouble();
        System.out.println("Please enter a value for side b:");
        double b = keyboard.nextDouble();
        System.out.println("Please enter a value for angle A:");
        double angleA = keyboard.nextDouble();
        keyboard.close();

        angleA = Math.asin(b * (Math.sin(Math.toRadians(angleA)) / a));
        System.out.println("Your missing angle is: " + Math.toDegrees(angleA) + " degrees.");
    }
}
