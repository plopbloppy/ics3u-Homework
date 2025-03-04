import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter a decimal:");
        System.out.println("Here is your integer: " + (int)keyboard.nextDouble());
        keyboard.close();
    }
}