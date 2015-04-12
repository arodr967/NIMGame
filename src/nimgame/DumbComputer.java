/*
File Name: DumbComputer.java

Dumb computer player removes a random number of marbles between 1 and
n/2 each time it is it's turn.
 */
package nimgame;

import java.util.Random;

public class DumbComputer implements Player
{
    /**
     * Constructor of the dumb computer
     */
    public DumbComputer()
    {
        //no instances variables needed; Therefore, nothing to be initialized.
    }
    
    /**
     * Overriding toString method which will return what type of player this is
     * 
     * @return dumb computer
     */
    @Override
    public String toString() 
    {
        return "Dumb Computer";
    }
    
    /**
     * The dumb computers move will be a random number of marbles
     * between 1 and n/2.
     * 
     * @param marbles number of marbles that are in the pile
     * @return the number which the player wants to make their move with
     */
    @Override
    public int move(int marbles)
    {        
        Random generator = new Random();
        int move = generator.nextInt(marbles/2)+1;
        
        System.out.println(this + " has removed " + move 
                + " marbles from the pile.\n");
        return move;      
    }
}
