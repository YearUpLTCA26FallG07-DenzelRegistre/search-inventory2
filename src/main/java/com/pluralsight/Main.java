package com.pluralsight;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String mainMenuText = """
                What do you want to do?
                1 - List all products
                2 - Lookup a product by its id
                3 - Find all products within a price range
                4 - Add a new product
                5 - Quit
                Enter your command:
                """;

        ArrayList<Items> inventory = getInventory();
        int choice;

        do {
            choice = Console.promptForInt(mainMenuText);

            switch (choice) {
                case 1 -> showListOfItems(inventory);
                case 2 -> showUpcOfItems(inventory);
                case 3 ->showProductsWithinPrice(inventory);
                case 4 ->addNewItem(inventory);
                case 5 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid command, please try again. ");
            }
        } while (choice != 5);



    }
    public static void addNewItem(ArrayList<Items> inventory ){
        int upc = Console.promptForInt("Enter the id: ");
        String name = Console.promptForString("Enter the name: ");
        double price = Console.promptForDouble("Enter the price: ");

        inventory.add(new Items(upc, name, price));
        System.out.println("Product added.");
    }

    public static void showListOfItems(ArrayList<Items> inventory ) {
        for (Items p : inventory) {
            System.out.printf("id: %d %s - Price: $%.2f %n",
                    p.getUpc(), p.getName(), p.getPrice());
        }
    }
    public static void  showProductsWithinPrice(ArrayList<Items> inventory){
        double min = Console.promptForDouble("Enter minimum price: ");
        double max = Console.promptForDouble("Enter maximum price; ");

        boolean found = false;
        for (Items p : inventory) {
            if (p.getPrice() >= min && p.getPrice() <= max) {
                System.out.printf("id: %d %s - Price: $%.2f%n",
                        p.getUpc(), p.getName(), p.getPrice());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products in that price range.");
        }
    }
    public static void showUpcOfItems(ArrayList<Items> inventory){
        for (int i = 0; i < inventory.size(); i++){
            Items p = inventory.get(i);
            System.out.printf("id: %d %s",
                    p.getUpc(), p.getName());
        }



    }
    private static ArrayList<Items> getInventory() {
        ArrayList<Items> inventory = new ArrayList<Items>();
        inventory.add(new Items(2245,"Spray bottle", 2.00));
        inventory.add(new Items(2683,"Shampoo", 9.35));
        inventory.add(new Items(2684,"Conditioner", 9.35));
        inventory.add(new Items(2467,"Hair Spray", 7.00));
        inventory.add(new Items(2984,"Soap", 4.45));
        return inventory;
    }



}