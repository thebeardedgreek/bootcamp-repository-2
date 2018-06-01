package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RainfallCount { public static void main( String[] args ) {

    int roofLength;
    int roofWidth;
    int roofLengthInch;
    int roofWidthInch;
    int rainfall;
    double totalRain;

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the length of the roof (in feet): ");
    roofLength = keyboard.nextInt();
    System.out.println("Enter the width of the roof (in feet): ");
    roofWidth = keyboard.nextInt();
    System.out.println("Enter the amount of rainfall (in inches): ");
    rainfall = keyboard.nextInt();

    roofLengthInch = roofLength * 12;
    roofWidthInch = roofWidth * 12;
    totalRain = roofLengthInch * roofWidthInch * rainfall;
    totalRain = totalRain / 231;
    DecimalFormat f = new DecimalFormat("##.00");


    System.out.println("The total amount of rainfall is " + f.format(totalRain));

}
}
