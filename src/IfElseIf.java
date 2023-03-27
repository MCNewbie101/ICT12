import java.util.Scanner;

public class IfElseIf {
    public static void main( String[] args ) {
        int people = 30;
        int cars = 40;
        int buses = 15;

        if ( cars > people ) {
            System.out.println( "We should take the cars." );
        } else if ( cars < people ) { //Print the statement only if the number of cars is less than the number of people.
            System.out.println( "We should not take the cars." );
        } else { //Print the statement only if the number of cars is equal to the number of people
            System.out.println( "We can't decide." );
        }

        if ( buses > cars ) {
            System.out.println( "That's too many buses." );
        } else if ( buses < cars ) { //Print the statement only if the number of buses is less than the number of cars
            System.out.println( "Maybe we could take the buses." );
        } else { //Print the statement only if the number of buses is equal to the number of cars
            System.out.println( "We still can't decide." );
        }

        if ( people > buses ) {
            System.out.println( "All right, let's just take the buses." );
        } else { //Print the statement only if the number of people is equal to or less than the number of buses
            System.out.println( "Fine, let's stay home then." );
        }
        //Removing "else" from any of the "else if" statements do nothing since their conditions must be false when the conditions for the if statements are true anyway.


        System.out.println("Hey, what's your name? (Sorry, I keep forgetting.)");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("OK, " + name + ", how old are you?");
        int age = scanner.nextInt();
        if (age < 16) {
            System.out.println("You can't drive.");
        } else if (age <= 17) {
            System.out.println("You can drive but not vote.");
        } else if (age <= 24) {
            System.out.println("You can vote but not rent a car.");
        } else {
            System.out.println("You can do pretty much anything.");
        }


        double[] gravity = {0.78, 0.39, 2.65, 1.17, 1.05, 1.23};
        System.out.println("Please enter your current Earth weight: ");
        int weight = scanner.nextInt();
        System.out.println("I have information on the following planets: ");
        System.out.println("   1. Venus     2. Mars      3. Jupiter");
        System.out.println("   4. Saturn    5. Uranus    5. Neptune");
        int choice = scanner.nextInt();
        System.out.println("Your weight would be " + weight * gravity[choice - 1] + " on that planet.");



        String[][] easy = {{"How many nations are in Teyvat?", "1. 7", "2. 8", "3. 11"}, {"Which of these is a playable character as of version 3?", "1. Alice", "2. Venti", "3. Dainsleif"}, {"Who did the Traveler fish up?", "1. Amber", "2. Endora", "3. Paimon"}};
        int[] eAns = {1, 2, 3};
        String[][] medium = {{"Which of the following is the archon name of a currently alive archon?", "1. Nahida", "2. Beelzubul", "3. Rukkhadevata"}, {"How many descenders are there?", "1. 3", "2. 4", "3. 5"}, {"What is the place Sal Vindagnyr was located in now called?", "1. Dragonspine", "2. Sal Terrae", "3. Enkonomiya"}};
        int[] mAns = {2, 2, 1};
        String[][] hard = {{"Who is the archon referred to by the letter found in the upside down city in the Chasm?", "1. Morax", "2. Focalors", "3. Barbatos"}, {"Who is Phanes?", "1. The Primodial One", "2. The goddess of time", "3. Focalors' predecessor"}, {"Where was the 'Genesis Pearl' mentioned?", "1. A book found in Enkonomiya", "2. In the Travail trailer", "3. In a story told by Venti"}};
        int[] hAns = {3, 1, 3};
        System.out.println("Welcome to Genshin quizzes v1!");
        System.out.println("You will be asked three questions in increasing difficulty.");
        int score = 0;
        int eChoice = (int) (Math.random() * 3);
        for (int i = 0; i < 4; i++) {
            System.out.println(easy[eChoice][i]);
        }
        int answer = scanner.nextInt();
        if (answer == eAns[eChoice]) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is " + eAns[eChoice] + ".");
        }
        int mChoice = (int) (Math.random() * 3);
        for (int i = 0; i < 4; i++) {
            System.out.println(medium[mChoice][i]);
        }
        answer = scanner.nextInt();
        if (answer == mAns[mChoice]) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is " + mAns[mChoice] + ".");
        }
        int hChoice = (int) (Math.random() * 3);
        for (int i = 0; i < 4; i++) {
            System.out.println(hard[hChoice][i]);
        }
        answer = scanner.nextInt();
        if (answer == hAns[hChoice]) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is " + hAns[hChoice] + ".");
        }
        System.out.println();
        System.out.println("Your final score is " + score + ".");
        System.out.println("Thank you for playing!");
    }
}
