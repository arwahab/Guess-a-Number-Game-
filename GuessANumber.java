package guessanumber;
import java.util.Random;
import java.util.Scanner;

// Abdul Wahab

public class GuessANumber {
    
public static void main(String[] args) {
    
    Random kaliai = new Random();
    int secretNumber = kaliai.nextInt(100) + 1;
    
    Scanner bhanggi = new Scanner(System.in);
    
    System.out.println("I'm thinking of a number between 1 & 100. What number do you think it is?");
    
    int guess = bhanggi.nextInt();
    
    if(guess < 1 || guess > 100){
        System.out.println("If you're not going to try, I'm not playing.");
    }
    else{
        if(guess == secretNumber)
            System.out.println("Hoorayy! You Win!");
        else
        {
            System.out.println("The number was: " +secretNumber);
            if(Math.abs(guess-secretNumber)> 3)
                System.out.println("You almost had it!");
            else{
                System.out.println("You were close");
                System.out.println("Better luck next time");
            }
        }
    }
