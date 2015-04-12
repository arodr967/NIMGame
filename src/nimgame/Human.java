/*
 File Name: Human.java

 Human player which decides whether they want to play first or second. Human
 player is whom inputs the move which they want to make. 
 */
package nimgame;

import java.util.Scanner;

public class Human implements Player 
{
    /**
     * Constructor of the human player.
     */
    public Human() 
    {
        //no instances variables needed; Therefore, nothing to be initialized.
    }

    /**
     * Overriding toString method which will return what type of player this is
     * 
     * @return human player
     */
    @Override
    public String toString() 
    {
        return "Human Player";
    }
    
    /**
     * Human is not allowed to cheat. Remove an illegal number of marbles which
     * the human inputs.
     *
     * @param marbles number of marbles that are in the pile
     * @return the number which the player wants to make their move with
     */
    @Override
    public int move(int marbles) 
    {
        
        Scanner inputScan = new Scanner(System.in);
        int move;

        //Player must remove 1 but no more than half of the remaining marbles.
        System.out.println(this + ", remove 1 but no more than half of "
                + "the remaining marbles: ");
        move = inputScan.nextInt();
        
        
        //while it is an illegal number
        while (move > marbles / 2 || move < 1)
        {
            System.out.println("Cheater! You've input an illegal number."
                    + " Please try again.\n");
            System.out.println("Remove 1 but no more than half of "
                + "the remaining marbles: ");
            move = inputScan.nextInt();
        } 
        
        System.out.println("");  //new line for formatting
        return move; //the legal number which they wish to move with

    }

}
