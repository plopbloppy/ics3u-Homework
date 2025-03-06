import java.util.Scanner;

public class PolynomialEvaluator2 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the coefficient of each term separated by a space:");
        String coeffInput = keyboard.nextLine();
        String[] coeffData = coeffInput.split(" ");

        System.out.println("Please enter the degree of each term separated by a space:");
        String degInput = keyboard.nextLine();
        String[] degData = degInput.split(" ");

        System.out.println("Please enter an x value:");
        double x = keyboard.nextDouble();
        double fx = 0.0;
        keyboard.close();

        System.out.println("Your polynomial function is: f(x) = " );
        for (int i = 0; i < coeffData.length; i++) {
            fx += (Math.pow(Double.valueOf(coeffData[i]) * x, Double.valueOf(degData[i])));
            System.out.println(coeffData[i] + "x^" + degData[i]);
        }
        System.out.println("Your polynomial at x = " + x + " is: f(" + x + ") = " + fx);
    }
}