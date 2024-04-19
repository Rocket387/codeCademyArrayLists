package org.example;

public class ArraysAndTwoDArrays {

    public static void reverseGroceries(String[] groceryList5) {
        int j = groceryList5.length - 1;
        for (int i = 0; i < groceryList5.length/2; i++) {
            String temp = groceryList5[i];
            groceryList5[i] = groceryList5[j];
            groceryList5[j] = temp;
            j--;
        }
    }

    public static boolean hasDuplicates(String[] groceryList4) {
        for (int i = 0; i < groceryList4.length - 1; i++) {
            for (int j = i + 1; j < groceryList4.length; j++) {
                if (groceryList4[i].equals(groceryList4[j])) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isAlphabetized(String[] groceryList3) {
        if (groceryList3.length > 1) {
            String lastGroceryItem = groceryList3[0];

            for (int i = 1; i < groceryList3.length; i++) {
                if (lastGroceryItem.compareTo(groceryList3[i]) > 0) {
                    return false;
                }

                lastGroceryItem = groceryList3[i];
            }
        }

        return true;
    }

    public static boolean hasSpecialItem(double[] groceryPrices) {

        for (double itemCost : groceryPrices) {
            String itemCostStr = String.valueOf(itemCost);
            if (itemCostStr.endsWith("99")) {
                return true;
            }
        }

        //same as above
        /*for (double itemCost : groceryPrices) {
            String itemCostStr = String.valueOf(itemCost);
            if (itemCostStr.length() > 1 && itemCostStr.substring(itemCostStr.length() - 2, itemCostStr.length()).equals("99")) {
                return true;
            }
        }*/
        return false;
    }

    public static int getNumAllergicItems(String[] groceryList) {
        int numAllergicItems = 0;

        for (String s : groceryList) {
            if (s.length() > 5) {
                numAllergicItems++;
            }
        }

        //same as enhanced for loop above
        /*for (int i = 0; i < groceryList.length; i++) {
            if (groceryList[i].length() > 5) {
                numAllergicItems++;
            }
        }*/
        return numAllergicItems;
    }

    public static double getMostExpensiveItemCost(double[] groceryPrices2) {
        // We can set the maxCost initially to the first item without an IndexOutOfBounds error because we can assume there is at least one item in the array.
        double maxCost = groceryPrices2[0];
        for (double itemCost : groceryPrices2) {
            if (maxCost < itemCost) {
                maxCost = itemCost;
            }
        }

        //same as enhanced for loop above
        /*for(int i=0; i<groceryPrices2.length; i++)
        {
            if(maxCost < groceryPrices2[i])
            {
                maxCost = groceryPrices2[i];
            }
        }
        }*/
        return maxCost;
    }
    public static double getTotalCost(double[] groceryPrices) {
        double totalCost = 0.0;
        for(Double price : groceryPrices) {
            totalCost+=price;
        }
        return totalCost;
    }

    public static void main(String[] args) {
        int[][] nums = {{10, 9, 8}, {7, 6, 5}, {4, 3, 2}};
        System.out.println(nums[0][1]); // Prints: 9

        char[][] letters = {{'A', 'a'}, {'B', 'x'}, {'C', 'c'}};
        // Update the value:
        letters[1][1] = 'b';
        System.out.println(letters[1][1]);


        int[][] intArray = new int[2][3];

        intArray[0][0] = 1;
        intArray[0][1] = 2;
        intArray[0][2] = 4;
        intArray[1][0] = 1;
        intArray[1][1] = 3;
        intArray[1][2] = 6;

        System.out.println(intArray[1][2]);

        double[] groceryPrices = {10.0, 12.3, 8.45, 2.43};
        System.out.println(getTotalCost(groceryPrices));

        double[] unlikelyGroceryPrices = {100.23, -100.23, 0.0, -78.54};
        System.out.println(getTotalCost(unlikelyGroceryPrices));

        double[] groceryPrices2 = {10.0, 12.3, 8.45, 2.34};
        System.out.println(getMostExpensiveItemCost(groceryPrices2));

        String[] groceryList = {"apple", "milk", "banana", "bananas", "chocolate"};
        System.out.println(getNumAllergicItems(groceryList));

        double[] groceryList1 = {10.0, 89.9, 8.99, 2.34};
        System.out.println(hasSpecialItem(groceryList1));

        String[] groceryList3 = {"apples", "banana", "bananas", "chocolate"};
        System.out.println(isAlphabetized(groceryList3));

        String[] groceryList4 = {"apples", "banana", "Apples", "chocolate"};
        System.out.println(hasDuplicates(groceryList4));

        String[] groceryList5 = {"apples", "banana", "Apples", "chocolate"};
        reverseGroceries(groceryList5);

        for (String item : groceryList5) {
            System.out.println(item);
        }
    }
}
