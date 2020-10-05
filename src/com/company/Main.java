package com.company;

public class Main {

    /**
     * Print all the values of the Tab
     * Don't have return, it's a Void function
     *
     * @param scores a Tab of integer
     */
    public static void printTab(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }

    /**
     * Return the biggest value of the Tab
     *
     * @param scores a Tab of integer
     * @return The value of the biggest number (int)
     */
    public static int returnBiggestValue(int[] scores) {
        int biggest = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > biggest) {
                biggest = scores[i];
            }
        }
        return biggest;
    }

    /**
     * Return true if have a number smaller than 10 in the Tab
     * Else the function return false
     *
     * @param scores a Tab of integer
     * @return Boolean true or false
     */
    public static boolean returnTrueIfNumberInf10(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 10) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] scores = new int[7];
        scores[0] = 19;
        scores[1] = 11;
        scores[2] = 16;
        scores[3] = 20;
        scores[4] = 9;
        scores[5] = 6;
        scores[6] = 10;

        int moyenne = 0;
        for (int x = 0; x < scores.length; x++) {
            //System.out.println(scores[x]);
            moyenne = moyenne + scores[x];
        }
        //System.out.println("Moyenne : " + (moyenne / scores.length));

        System.out.println(returnTrueIfNumberInf10(scores));
    }
}
