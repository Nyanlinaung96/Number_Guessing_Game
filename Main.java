import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNum;
        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        randomNum = random.nextInt(min,max+1);
        System.out.println("Random Number Guessing Game");
        System.out.printf("Guess between number %d-%d\n",min,max);
        do{
            System.out.print("Guess the number:");
            guess = scanner.nextInt();
            attempts++;
            if(guess > randomNum){
                System.out.println("Your number is too Large");
            } else if (guess < randomNum) {
                System.out.println("Your number is too Small");

            }


        }while (guess != randomNum);
        System.out.println("Your Choice is Correct😊");
        System.out.printf("Number of attemp %d",attempts);


    }
}
