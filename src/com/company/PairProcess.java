package com.company;
import java.util.Scanner;

public class PairProcess {
    public static void main(String[] args) {
        int num1, num2, sum, product;
        double average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "First Number? : " );
        num1 = keyboard.nextInt();

        System.out.print( "Last Number?  : " );
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        product = num1 * num2;
        average = (num1 + num2) / 2;
        if(sum < 1000){
            if(sum > 200){
                System.out.println("The sum is: *~" + sum);
            } else System.out.println("The sum is: ~" + sum);
        } else {
            System.out.println("The sum is: " + sum);
        }
        System.out.println("The product is: " + product);
        System.out.println("The average is: " + average);

    }
}