package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieArrayList {
    public static void main(String[] args) throws Exception {
        ArrayList<String> movieList = new ArrayList<String>();
        String currentChoice = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Welcome! Please enter the title(s) of your favorite movie(s)!"
        + "\nWhen you are finished, enter 'Q' to exit. A list of your entries will then "
        + "be displayed.\n\n");
        while(!currentChoice.equals("q") && !currentChoice.equals("Q")){
            System.out.print("Please enter a movie title: \n");
            currentChoice = keyboard.nextLine();
            movieList.add(currentChoice);
        }
        System.out.println("Here are the movies you listed: ");
        for (String n : movieList ){
            System.out.println(n);
        }
        System.out.println("Thank you!");
    }
}