package se.lexicon;

public class Sweets extends Consumables{
    private String typeOfSweets;

    public Sweets(int id,String name, int price, double calories, String typeOfSweets) {
        super(id,name, price, calories);
        this.typeOfSweets = typeOfSweets;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: " + typeOfSweets;
    }
}
