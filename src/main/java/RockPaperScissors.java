/*
A simple console based game application - Rock, Paper and Scissors

Rules:
Two users play against each other - both of them chooses one among the following (Rock, Paper and Scissors) at the same moment.

Win Criteria:

Combinations --

paper > rock && paper < scissors
rock < paper && rock > scissors
scissors > paper && scissors < rock

1. If person A chooses rock, person B chooses scissors --> A wins as rock > scissors
2. If person A chooses rock, person B chooses paper --> B wins as rock < paper

3. If person A chooses paper, person B chooses scissors --> B wins as paper < scissors
4. If person A chooses paper, person B chooses rock --> A wins as paper > rock

5. If person A chooses scissors, person B chooses paper --> A wins as scissors > paper
6. If person A chooses scissors, person B chooses rock --> B wins as rock > scissors


For brevity, play with computer, a random picker here
Next pick a scanner function to allow input from a user example: John
 */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static String PLAYER_WIN_MSG = "Player wins!";
    public static String COMPUTER_WIN_MSG = "Computer wins!";
    public static String INVALID_INPUT_MSG = "Invalid input";
    public static String TIE_MSG = "Its a tie! " +
            "Try again!!";
    public static void main(String[] args) {
        // create options for rock, paper, scissors here
        String[] options = new String[]{"Rock", "Paper", "Scissors"};
        int random = new Random().nextInt(3);
        System.out.println("Select a number from the options here: 1)Rock  2)Paper  3)Scissors");
        Scanner sc = new Scanner(System.in);
        int pickedOption = sc.nextInt();
        String result = "";
        result = getResult(options, random, pickedOption);
        System.out.println("Computer chose : " + options[random]);
        System.out.println(result);
    }

    private static String getResult(String[] options, int random, int pickedOption) {
        if(pickedOption > 3 || pickedOption < 0) {
            return INVALID_INPUT_MSG;
        } else if(pickedOption - 1 == random) {
            return TIE_MSG;
        } else if(options[pickedOption -1].equals(Move.ROCK.getName())) {
            return options[random].equals(Move.SCISSORS.getName()) ? PLAYER_WIN_MSG : COMPUTER_WIN_MSG;
        } else if(options[pickedOption -1].equals(Move.PAPER.getName())){
             return options[random].equals(Move.SCISSORS.getName()) ? COMPUTER_WIN_MSG : PLAYER_WIN_MSG;
        } else if(options[pickedOption -1].equals(Move.SCISSORS.getName())){
            return options[random].equals(Move.PAPER.getName()) ? PLAYER_WIN_MSG : COMPUTER_WIN_MSG;
        } else{
            return INVALID_INPUT_MSG;
        }
    }
}
