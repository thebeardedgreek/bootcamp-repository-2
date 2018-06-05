package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ChooseYourOwnAdventure {

    public static void main(String[] args) throws Exception {
        Scanner player = new Scanner(System.in);
        Boolean onFirstQuestion = true, onSecondQuestion = true, onThirdQuestion = true, onFourthQuestion = true;
        String incorrectInput = "This is not a preset option. Please choose from the options given.";
        String gameOver = "  _______     _    _     ______                 ______     _   _     _____                    \n" +
                " |__   __|   | |  | |   |  ____|               |  ____|   | \\ | |   |  __ \\                   \n" +
                "    | |      | |__| |   | |__                  | |__      |  \\| |   | |  | |                  \n" +
                "    | |      |  __  |   |  __|                 |  __|     | . ` |   | |  | |                  \n" +
                "    | |      | |  | |   | |____                | |____    | |\\  |   | |__| |    _     _     _ \n" +
                "    |_|      |_|  |_|   |______|               |______|   |_| \\_|   |_____/    (_)   (_)   (_)\n" +
                "                                                                                              \n" +
                "                                                                                              ";

        String[] openingIntro = {"It's a warm sunny friday afternoon, and work/school have just let out.","You arrive home to find that your family is already in a rush, bustling about the house packing their things.",
                "You almost forgot, today is the day of your big trip to Grandma's!","Your mom comes to greet you at the door, and hands you your suitcase before rushing after your dog who somehow has the keys in his mouth..",
                "Would you like to go upstairs and begin packing, or go help your mom catch the dog?","Please answer by typing either, 'upstairs' or 'dog'"};
        String[] upstairsToPack = {"You decide that your mom can handle the dog by herself, and head on up the stairs to your room to pack.","You pull out a suitcase from the closet and pack the essentials; clothes, toothbrush, chargers, etc.",
                "Once everything is ready, as if on cue you hear your dad call up to you to ask if you are ready to leave.", "You lug your suitcase down the stairs and throw it in the trunk first so people can pile stuff on it (it's a tough suitcase).",
                "After falling asleep on the way there, you wake up to everyone getting out of the car to greet Grandma..","As you walk up to greet her, you notice that the window to the attic is boarded up now..\n..but before you can " +
                "get a good look your grandma pulls you into a warm embrace..","Do you ask about her boarded up attic, or wait to investigate on your own?","Please answer by typing either, 'now' or 'later'"};
        String[] chaseTheDog = {"You leap into action, sprinting after the dog with a fierce determination..","After an intense chase and wrestling match, you hand the keys to your mom..\n..(who then proceeds to turn off the alarm that was set off in the commotion).",
                "You triumphantly head on up the stairs to your room to pack.","You pull out a suitcase from the closet and pack the essentials; clothes, toothbrush, chargers, etc.",
                "Once everything is ready, as if on cue you hear your dad call up to you to ask if you are ready to leave.", "You lug your suitcase down the stairs and throw it in the trunk first so people can pile stuff on it (it's a tough suitcase).",
                "After falling asleep on the way there, you wake up to everyone getting out of the car to greet Grandma..","As you walk up to greet her, you notice that the window to the attic is boarded up now..\n..but before you can " +
                "get a good look your grandma pulls you into a warm embrace..","Do you ask about her boarded up attic, or wait to investigate on your own?","Please answer by typing either, 'now' or 'later'"};
        String[] askHerNow = {"Despite it possibly being taboo to ask about extreme home renovation, you ask your Grandma why she would board up the attic window..","She gives you a very strange look, and asks if you would like to see why..",
                "Nervously you look at your parents, but they've already made their way up to the door and are bringing in bags..","'Follow me sweety, I'd love to answer any questions in.. private' she says, and walks inside..",
                "Do you follow her, or help your parents unpack?","Please answer by typing either, 'follow' or 'unpack'"};
        String[] askHerLater = {"Despite the clearly strange new home decor, you ignore your curiousity and help your parents unpack everything.","After everything has been brought in, it's evening and your grandma has begun to cook her famous pasta.",
                "She could probably use a little help, but as you realize that you get a phone call from your friend.","Do you help her with the cooking, or answer your phone?", "Please answer by typing either, 'cooking' or 'phone'"};
        String[] atticWithGranny = {"You follow Grandma up to the entrance to the attic, and she backs up and asks if you can pull it down for her..","You reach up and pull down the attic, only to hear a click noise somewhere behind you where Grandma was standing..",
                "You suddenly hear a terrifyingly loud mixture of claws and hoofs scrambling towards the attic door. Before you can react the door bursts open and the last thing you see is claws and fangs.."};
        String[] unpackPhoneCooking = {"Something about Grandma's offer seems.... sinister. She doesn't seem quite like herself..", "You decide to help your family move in for the next week, which distracts you from the weird interaction with Grandma..",
                "After everything has been brought in, it's evening and your grandma has begun to cook her famous pasta.",
                "She could probably use a little help, but as you realize that you get a phone call from your friend.","Do you help her with the cooking, or answer your phone?", "Please answer by typing either, 'cooking' or 'phone'"};
        String[] chooseToPhone = {"You assume she can handle that pasta on her own, she's famous for it right? You pick up your phone and have a long chat with a close friend.",
                "Your conversation took longer than you realized, and when you come to the table everyone has already started eating.", "The pasta tastes different, but still delicious..",
                "Ten minutes into the dinner, two things happen simaltaneously..","Everyone at the table slowly stops talking..\n\n..and Grandma gets up and leaves without any word.","Within a minute everyone but you is clearly unconcious, and you feel near it..",
                "The last thing you hear before it all goes black is, 'theyre this way sweety..' followed by the thundering sound of hoofs and claws.."};
        String[] chooseToCook = {"You decide it would be a better use of your time helping her cook than talking on the phone, and walk over to offer help.","She seems surprised at first, but after a moment happily agrees and you both begin cooking..",
                "Once the table is set and the food is ready, everyone chows down and the family catches up with Grandma.","We were all very surprised to hear her relaxed attitude towards losing Grandpa, she didn't even seem like she knew he left..",
                "After dinner, you lie awake in bed satisfied from the food but confused at your Grandma's behavior..","As you lie there, you hear noises from in the attic..","At first you thought you imagined it, but it's definitely there..\n\n..a slight scratching noise..",
                "Go investigate the attic, or stay in your room?","Please answer by typing either, 'stay' or 'investigate'"};
        String[] atticWithoutGranny = {"You creep up to the entrance to the attic, and slowly pull down the drawstring to lower the stairs..","It slides down easily and silently, which is the opposite of what an old unused attic should..",
                "However, you notice as you finish lowering it and begin to climb that the scratching stopped at some point..","You stick your head in the opening, and gasp..","There's more boarding on this side, it looks like..\n\n\n..a cage..",
                "'What is Grandma.. keeping in here?' you whisper outloud..","You inch back down the ladder and turn to barely see your Grandma swing a bat before it all goes black.."};
        String[] winner = {"Something about all of this seems very strange; the boarding up the attic, the way she has acted like Grandpa is basically still alive.. ","The more you think about this, the more you feel something wrong.. almost menacing..",
                "You decide to stay in your room, but you get up and go to the door to listen..","The scratching has become louder now, and it sounds.. big..\n..and you're not sure about this, but you think you can hear.. hooves?",
                "Suddenly you hear a commotion outside your room and you open the door to see Grandma standing in the hallway, rigid..","You see a bat in her hand, and as you notice your mom lying on the ground you notice the bat is dripping..",
                "Everything clicks at once, and your rage and survival instincts kick in and you walk out and slam the door.","Your Grandma turns to face you, but she's not quick enough and you slam into her arm and knock the bat out of her hand..",
                "Your dad has Grandma in a headlock as you look down to see your mom is hurt but breathing..","All of a sudden, Grandama screams 'HELP ME DEAR!'..\n..there's a huge BANG and a huge commtion upstairs that seems to move across the floor..",
                "And then, as suddenly as it stops, it ceases..","This time Grandma is shocked, and she seems both scared and angry..","I look up the stairs as my dad carries me out to see the attic door fall open, and it's face.. his face.. burst into flames..",
                "...","They said in the news that it was a horse she had kept locked in there, that she fed our Grandfather to..","But..","I've never seen a horse burst into flames"};

        //introduction
        System.out.print("WELCOME TO TASSO STAMBOULIS' CHOOSE YOUR OWN ADVENTURE GAME..\n\n"
        +"  _______   _                            _                                                _     _       _                         _                 _     _                    \n" +
                " |__   __| | |                          ( )                                              | |   | |     (_)                       (_)               | |   | |                   \n" +
                "    | |    | |__     ___   _ __    ___  |/   ___         ___    ___    _ __ ___     ___  | |_  | |__    _   _ __     __ _         _   _ __         | |_  | |__     ___         \n" +
                "    | |    | '_ \\   / _ \\ | '__|  / _ \\     / __|       / __|  / _ \\  | '_ ` _ \\   / _ \\ | __| | '_ \\  | | | '_ \\   / _` |       | | | '_ \\        | __| | '_ \\   / _ \\        \n" +
                "    | |    | | | | |  __/ | |    |  __/     \\__ \\       \\__ \\ | (_) | | | | | | | |  __/ | |_  | | | | | | | | | | | (_| |       | | | | | |       | |_  | | | | |  __/  _   _ \n" +
                "    |_|    |_| |_|  \\___| |_|     \\___|     |___/       |___/  \\___/  |_| |_| |_|  \\___|  \\__| |_| |_| |_| |_| |_|  \\__, |       |_| |_| |_|        \\__| |_| |_|  \\___| (_) (_)\n" +
                "                                                                                                                     __/ |                                                     \n" +
                "                                                                                                                    |___/                                                      \n\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("             .----------------.  .----------------.  .----------------.  .----------------.  .----------------. \n" +
                "            | .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |\n" +
                "            | |      __      | || |  _________   | || |  _________   | || |     _____    | || |     ______   | |\n" +
                "            | |     /  \\     | || | |  _   _  |  | || | |  _   _  |  | || |    |_   _|   | || |   .' ___  |  | |\n" +
                "            | |    / /\\ \\    | || | |_/ | | \\_|  | || | |_/ | | \\_|  | || |      | |     | || |  / .'   \\_|  | |\n" +
                "            | |   / ____ \\   | || |     | |      | || |     | |      | || |      | |     | || |  | |         | |\n" +
                "            | | _/ /    \\ \\_ | || |    _| |_     | || |    _| |_     | || |     _| |_    | || |  \\ `.___.'\\  | |\n" +
                "            | ||____|  |____|| || |   |_____|    | || |   |_____|    | || |    |_____|   | || |   `._____.'  | |\n" +
                "            | |              | || |              | || |              | || |              | || |              | |\n" +
                "            | '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |\n" +
                "             '----------------'  '----------------'  '----------------'  '----------------'  '----------------' \n\n\n\n");
        TimeUnit.SECONDS.sleep(3);
        //end introduction

        for (int i = 0; i < openingIntro.length; i++){
            System.out.print(openingIntro[i] + "\n\n");
            TimeUnit.SECONDS.sleep(3);
        }

        //where they choose to chase the dog or pack
        String packOrDog = player.nextLine();

        //display next choice tree, keep user in loop until they answer correctly
        while (onFirstQuestion){
            if (packOrDog.equals("upstairs")){
                onFirstQuestion = false;
                for (int i = 0; i < upstairsToPack.length; i++){
                    System.out.print(upstairsToPack[i] + "\n\n");
                    TimeUnit.SECONDS.sleep(3);
                }
            } else if (packOrDog.equals("dog")){
                onFirstQuestion = false;
                for (int i = 0; i < chaseTheDog.length; i++){
                    System.out.print(chaseTheDog[i] + "\n\n");
                    TimeUnit.SECONDS.sleep(3);
                }
            } else {
                System.out.println(incorrectInput);
                packOrDog = player.nextLine();
            }
        }

        String nowOrLater = player.nextLine();

        while (onSecondQuestion){
            if (nowOrLater.equals("now")){
                onSecondQuestion = false;
                for (int i = 0; i < askHerNow.length; i++){
                    System.out.print(askHerNow[i] + "\n\n");
                    TimeUnit.SECONDS.sleep(3);
                }
            } else if (nowOrLater.equals("later")){
                onSecondQuestion = false;
                for (int i = 0; i < askHerLater.length; i++){
                    System.out.print(askHerNow[i] + "\n\n");
                    TimeUnit.SECONDS.sleep(3);
                }
            } else {
                System.out.println(incorrectInput);
                nowOrLater = player.nextLine();
            }
        }

        String atticOrFamily = player.nextLine();

        while (onThirdQuestion){
            if (atticOrFamily.equals("follow")){
                onThirdQuestion = false;
                for (int i = 0; i < atticWithGranny.length; i++){
                    System.out.print(atticWithGranny[i] + "\n\n");
                    TimeUnit.SECONDS.sleep(3);
                }
                System.out.print(gameOver);
                TimeUnit.SECONDS.sleep(3);
                break;
            } else if (atticOrFamily.equals("unpack")){
                onThirdQuestion = false;
                for (int i = 0; i < unpackPhoneCooking.length; i++){
                    System.out.print(unpackPhoneCooking[i] + "\n\n");
                    TimeUnit.SECONDS.sleep(3);
                }
            } else if (atticOrFamily.equals("cooking")){
                onThirdQuestion = false;
                for (int i = 0; i <= chooseToCook.length; i++){
                    System.out.print(askHerNow[i] + "\n\n");
                    TimeUnit.SECONDS.sleep(3);
                }
            } else if (atticOrFamily.equals("phone")){
                onThirdQuestion = false;
                for (int i = 0; i < chooseToPhone.length; i++){
                    System.out.print(askHerNow[i] + "\n\n");
                    TimeUnit.SECONDS.sleep(3);
                }
                System.out.print(gameOver);
            } else {
                System.out.println(incorrectInput);
                atticOrFamily = player.nextLine();
            }
        }

        String liveOrDie = player.nextLine();

        while (onFourthQuestion){
            if (liveOrDie.equals("investigate")){
                onFourthQuestion = false;
                for (int i = 0; i < atticWithoutGranny.length; i++){
                    System.out.print(atticWithoutGranny[i] + "\n\n");
                    TimeUnit.SECONDS.sleep(3);
                }
            } else if (liveOrDie.equals("stay")){
                onFourthQuestion = false;
                for (int i = 0; i < winner.length; i++){
                    System.out.print(winner[i] + "\n\n");
                    TimeUnit.SECONDS.sleep(3);
                }
            } else if (atticOrFamily.equals("unpack")){
                for (int i = 0; i < unpackPhoneCooking.length; i++){
                    System.out.print(unpackPhoneCooking[i] + "\n\n");
                    TimeUnit.SECONDS.sleep(3);
                }
            } else if (atticOrFamily.equals("cooking")){
                for (int i = 0; i <= chooseToCook.length; i++){
                    System.out.print(askHerNow[i] + "\n\n");
                    TimeUnit.SECONDS.sleep(3);
                    }
                }
                else {
                System.out.println(incorrectInput);
                liveOrDie = player.nextLine();
            }
        }


    }
}
