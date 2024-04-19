package org.example;

public class iterateTwoDArrays {

    public static void main(String[] args) {

        //row-major order
        //
        //The outer loop will iterate from 0 to the length of the 2D array minus 1.
        //The nested loop will iterate from 0 to the length of one of the nested arrays minus 1.
        char[][] letters = {{'A', 'a'}, {'B', 'b'}, {'C', 'c'}};

        for (char[] letter : letters) {
            for (int j = 0; j < letters[0].length; j++) {
                System.out.print(letter[j]);
            }
        }

        //the above is the same as
        /*for(int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[0].length; j++) {
                System.out.print(letters[i][j]);
            }
        }*/
    }

}
