import java.util.*;

public class App {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    // the intro to the game
    System.out.println("Welcome to the guessing game. \nPick a number 1-20. You get 5 tries to guess the number correct but it will show how many it took you at the end of the game. If your guess is above/below the correct number it will print out either too high or too low");

    //code generates a random number between 1-20
    while(true){
      int numberToguess = rand.nextInt(20);
      int numberOftries = 0;
      int guess;
      boolean win = false;

      //if user enters a number too high then the code will state your guess was to high if the user enters a number too low then the code will state your guess was too low.
      for (int i = 0; i<5 && win==false; i++ ) {

        System.out.println("\n Guess a number between 1 and 20:"  );
        guess = input.nextInt();
        numberOftries++;
        
        if (guess == numberToguess){ 
          win = true;
        }
        else if (guess < numberToguess) { 
          System.out.println ("Your guess is too low");
        }

        else if (guess> numberToguess) { 
          System.out.println ("Your guess is too high");
        }

        //if the user takes to many tries and continues to get the number wrong it will print out the text bellow
        if (i==5 && win ==false){
          System.out.println("You lost :(took too many tries");
        }
        
      }
    // if the boolean = false! which really means that win is true then it will print out you won and if not say you lost.
      if(win) {
        System.out.println("You win!!");
      }
      else {
        System.out.println ("You lost");
      }

      //it will state what the correct number it was. how many tries you took and if you want to start again.
      System.out.println ("The correct number was "+ numberToguess);
      System.out.println("It took you " + numberOftries + " tries");

      System.out.println("Do you want to play again? yes/no"); 
      input.nextLine(); // Extra nextLine needed to "consume" leftover enter
      String answer = input.nextLine();
     
      if (answer.equals("no")) 
        break;
    }
    


  }
}
