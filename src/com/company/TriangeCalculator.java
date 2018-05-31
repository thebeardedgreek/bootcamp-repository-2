package com.company;
import java.util.Scanner;

public class TriangeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the first side of the triange: ");
        double firstSide = scan.nextDouble();
        System.out.println("Please enter the length of the second side of the triange: ");
        double secondSide = scan.nextDouble();
        System.out.println("Please enter the length of the third side of the triange: ");
        double thirdSide = scan.nextDouble();
        if(firstSide == secondSide && firstSide == thirdSide){
            System.out.println("The triangle is equilateral!");
        } else if( ((firstSide * firstSide) + (secondSide * secondSide)) == (thirdSide*thirdSide) ||
                ((firstSide * firstSide) + (thirdSide * thirdSide)) == (secondSide*secondSide) ||
                ((secondSide * secondSide) + (thirdSide * thirdSide)) == (firstSide*firstSide)) {
            System.out.println("The triangle is a right triangle!");
        }
    }
}
