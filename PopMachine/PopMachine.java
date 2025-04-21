public class PopMachine {

    private int numberOfPop;
    private double amountOfMoney;
    private double priceOfPop;
    private double moneyEntered;

    public PopMachine(int numberOfPop, double amountOfMoney, double priceOfPop) {
        this.numberOfPop = numberOfPop;
        this.amountOfMoney = amountOfMoney;
        this.priceOfPop = priceOfPop;
        this.moneyEntered = 0.0;
    }

    public PopMachine(int numberOfPop) {
        this(numberOfPop, 90.0, 1.75);
    }

    public void coinSlot(double money) {
        moneyEntered += money;
    }

    public double popButton(double money) {
        if (moneyEntered >= priceOfPop) {
            if (numberOfPop >= 1) {
                numberOfPop--;
                amountOfMoney += priceOfPop;
                double change = moneyEntered - priceOfPop;
                moneyEntered = 0.0;
                return change;
            } else {
                System.out.println("Sold out");
                return moneyEntered;
            }
        } else {
            System.out.println("Not enough money!");
            return 0.0;
        }
    }

    public double coinReturn() {
        return moneyEntered;
    }
}