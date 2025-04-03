public class PopMachine {
    private int numberOfPop;
    private double amountOfMoney;
    private double priceOfPop;
    private double change;

    public PopMachine(int numberOfPop, double amountOfMoney, double priceOfPop) {
        this.numberOfPop = numberOfPop;
        this.amountOfMoney = amountOfMoney;
        this.priceOfPop = priceOfPop;
    }

    public PopMachine(int numberOfPop) {
        this(numberOfPop, 90.0, 1.5);
    }

    public void coinSlot(double money) {
        change = money - priceOfPop;
        amountOfMoney += money;
    }

    public void popButton(double money) {
        if (money >= priceOfPop) {
            if (numberOfPop >= 1) {
                numberOfPop--;
            } else {
                System.out.println("Sold out");
            }
        } else {
            System.out.println("Not enough money!");
            System.exit(1);
        }
    }

    public double coinReturn() {
        amountOfMoney -= change;
        return change;
    }
}
