/*
File Name: Pile.java

Class which creates and maintains the pile of marbles. The pile generates a
random number of marbles between 10 and 100.
 */
package nimgame;

import java.util.Random;

public class Pile 
{
    //Instance Variable:
    private int marbles;    //number of marbles in the pile
    
    /**
     * Sets the initial number of marbles between 10 and 100 marbles randomly.
     * This is how the game will start, with a random number and then the
     * player will select a number which they want to subtract from.
     */
    public Pile()
    {
       Random generator = new Random();
       marbles = generator.nextInt(91)+10;       
    }
    
    /**
     * Get the number of marbles which are left in the pile
     * 
     * @return the number of marbles which are left in the pile
     */
    public int getMarbles()
    {
        return marbles;
    }

    /**
     * Removes marbles from the pile.
     * 
     * @param toBeRemove number which will be removed from the pile
     */
    public void removeMarbles(int toBeRemove) 
    {
        
        marbles = marbles - toBeRemove;
        System.out.println("There are now " + marbles + " marbles in the pile");
        
    }
    

}
