import java.util.Scanner;

import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter all coefficients, each separated by a space:");
        String coeffInput = keyboard.nextLine();
        StringTokenizer coefficients = new StringTokenizer(coeffInput);

        while (coefficients.hasMoreTokens()) {
            String[] coefficient = new String[coefficients.countTokens()];
            for (int i = 0; i < coefficients.countTokens(); i++) {
                System.out.println(coefficient[i]);
            }
        }
        
            
    }
}
