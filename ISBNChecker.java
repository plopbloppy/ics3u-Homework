import java.util.Scanner;

public class ISBNChecker {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your ISBN number:");
        String isbn = keyboard.nextLine();
        int sum = 0;
        keyboard.close();

        if (isbn.length() != 13) {
            System.out.println("ISBN number must be 13 digits!");
        } else {
            for (int i = 0; i < isbn.length(); i ++) {
                int digit = Character.getNumericValue(isbn.charAt(i));

                if (!Character.isDigit(isbn.charAt(i))) {
                    System.out.println("ISBN number must contain only digits!");
                    System.exit(1);
                }
            sum += i % 2 == 0 ? digit * 3 : digit;
            }
            System.out.println("Your ISBN number is valid: " + (sum % 10 == 0));
        }
        
    }
}