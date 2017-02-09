package com.belhard.practice;

import com.belhard.practice.candies.Chocolate;
import com.belhard.practice.candies.Cookies;
import com.belhard.practice.candies.Marshmallow;
import com.belhard.practice.candies.Production;

import java.util.ArrayList;


public class Gift {
    public static void getGift() {
        Gift gift = new Gift();
        ArrayList<Production> list = gift.setGift();
        gift.showGift(list);
        double sum = gift.getTotalCost(list);
        System.out.println("\n Total cost of all items is: " + sum + "\n");
        int heft = gift.getTotalWeight(list);
        System.out.println("\n Total weight of all items is: " + heft + "\n");


    }


    public ArrayList<Production> setGift() {
        ArrayList<Production> list = new ArrayList<Production>();
        Chocolate chocolateOne = new Chocolate("Mars", "Chocolate", 0.99, 50);
        Chocolate chocolateTwo = new Chocolate("Snickers", "Chocolate", 1.55, 95);
        Cookies cookiesOne = new Cookies("Mulinelli", "Cookies", 1.95, 300);
        Cookies cookiesTwo = new Cookies("Bonomi", "Cookies", 7.99, 500);
        Marshmallow marshmallowOne = new Marshmallow("Zefirelle", "Marshmallow", 1.95, 230);
        list.add(chocolateOne);
        list.add(chocolateTwo);
        list.add(cookiesOne);
        list.add(cookiesTwo);
        list.add(marshmallowOne);

        return list;
    }

    private void showGift(ArrayList<Production> list) {

        System.out.println(" Here is a new year's gift!!!");
        int i = 1;
        System.out.println("ID: " + " NAME:    " + "  TYPE: " + "   COST:  " + "  WEIGHT:");
        for (Production value : list) {

            System.out.println(i + ".   " + value.getName() + "    " + value.getType() + "       " + value.getCost()
                    + "     " + value.getWeight());
            i++;
        }

    }


    public double getTotalCost(ArrayList<Production> list) {
        double sum = 0;
        for (Production value : list) {
            sum += value.getCost();
        }
        return sum;

    }

    private int getTotalWeight(ArrayList<Production> list) {
        int heft = 0;
        for (Production value : list) {
            heft += value.getWeight();
        }
        return heft;
    }
}
