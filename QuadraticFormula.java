import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter a value for a.");
        double a = keyboard.nextDouble();
        System.out.println("Please enter a value for b.");
        double b = keyboard.nextDouble();
        System.out.println("Please enter a value for c.");
        double c = keyboard.nextDouble();
        double discriminant = b * b - 4 * a * c;
        keyboard.close();

        double firstRoot = (-b - (Math.sqrt(discriminant)))/(2*a);
        double secondRoot = (-b + (Math.sqrt(discriminant)))/(2*a);
        
        System.out.println("x = " + firstRoot + " and x = " + secondRoot + ".");
    }
}
