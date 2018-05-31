/*
 * PalindromeTester.java
 *
 * Tests a string as entered by the user
 * to see whether or not it is a palindrome or not.
 * A palindrome would be the same string forwards
 * as it is backwards.
 * Examples: Anna, civic and of, course:
 * A man a plan a canal Panama.
 */

//Tasso Stamboulis, 25

package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // The palindrome will be entered by the user at the keyboard
        Scanner in = new Scanner(System.in);

        System.out.println("Palindrome Checker");
        System.out.print("What phrase would you like to check? ");
        String userInput = in.nextLine();

        //remove all punctuation
        String replace1 = userInput.replace(',','\0');
        String replace2 = replace1.replace(':','\0');
        String replace3 = replace2.replace('!','\0');
        String noSpace = replace3.replace(' ' ,'\0');

        // Convert to lower case to simplify comparing strings
        String phrase = noSpace.toLowerCase();

        String backwards = "";

        // loop through the string backwards, starting with the last character
        for (int i = phrase.length() - 1; i >= 0; i--) {

            // Extract each letter as the next character
            // and build the backwards string
            String letter = phrase.substring(i, i + 1);
            backwards += letter;
            System.out.println(letter);
        }

        System.out.println(phrase);
        System.out.println(backwards);

        // A palindrome is a word or phrase that is the same forward or
        // backward. This is where we check that.
        if (phrase.equals(backwards)) {
            System.out.println(userInput + " is a palindrome!");
        } else {
            System.out.println(userInput + " is not a palindrome!");
        }

    }
}