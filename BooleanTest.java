import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an A value:");
        boolean a = keyboard.nextBoolean();
        System.out.println("Please enter a B value:");
        boolean b = keyboard.nextBoolean();
        System.out.println("Please enter a C value:");
        boolean c = keyboard.nextBoolean();
        System.out.println("Please enter a D value:");
        boolean d = keyboard.nextBoolean();
        keyboard.close();
        
        boolean branchOne = a && b || c && d;
        boolean branchTwo = c && a || a && d;
        boolean branchThree = b && d || b && c;
        System.out.println("The value of the output is: " + ((branchOne || branchTwo) || (branchTwo || branchThree)));
    }
}