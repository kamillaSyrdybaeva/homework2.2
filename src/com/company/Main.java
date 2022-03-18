package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(kamilla(generateRandomAge(), 30));
        System.out.println(kamilla(20, -20));
        System.out.println(kamilla(24, 28));
        System.out.println(kamilla(38, 20));
        System.out.println(kamilla(22, -20));

    }

    public static String kamilla(int age, int temperature) {
        if (age > 20 && age < 34 && temperature > -20 && temperature < 30) {
            return ("You can go for a walk ");
        }

        if (age < 20 && temperature > 0 && temperature < 28) {
            return ("You can go for a walk");
        }
        if (age < 45 && temperature < -10 && temperature < 25) {
            return (" You can go for a walk");
        }

        return (" Stay at home");


    }

    public static int generateRandomAge() {
        Random rand = new Random();
        int i = 0;
        int b = 50;
        int age = i + (int) (Math.random()* b);
        return age;
    }
}






