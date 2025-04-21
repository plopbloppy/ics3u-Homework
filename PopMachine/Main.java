public class Main {
    
    public static void main(String[] args) {
        PopMachine pop = new PopMachine(100, 10.0, 1.75);

        pop.popButton(1.5);
        System.out.println("Your change is $" + pop.coinReturn());
    }
}