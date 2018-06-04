package com.company;

import java.net.URL;
import java.util.Scanner;
import java.util.Random;

public class MovieTitleGen
{
    public static void main(String[] args) throws Exception
    {

        String[] adjectives = arrayFromUrl("https://cs.leanderisd.org/txt/adjectives.txt");
        String[] nouns      = arrayFromUrl("https://cs.leanderisd.org/txt/nouns.txt");
        Random rnd = new Random();
        System.out.println("Myxyllplyk's Random Movie Title Generator\n");

        System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
        System.out.println("and " + nouns.length + " nouns (" + (adjectives.length*nouns.length) + " combinations).");
        int randomIntAdjective = rnd.nextInt(adjectives.length);
        int randomIntNoun = rnd.nextInt(nouns.length);

        String adjective = adjectives[randomIntAdjective];
        String noun = nouns[randomIntNoun];

        //capitalize first letter of each word
        String output1 = adjective.substring(0, 1).toUpperCase() + adjective.substring(1);
        String output2 = noun.substring(0, 1).toUpperCase() + noun.substring(1);

        System.out.println( "Your movie title is: " + output1 + " " + output2 + ".");
    }

    /**
     *	@param url - the URL to read words from
     *	@return An array of words, initialized from the given URL
     */
    public static String[] arrayFromUrl( String url ) throws Exception
    {
        Scanner fin = new Scanner((new URL(url)).openStream());
        int count = fin.nextInt();

        String[] words = new String[count];

        for ( int i=0; i<words.length; i++ )
        {
            words[i] = fin.next();
        }
        fin.close();

        return words;
    }

}