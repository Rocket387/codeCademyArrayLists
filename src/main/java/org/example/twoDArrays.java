package org.example;

public class twoDArrays {

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
    }
}
