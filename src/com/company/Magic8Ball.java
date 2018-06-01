package com.company;
import java.util.Scanner;
import java.util.Random;

public class Magic8Ball{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner eightBall = new Scanner(System.in);
        String question, keepGoing = "Y";
        Random rnd = new Random();
        int randomInt = rnd.nextInt(19);
        String[] answers = {"It is certain.", "It is decidedly so.", "Without a doubt.", "Yes definitely.",
                "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.",
            "Reply hazy try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.",
            "Concentrate and ask again.", "Don't count on it.",  "My reply is no.",  "My sources say no.",  "Outlook not so good.",
            "Very doubtful."};

        System.out.print("Welcome to the...\n\n"+
        "  __  __                _             ___               ____          _  _    _ \n" +
                " |  \\/  |              (_)           / _ \\             |  _ \\        | || |  | |\n" +
                " | \\  / |  __ _   __ _  _   ___     | (_) |   ______   | |_) |  __ _ | || |  | |\n" +
                " | |\\/| | / _` | / _` || | / __|     > _ <   |______|  |  _ <  / _` || || |  | |\n" +
                " | |  | || (_| || (_| || || (__     | (_) |            | |_) || (_| || || |  |_|\n" +
                " |_|  |_| \\__,_| \\__, ||_| \\___|     \\___/             |____/  \\__,_||_||_|  (_)\n" +
                "                  __/ |                                                         \n" +
                "                 |___/      ");

        System.out.print("Ask me a question!\n\n");
        question = keyboard.nextLine();

        while(keepGoing.equals("Y") || keepGoing.equals("y")){
            System.out.print("YOU ASKED: " + question + "\nMAGIC 8-BALL SAYS: \n\n" +
                    "        ###        \n" +
                    "    &@@@@@@@@@@,   \n" +
                    "  &@@@@@..,@@@@@@  \n" +
                    " @@@@@..@8@.,@@@@@  ______ " + answers[randomInt] +
                    "\n/@@@@@..&8@..@@@@@\n" +
                    "(@@@@@@,....@@@@@@\n" +
                    " @@@@@@@@@@@@@@@@% \n" +
                    "  #@@@@@@@@@@@@@%  \n" +
                    "    #&@@@@@@@@%*    "
                    );
            System.out.println("\n\nAsk another question?\n(Y or N)\n\n");
            keepGoing = keyboard.next();
            randomInt = rnd.nextInt(19);
            if(keepGoing.equals("Y") || keepGoing.equals("y")){
                System.out.println("What is your next question?");
                question = eightBall.nextLine();
            }
        }
        System.out.println("\nThank you for playing!\n\n" +
        "   _____                    _   _                   _ \n" +
        "  / ____|                  | | | |                 | |\n" +
        " | |  __   ___    ___    __| | | |__   _   _   ___ | |\n" +
        " | | |_ | / _ \\  / _ \\  / _` | | '_ \\ | | | | / _ \\| |\n" +
        " | |__| || (_) || (_) || (_| | | |_) || |_| ||  __/|_|\n" +
        "  \\_____| \\___/  \\___/  \\__,_| |_.__/  \\__, | \\___|(_)\n" +
        "                                        __/ |         \n" +
        "                                       |___/        ");

    }
}