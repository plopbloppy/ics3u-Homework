import java.util.Scanner;

public class HelperMethods {
    public static void quadraticFormula(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        double firstRoot = (-b - (Math.sqrt(discriminant))) / (2 * a);
        double secondRoot = (-b + (Math.sqrt(discriminant))) / (2 * a);

        System.out.println("x = " + firstRoot + " and x = " + secondRoot + ".");
    }

    public static double piApproximation(int n1) {
        double sum = 0.0;

        for (int i = 0; i <= n1; i++) {
            sum += Math.pow(-1, i) / (2 * i + 1);
        }
        return 4 * sum;
    }

    public static void asymptoteFinder(int m, int n2) {
        if (m == n2) {
            System.out.println("The asymptote is horizontal.");
        } else if (n2 > m) {
            System.out.println("The asymptote is the x-axis.");
        } else {
            switch (m - n2) {
                case 1:
                    System.out.println("The asymptote is linear.");
                    break;
                case 2:
                    System.out.println("The asymptote is quadratic.");
                    break;
                case 3:
                    System.out.println("The asymptote is cubic.");
                    break;
                case 4:
                    System.out.println("The asymptote is quartic.");
                    break;
                case 5:
                    System.out.println("The asymptote is quintic.");
                    break;
                case 6:
                    System.out.println("The asymptote is sextic.");
                    break;
                case 7:
                    System.out.println("The asymptote is septic.");
                    break;
                case 8:
                    System.out.println("The asymptote is octic.");
                    break;
                case 9:
                    System.out.println("The asymptote is nonic.");
                    break;
                case 10:
                    System.out.println("The asymptote is decic.");
                    break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Please choose from the menu:");
            System.out.println("1. quadraticFormula");
            System.out.println("2. piApproximation");
            System.out.println("3. asymptoteFinder");
            System.out.println("4. exit");

            switch (keyboard.nextInt()) {
                case 1:
                    System.out.println("Please enter a value for a:");
                    double a = keyboard.nextDouble();
                    System.out.println("Please enter a value for b:");
                    double b = keyboard.nextDouble();
                    System.out.println("Please enter a value for c:");
                    double c = keyboard.nextDouble();
                    
                    quadraticFormula(a, b, c);
                    break;
                case 2:
                    System.out.println("Please enter an n value:");
                    int n1 = keyboard.nextInt();
                
                    System.out.println("Your pi approximation is: " + piApproximation(n1));
                    break;
                case 3:
                    System.out.println("Please enter an m value:");
                    int m = keyboard.nextInt();
                    System.out.println("Please enter an n value:");
                    int n2 = keyboard.nextInt();

                    asymptoteFinder(m, n2);
                    break;
                case 4:
                    keyboard.close();
                    System.exit(1);
            }
        }
    }
}
