/*
File Name: NimGame.java

Tester class which will create the player objects and pass them
to the Nim constructor (or the play() method). Once the game has finished,
the user is prompted to see if they want to play again.
 */
package nimgame;

import java.util.Scanner;

/**
 * Alicia Rodriguez
 * Section U04
 * 
 * I affirm that this program is entirely my own work 
 * and none of it is the work of any other person.
 *       ___________________
 *        (your signature)
 */
public class NimGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        System.out.println("Welcome To The Ancient and "
                + "Honorable Game of Nim!\n"); 
        
       //Player objects
       Player humanPlayer = new Human(); 
       Player dumbComputerPlayer = new DumbComputer();
       Player smartComputerPlayer = new SmartComputer();

       
       Scanner inputScan = new Scanner(System.in);
       String playAgain;

       do
       {   //Play the game atleast once.
           //Ask HUMAN whether they want to go first or second, and if they
           //want to play against the smart or dumb comp.
           System.out.println("Do you want to want to go First or Second? "
                   + "(Type First or Second)");
           String answer1 = inputScan.next();
           System.out.println("");  //new line for formatting
           
           System.out.println("Do you want to play with the Smart or Dumb "
                   + "computer? (Type Smart or Dumb)");
           String answer2 = inputScan.next();
           System.out.println("");  //new line for formatting
           
           //Nim object, create a new game everytime the person wants to play
           //again
           Nim nimGame = new Nim();
           
           //4 different if statements for each condition
           if(answer1.equalsIgnoreCase("First") &&
                   answer2.equalsIgnoreCase("Smart"))
           {
               nimGame.play(humanPlayer, smartComputerPlayer);
               
           }
           if(answer1.equalsIgnoreCase("First") &&
                   answer2.equalsIgnoreCase("Dumb"))
           {
               nimGame.play(humanPlayer, dumbComputerPlayer);
      
           }
           if(answer1.equalsIgnoreCase("Second") &&
                   answer2.equalsIgnoreCase("Smart"))
           {
               nimGame.play(smartComputerPlayer, humanPlayer);
     
           }
           if(answer1.equalsIgnoreCase("Second") &&
                   answer2.equalsIgnoreCase("Dumb"))
           {
               nimGame.play(dumbComputerPlayer, humanPlayer);
    
           }
           
           System.out.println("");  //new line for formatting
           
           //Ask player if they want to play atleast one more time
           System.out.println("Do you want to play again? (Yes or No)");
           playAgain = inputScan.next();
           
           System.out.println("");  //new line for formatting
           
           //Check if the player doesn't want to play again
           if(playAgain.equalsIgnoreCase("No"))
           {    //if they don't then display message.
            System.out.println("\nThanks for playing.");
           }
           //no break needed because it's already the end of the loop
            
       } while(playAgain.equalsIgnoreCase("Yes"));
         //does the player want to play again? then keep looping
       
       
    }
    
}
