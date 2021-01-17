package se.lexicon;

public class Drinks extends Consumables{

    private int volume;

    public Drinks(int id,String name, int cost, double calories, int cl){
        super(id,name,cost,calories);
        this.volume = cl;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVolume: " + volume +"cl";
    }
}
