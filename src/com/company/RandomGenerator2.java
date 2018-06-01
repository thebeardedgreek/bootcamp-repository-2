package com.company;

import java.util.Random;

public class RandomGenerator2{
    public static void main(String[] args)
    {
        System.out.println("Generate 10 random integers between 1 and 6");

        Random rnd = new Random();

        for (int i = 1; i <= 10; ++i)
        {
            int randomInt = 5 + rnd.nextInt(95);
            System.out.println("Generated number: " + randomInt);
        }

        System.out.println("Done.");
    }
}