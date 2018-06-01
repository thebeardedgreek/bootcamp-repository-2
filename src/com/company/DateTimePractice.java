package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.io.FileDescriptor.out;

public class DateTimePractice {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String currentDate = "";
    //Get the current time
    LocalDateTime rightNow= LocalDateTime.now();
    //Date from the user
    LocalDate userDate=null;
    Boolean correctInput = true;

    //Set up formatters so that you can use them later
    DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter practiceFormat1 = DateTimeFormatter.ofPattern("MMM yyyy");
    DateTimeFormatter practiceFormat2 = DateTimeFormatter.ofPattern("MMMM, dd yyyy");
    DateTimeFormatter practiceFormat3 = DateTimeFormatter.ofPattern("dd, MM yyyy");

    System.out.println("The current date in day, Month (3 letters) and year (4 digit) format: " +
            rightNow.format(practiceFormat1));
    System.out.println("The current date in Month (3 letters), day  and year (4 digit) format: " +
            rightNow.format(practiceFormat2));
    System.out.println("The current date in day, month (2 digits) and year format: " +
            rightNow.format(practiceFormat3));

    System.out.println("Now enter a date in (dd/MM/yyyy) format: ");
    String thisDate = keyboard.nextLine();
    currentDate = rightNow.format(dTF);

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    sdf.setLenient(false);

    try {
        Date date = sdf.parse(thisDate);
    } catch(ParseException e) {
        correctInput = false;
        System.out.println("Invalid entry.");
        }

    while(!correctInput){
        System.out.println("Please enter a date in (dd/MM/yyyy) format: ");
        thisDate = keyboard.nextLine();
        try {
            Date date = sdf.parse(thisDate);
            correctInput = true;
        } catch(ParseException e) {
            correctInput = false;
            System.out.println("Invalid entry.");
        }
    }

    while(currentDate.compareTo(thisDate) < 0) {
        System.out.println("That date is after the current one :(." +
                "\nPlease enter a date in (dd/MM/yyyy) format: ");
        thisDate = keyboard.nextLine();
        userDate = LocalDate.parse(thisDate, dTF);
    }
    if (thisDate.equals(currentDate)) {
        System.out.println("Very good, that's the current date.");
    } else System.out.println("Very good, that date is before today.");
    }
}
