package entities;

public class Bank {

    private int accountNum;
    private String name;
    private double value;

    public Bank(int accountNum, String name) {
        this.accountNum = accountNum;
        this.name = name;
    }

    public Bank(int accountNum, String name, double initialDeposit) {
        this.accountNum = accountNum;
        this.name = name;
        depositValue(initialDeposit);
    }

    public int getAccountNum() {
        return accountNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public double depositValue(double deposit){
        return this.value += deposit;
    }

    public double withdrawValue(double withdraw){
        return this.value -= withdraw + 5.0;
    }

    public String toString() {
        return "Account " + getAccountNum() +
               ", Holder: " + getName() + ", " +
               String.format(" Balance: $%.2f", getValue());
    }
}
