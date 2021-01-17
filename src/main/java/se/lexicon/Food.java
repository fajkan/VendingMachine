package se.lexicon;

public class Food extends Consumables{
    private int weight;

    public Food(int id,String name, int price, double calories, int weight) {
        super(id,name, price, calories);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWeight: " + weight +"g";
    }
}
