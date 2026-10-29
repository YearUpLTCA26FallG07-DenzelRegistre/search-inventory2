package com.pluralsight;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Items> inventory = new ArrayList<Items>();
        inventory.add(new Items(2245,"Spray bottle", 2.00));
        inventory.add(new Items(2683,"Shampoo", 9.35));
        inventory.add(new Items(2684,"Conditioner", 9.35));
        inventory.add(new Items(2467,"Hair Spray", 7.00));
        inventory.add(new Items(2984,"Soap", 4.45));

        

        ArrayList<Items> inventory = getInventory();
            for (int i = 0; i < inventory.size(); i++){
                Items p = inventory.get(i);
                System.out.printf("id: %d %s - Price: $%.2f%n",
                    p.getUpc(), p.getName(), p.getPrice());
            }



    }

    private static ArrayList<Items> getInventory() {
        ArrayList<Items> inventory = new ArrayList<Items>();



        return inventory;
    }
}