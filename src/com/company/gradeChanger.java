package com.company;
import java.util.Scanner;

public class gradeChanger {
    public static void main(String[] args) {
        System.out.print("Enter your test score: ");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        char grade = 'F';//I'm not hopeful

        if (score > 89)
            grade = 'A';
        else if (score > 79)
            grade = 'B';
        else if (score > 59 && score < 70)
            grade = 'C';
        else
            grade = 'F';

        int endsWith = score%10;
        if (endsWith == 0 || endsWith == 2){
            String gradeDisplay = grade + "-";
            System.out.println("Your grade is " + gradeDisplay);
        } else if(endsWith == 7 || endsWith == 8 || endsWith == 9){
            String gradeDisplay = grade + "+";
            System.out.println("Your grade is " + gradeDisplay);
        } else if(endsWith == 3 || endsWith == 6){
            String gradeDisplay = "";
            System.out.println("Your grade is " + gradeDisplay);
        }
    }
}
