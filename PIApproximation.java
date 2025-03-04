
import java.util.Scanner;

public class PIApproximation {
    public static void main(String[] args) throws Exception {
        char input = 'y';
        while (input == 'y') {
            Scanner keyboard = new Scanner(System.in);

            if (input == 'y') {
                System.out.println("Please enter the n value:");
                double n = keyboard.nextDouble();
                keyboard.close();
                for (int i = 0; i < n + 1; i++) {
                    double sum = 0;
                    sum += (Math.pow(-1, i)) / (2 * i + 1);
                    if (i >= n) {
                        System.out.println("The value of pi is: " + 4 * sum + ".");
                        System.out.println("Would you like to try again? [y/n]");
                        input = Character.toLowerCase(keyboard.next().charAt(0));
                    }
                }
            }
        }
    }
}
