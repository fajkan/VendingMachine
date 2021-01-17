package se.lexicon;


public class User implements Vending{

    int userBalance;

    public User() {
        this.userBalance = 0;
    }

    @Override
    public void addCurrency(int amount) {
        this.userBalance+=amount;
    }

    @Override
    public void removeCurrency(int amount) {
        this.userBalance-=amount;
    }

    @Override
    public Consumables request(int productNumber) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        return null;
    }

    @Override
    public int getBalance() {
        return userBalance;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
