package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class MovieArrayList {
    public static void main(String[] args) throws Exception {
        String[] movieList = new String[20];
        String currentChoice = "";
        int index = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Welcome! Please enter the title(s) of your favorite movie(s)!"
        + "\nWhen you are finished, enter 'Q' to exit. A list of your entries will then "
        + "be displayed.\n\n");
        while(!currentChoice.equals("q") && !currentChoice.equals("Q")){
            System.out.print("Please enter a movie title: \n");
            currentChoice = keyboard.nextLine();
            for (int i = 0; i < movieList.length; i++){
                while (currentChoice.equals(movieList[i])){
                    System.out.print("Invalid: You have already entered this movie title!\n");
                    System.out.print("Please enter a movie title: \n");
                    currentChoice = keyboard.nextLine();
                }
            }
            movieList[index] = currentChoice;
            index++;
        }
        System.out.println("Here are the movies you listed: ");
        for (int n = 0; n < index-1 ; n++){
            System.out.println(movieList[n]);
        }
        System.out.println("\n\nThank you!");
    }
}