package com.company;

public class Main {



    public static void main(String[] args) {

        int [] scores = new int[7];
        scores[0] = 19;
        scores[1] = 11;
        scores[2] = 16;
        scores[3] = 20;
        scores[4] = 9;
        scores[5] = 6;
        scores[6] = 10;

        int moyenne = 0;
        for (int x = 0; x < scores.length; x++){
            moyenne = moyenne + scores[x];
        }
        System.out.println(moyenne / scores.length);
    }
}
