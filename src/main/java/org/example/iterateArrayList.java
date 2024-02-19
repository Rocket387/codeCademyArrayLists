package org.example;

import java.util.ArrayList;

public class iterateArrayList {


    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        double total = 0;

        // Iterate over expenses
        for (int i = 0; i < expenses.size(); i++) {
            total += expenses.get(i); // gets the value of the current item in a list and adds it to total
        }


        System.out.println(total);

    }
}