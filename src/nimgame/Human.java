/*
 File Name: Human.java
//******PROPERTY OF ALICIA RODRIGUEZ********
 Human player which decides whether they want to play first or second. Human
 player is whom inputs the move which they want to make. 
 */
package nimgame;

import java.util.Scanner;
//******PROPERTY OF ALICIA RODRIGUEZ********
public class Human implements Player 
{
    /**
     * Constructor of the human player.
     */
    public Human() 
    {
        //no instances variables needed; Therefore, nothing to be initialized.
    }
//******PROPERTY OF ALICIA RODRIGUEZ********
    /**
     * Overriding toString method which will return what type of player this is
     * 
     * @return human player
     */
    @Override
    public String toString() 
    {
        return "Human Player"; //******PROPERTY OF ALICIA RODRIGUEZ********
    }
    
    /**
     * Human is not allowed to cheat. Remove an illegal number of marbles which
     * the human inputs.
     *//******PROPERTY OF ALICIA RODRIGUEZ********
     * @param marbles number of marbles that are in the pile
     * @return the number which the player wants to make their move with
     */
    @Override
    public int move(int marbles) 
    {//******PROPERTY OF ALICIA RODRIGUEZ********
        
        Scanner inputScan = new Scanner(System.in);
        int move;

        //Player must remove 1 but no more than half of the remaining marbles.
        System.out.println(this + ", remove 1 but no more than half of "
                + "the remaining marbles: ");
        move = inputScan.nextInt();
        //******PROPERTY OF ALICIA RODRIGUEZ********
        
        //while it is an illegal number
        while (move > marbles / 2 || move < 1)
        {//******PROPERTY OF ALICIA RODRIGUEZ********
            System.out.println("Cheater! You've input an illegal number."
                    + " Please try again.\n");
            System.out.println("Remove 1 but no more than half of "
                + "the remaining marbles: ");
            move = inputScan.nextInt();
        } //******PROPERTY OF ALICIA RODRIGUEZ********
        
        System.out.println("");  //new line for formatting
        return move; //the legal number which they wish to move with

    }
//******PROPERTY OF ALICIA RODRIGUEZ********
}//end of Human class definition
