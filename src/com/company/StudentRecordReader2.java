package com.company;
import java.util.Scanner;

public class StudentRecordReader2 {

    public static void main(String[] args) {
        String fname, lname, status;
        double gpa;
        int hours;


        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Student's First Name? " );
        fname = keyboard.next();

        System.out.print( "Student's Last Name? " );
        lname = keyboard.next();

        System.out.print( "Student's GPA? " );
        gpa = keyboard.nextDouble();

        System.out.print( "Student's Current Course Load?" );
        hours = keyboard.nextInt();

        if (hours >= 12)
        {
            System.out.println("\nStudent Name :" + fname + " " + lname);
            System.out.println("Student Course Hours :" + hours);
            System.out.println("Student GPA :" + gpa);
            System.out.println("This student is in good standing and has 12 or more credit hours.");
        }
    }
}