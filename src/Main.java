import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lowRange;
        int highRange ;
        int possibleGuesses;
        int yourGuess;
        int playerAnswer;
        int countNumTurns = 1;
        int n = 1;

        while(true){
            System.out.printf("Your age is greater than %d ?\n", (int) Math.pow(10, n));
            System.out.println("1 - Yes\n2 - No\nAction: ");
            playerAnswer = input.nextInt();
            if(playerAnswer == 1)
                n++;
            if(playerAnswer == 2) {
                highRange = (int) Math.pow(10, n);
                lowRange = (int) Math.pow(10, n - 1);
                break;
            }
        }

        while (true) {

            if(highRange == lowRange){
                highRange++;
                lowRange--;
            }

            possibleGuesses = (highRange + lowRange) / 2;
            yourGuess = (int) Math.ceil(possibleGuesses);
            System.out.printf("Is your age %d ?\n", yourGuess);
            System.out.println("1 - Yes\n2 - Guess a lower age\n3 - Guess a higher age\nAction: ");
            playerAnswer = input.nextInt();

            if(playerAnswer == 3)
                lowRange = yourGuess + 1;

            if(playerAnswer == 2)
                highRange = yourGuess - 1;

            if (playerAnswer == 1)
                break;

            countNumTurns++;

        }

        System.out.printf("I guessed your age in %d turns !\n", countNumTurns);

    }
}