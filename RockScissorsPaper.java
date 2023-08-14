import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (input.equals("End of the game")){
            System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
            input = scanner.next();
            if(input.equals("r") || input.equals("rock")){
                input = ROCK;
            }else if(input.equals("p") || input.equals("paper")){
                input = PAPER;
            }else if(input.equals("s") || input.equals("scissors")){
                input = SCISSORS;
            }else{
                System.out.println("Invalid input. Try again...");
                return;
            }
            Random random = new Random();
            int computerRandomNumber = random.nextInt(3);

            String computeMove = "";
            switch (computerRandomNumber){
                case 0:
                    computeMove = ROCK;
                    System.out.println("The computer chose Rock");
                    break;
                case 1:
                    computeMove = PAPER;
                    System.out.println("The computer chose Paper");
                    break;
                case 2:
                    computeMove = SCISSORS;
                    System.out.println("The computer chose Scissors");
                    break;
            }
            if((input.equals(ROCK) && computeMove.equals(SCISSORS)) ||
                    (input.equals(SCISSORS) && computeMove.equals(PAPER)) ||
                    (input.equals(PAPER) && computeMove.equals(ROCK))){
                System.out.println("You win");
            }else if(input.equals(computeMove)){
                System.out.println("This game is draw");
            }else {
                System.out.println("You lose");
            }
        }
    }
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
}