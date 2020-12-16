import java.util.*;

public class App {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);


        System.out.println("Welcome to the guessing game. \nPick a number 1-20. You get unlimited tries to guess the number correct but it will show how many it took you at the end of the game. If your guess is above/below the correct number it will print out either too high or too low");
  
  Random rand = new Random();
    int numberToguess = rand.nextInt(20);
    int numberOftries = 0;
    int guess;
    boolean win = false;

    while (win==false) {

      System.out.println("\n Guess a number between 1 and 20:"  );
      guess = input.nextInt();
      numberOftries++;
    

    if (guess == numberToguess){ win = true;
    }

    else if (guess < numberToguess) { System.out.println ("Your guess is too low");
    }

    else if (guess> numberToguess) { System.out.println ("Your guess is too high");
    }
    
}

System.out.println("You win!!");
System.out.println ("The correct number was "+ numberToguess);
System.out.println("It took you " + numberOftries + " tries");

}

}
