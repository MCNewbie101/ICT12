import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int playerWin = 0;
        int playerLose = 0;
        while (true) {
            System.out.println("Rock, paper, scissors!");
            Scanner scanner = new Scanner(System.in);
            String playerTurn = scanner.nextLine();
            while (!playerTurn.equals("rock") && !playerTurn.equals("paper") && !playerTurn.equals("scissors")) {
                if (playerTurn.equals("stop")) {
                    System.out.println("You have won " + playerWin + " times and lost " + playerLose + " times.");
                    return;
                }
                System.out.println("Invalid input. Please type in \"rock\", \"paper\", or \"scissors\". Please do not use capitalization.");
                playerTurn = scanner.nextLine();
            }
            String computerTurn;
            int random = (int) (Math.random() * 3); // Generate number
            if (random == 0) {
                computerTurn = "rock"; // Computer chooses rock if generated number is 0
            } else if (random == 1) {
                computerTurn = "paper"; // Computer chooses paper if generated number is 1
            } else {
                computerTurn = "scissors"; // Computer chooses scissors if generated number is 2
            }
            System.out.println("You chose " + playerTurn + "."); // Prints out what the player chose
            System.out.println("Computer chose " + computerTurn + "."); // Prints out what the computer chose
            if (computerTurn.equals(playerTurn)) {
                System.out.println("Tie!"); // If the player and computer chose the same, it's a tie;
            } else if (computerTurn.equals("rock")) {
                if (playerTurn.equals("paper")) {
                    System.out.println("You won!"); // Paper beats rock
                    playerWin++;
                } else {
                    System.out.println("You lost!"); // Scissors lose to rock
                    playerLose++;
                }
            } else if (computerTurn.equals("paper")) {
                if (playerTurn.equals("scissors")) {
                    System.out.println("You won!"); // Scissors beats paper
                    playerWin++;
                } else {
                    System.out.println("You lost!"); // Rock lose to paper
                    playerLose++;
                }
            } else {
                if (playerTurn.equals("rock")) {
                    System.out.println("You won!"); // Rock beats scissors
                    playerWin++;
                } else {
                    System.out.println("You lost!"); // Paper lose to scissors
                    playerLose++;
                }
            }
        }
    }
}
