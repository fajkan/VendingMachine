package se.lexicon;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        boolean isActive = true;
        User currentUser = new User();
        String choice;
        Scanner sc = new Scanner(System.in);
        int tempNo;

        Sweets[] availableSweets = new Sweets[30];
        Food[] availableFood = new Food[30];
        Drinks[] availableDrinks = new Drinks[30];

        for (int i = 0; i < 5; i++) {
            availableDrinks[i] = new Drinks(11, "Cola", 15, 300, 33);
            availableFood[i] = new Food(31, "Ham Sandwich", 25, 120.0, 90);
            availableSweets[i] = new Sweets(51, "Snickers", 11, 85, "Chocolate Bar with peanuts");
        }
        for (int i = 5; i < 10; i++) {
            availableDrinks[i] = new Drinks(12, "Orange soda", 15, 270, 33);
            availableFood[i] = new Food(32, "Cheese Sandwich", 20, 100, 85);
            availableSweets[i] = new Sweets(52, "Marabou", 18, 140, "Chocolate bar");
        }
        for (int i = 10; i < 15; i++) {
            availableDrinks[i] = new Drinks(13, "Sprite", 15, 240, 33);
            availableFood[i] = new Food(33, "Chicken Salad", 45, 400, 150);
            availableSweets[i] = new Sweets(53, "Jelly beans", 20, 175, "Bag of Jelly beans");
        }
        for (int i = 15; i < 20; i++) {
            availableDrinks[i] = new Drinks(21, "Carbonated Water", 10, 40, 50);
            availableFood[i] = new Food(41, "Canned Soup", 30, 210, 110);
            availableSweets[i] = new Sweets(61, "Protein bar", 25, 200, "Power bar");
        }
        for (int i = 20; i < 25; i++) {
            availableDrinks[i] = new Drinks(22, "Still Water", 8, 0, 50);
            availableFood[i] = new Food(42, "Instant noodles cup", 30, 130, 80);
            availableSweets[i] = new Sweets(62, "Mentos", 10, 60, "Mint pastilles");
        }
        for (int i = 25; i < 30; i++) {
            availableDrinks[i] = new Drinks(23, "Red Bull", 16, 90, 25);
            availableFood[i] = new Food(43, "Dried Jerky", 45, 130, 140);
            availableSweets[i] = new Sweets(63, "Gott o Blandat", 20, 200, "Jellies and liqourice");
        }

        System.out.println("---- Welcome to this Vending Machine ----");

        while (isActive == true) {

            System.out.println("\nMenu:\n");
            System.out.println("\nCurrent balance: " + currentUser.getBalance() + " kr");
            System.out.println("\nplease enter your desired choice:");
            System.out.println("\n1. Add money to your balance");
            System.out.println("\n2. Get a list of available products");
            System.out.println("\n3. Buy a product");
            System.out.println("\n4. End session");
            System.out.println("\n\nChoice: ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("\nHow much would you like to add to your current balance?\n");
                    currentUser.addCurrency(sc.nextInt());
                    break;
                case "2":
                    for (int i = 1; i < 30; i += 5) {
                        System.out.println("\n" + availableDrinks[i].getName() + "\n" + availableDrinks[i].getProdNumber() + "\n");
                        System.out.println("\n" + availableFood[i].getName() + "\n" + availableFood[i].getProdNumber() + "\n");
                        System.out.println("\n" + availableSweets[i].getName() + "\n" + availableSweets[i].getProdNumber() + "\n");
                    }
                    break;
                case "3":
                    System.out.println("\nPlease write the Product number of purchase: ");
                    tempNo = sc.nextInt();


                    for (int i = 29; i >= 0; i--) {
                        if (tempNo == availableDrinks[i].getProdNumber()) {
                            if(currentUser.getBalance() >= availableDrinks[i].getPrice()){
                                System.out.println("\nEnjoy your " + availableDrinks[i].getName());
                                currentUser.removeCurrency((int) availableDrinks[i].getPrice());
                                availableDrinks[i] = null;
                                break;
                            } else{
                                System.out.println("\nNot enough money");
                                break;
                            }

                        } else if (tempNo == availableFood[i].getProdNumber()) {
                            if(currentUser.getBalance() >= availableFood[i].getPrice()){
                                System.out.println("\nEnjoy your " + availableFood[i].getName());
                                currentUser.removeCurrency((int) availableFood[i].getPrice());
                                availableFood[i] = null;
                                break;
                            } else{
                                System.out.println("\nNot enough money");
                                break;
                            }

                        } else if(tempNo == availableSweets[i].getProdNumber()){

                            if(currentUser.getBalance() >= availableSweets[i].getPrice()){
                                System.out.println("\nEnjoy your " + availableSweets[i].getName());
                                currentUser.removeCurrency((int) availableSweets[i].getPrice());
                                availableSweets[i] = null;
                                break;
                            } else{
                                System.out.println("\nNot enough money");
                                break;
                            }

                        }


                    }
                case "4":
                    System.out.println("\nThanks for using Armins Vending Machine!");
                    System.exit(currentUser.endSession());
                    break;
                default:
                    System.out.println("\nWrong number has been entered. Please try again");

            }


        }
    }
}
