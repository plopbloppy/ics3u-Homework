import java.util.Scanner;

public class PolynomialFunction {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String function = "f(x) = ";
        double sum = 0.0;
        
        System.out.println("Please enter the coefficients, each separated by a space:");
        String coefficients = keyboard.nextLine();
        System.out.println("Please enter the exponents, each separated by a space:");
        String exponents = keyboard.nextLine();
        System.out.println("Please enter an x value:");
        double x = keyboard.nextDouble();
        keyboard.close();

        String[] coefData = coefficients.split(" ");
        String[] expData = exponents.split(" ");  

        for (int i = 0; i < coefData.length; i++) {
            sum += (Math.pow(Double.parseDouble(coefData[i]) * x, Double.parseDouble(expData[i])));
            if (i == coefData.length - 1) {
                function += coefData[i] + "x^" + expData[i];
            } else {
                function += coefData[i] + "x^" + expData[i] + " + ";
            }
        }
        System.out.println("Your polynomial function is:" + function);
        System.out.println("Your polynomial at x = " + x + " is: f(" + x + ") = " + sum);
    }
}
