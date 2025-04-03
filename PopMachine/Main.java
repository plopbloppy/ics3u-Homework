import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        PopMachine pop = new PopMachine(100, 10.0, 1.5);
        
        System.out.println("Please enter your money for soda:");
        double money = keyboard.nextDouble();

        pop.coinSlot(money);
        pop.popButton(money);
        
        System.out.println("Your change is $" + pop.coinReturn());
    }
}
