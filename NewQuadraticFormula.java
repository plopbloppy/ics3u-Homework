import java.util.Scanner;

public class NewQuadraticFormula {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a value for a.");
        double a = keyboard.nextDouble();
        System.out.println("Please enter a value for b.");
        double b = keyboard.nextDouble();
        System.out.println("Please enter a value for c.");
        double c = keyboard.nextDouble();
        keyboard.close();

        double discriminant = b * b - 4 * a * c;
        double firstRoot = (-b - (Math.sqrt(discriminant))) / (2 * a);
        double secondRoot = (-b + (Math.sqrt(discriminant))) / (2 * a);

        if (discriminant > 0) {
            System.out.println("There are two real roots: " + firstRoot + " and " + secondRoot + ".");
        } else if (discriminant == 0) {
            System.out.println("There is one real root: " + firstRoot + ".");
        } else {
            System.out.println("There are no real roots.");
        }
    }
}