package se.lexicon;

abstract class Consumables {
    private int prodNumber;
    private String name;
    private int price;
    private double calories;



    public Consumables() {
    }

    public Consumables(int productNumber, String name, int price, double calories){
        this.prodNumber=productNumber;
        this.name=name;
        this.price=price;
        this.calories=calories;
    }

    public String examine(){
    return "A " + this.name + "\nCost: " + this.price + "\nCalories: " + this.calories;
    }

    public String use(){
        return "Enjoy the " +name+"!";
    }

    public String getName() {
        return name;
    }

    public int getProdNumber() {
        return prodNumber;
    }

    public void setProdNumber(int prodNumber) {
        this.prodNumber = prodNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "A " + this.name + "\nCost: " + this.price + "\nCalories: " + this.calories;
    }
}
