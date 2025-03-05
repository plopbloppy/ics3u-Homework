
import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1: enter 10 string values");
        System.out.println("2: display all string values");
        System.out.println("3: display one string value");
        System.out.println("4: exit");

        String[] input = new String[10];
        int menu = 0;
        
        while (true) { 
            switch (menu) {
                case 1:
                    System.out.println("Please enter 10 string values:");
                    for (int i = 0; i < input.length; i++) {
                        input[i] = keyboard.next();
                    }
                    break;
                case 2:
                    for (String array : input) {
                        System.out.println(array);
                    }
                    break;

                case 3:
                    System.out.println("Please enter a number between 1 and 10:");
                    System.out.println(input[keyboard.nextInt()]);
                    break;
                case 4:
                    keyboard.close();
                    System.exit(1);
            }
            System.out.println("Please select from the menu:");
            menu = keyboard.nextInt();
        }
    }
}