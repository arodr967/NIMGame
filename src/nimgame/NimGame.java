/*
File Name: NimGame.java
//******PROPERTY OF ALICIA RODRIGUEZ********
Tester class which will create the player objects and pass them
to the Nim constructor (or the play() method). Once the game has finished,
the user is prompted to see if they want to play again.
 */
package nimgame;

import java.util.Scanner;

//******PROPERTY OF ALICIA RODRIGUEZ********
public class NimGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      //******PROPERTY OF ALICIA RODRIGUEZ******** 
        System.out.println("Welcome To The Ancient and "
                + "Honorable Game of Nim!\n"); 
        
       //Player objects
       Player humanPlayer = new Human(); 
       Player dumbComputerPlayer = new DumbComputer();
       Player smartComputerPlayer = new SmartComputer();

//******PROPERTY OF ALICIA RODRIGUEZ********       
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
        //******PROPERTY OF ALICIA RODRIGUEZ********   
           System.out.println("Do you want to play with the Smart or Dumb "
                   + "computer? (Type Smart or Dumb)");
           String answer2 = inputScan.next();
           System.out.println("");  //new line for formatting
           
           //Nim object, create a new game everytime the person wants to play
           //again
           Nim nimGame = new Nim();
        //******PROPERTY OF ALICIA RODRIGUEZ********   
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
      //******PROPERTY OF ALICIA RODRIGUEZ********
           }
           if(answer1.equalsIgnoreCase("Second") &&
                   answer2.equalsIgnoreCase("Smart"))
           {
               nimGame.play(smartComputerPlayer, humanPlayer);
     //******PROPERTY OF ALICIA RODRIGUEZ********
           }
           if(answer1.equalsIgnoreCase("Second") &&
                   answer2.equalsIgnoreCase("Dumb"))
           {
               nimGame.play(dumbComputerPlayer, humanPlayer);
    
           }
           
           System.out.println("");  //new line for formatting
     //******PROPERTY OF ALICIA RODRIGUEZ********      
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
     //******PROPERTY OF ALICIA RODRIGUEZ********       
       } while(playAgain.equalsIgnoreCase("Yes"));
         //does the player want to play again? then keep looping
 //******PROPERTY OF ALICIA RODRIGUEZ********      
       
    }
//******PROPERTY OF ALICIA RODRIGUEZ********    
}//end of NimGame class definition
