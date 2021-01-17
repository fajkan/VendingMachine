package se.lexicon;

public interface Vending {




    void addCurrency(int amount);
    void removeCurrency(int amount);
    Consumables request(int productNumber);
    int endSession();
    String getDescription(int productNumber);
    int getBalance();
    String[] getProducts();


}
