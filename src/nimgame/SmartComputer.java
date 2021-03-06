/*
File Name: SmartComputer.java
//******PROPERTY OF ALICIA RODRIGUEZ********
Smart computer player removes exactly enough marbles to make the remaining pile
a power of 2 minus one (ie. 1, 3, 7, 15, 31, or 63).
The smart computer player cannot be beaten unless the initial pile number that
is generated happens to be a power of 2 minus one.
 */
package nimgame;
//******PROPERTY OF ALICIA RODRIGUEZ********
import java.util.Random;
//******PROPERTY OF ALICIA RODRIGUEZ********
public class SmartComputer implements Player
{
    /**
     * Constructor of the smart computer
     */
    public SmartComputer()
    {//******PROPERTY OF ALICIA RODRIGUEZ********
        //no instances variables needed; Therefore, nothing to be initialized.
    }
    
    /**
     * Overriding toString method which will return what type of player this is
     * 
     * @return smart computer
     */
    @Override
    public String toString() 
    {
        return "Smart Computer";
    }//******PROPERTY OF ALICIA RODRIGUEZ********
    
    /**
     * The smart computer will remove exactly enough marbles to make the 
     * remaining pile a power of 2 minus one.
     * 
     * @param marbles number of marbles that are in the pile
     * @return the number which the player wants to make their move with
     */
    @Override
    public int move(int marbles)
    {//******PROPERTY OF ALICIA RODRIGUEZ********
        int move=0;
        
        if(marbles == 1 || marbles == 3 || marbles == 7 || marbles == 15
                || marbles == 31 || marbles == 63)
        {   //if the marbles is already a power of 2-1
            
            //then play as a dumb computer
            Random generator = new Random();
            move = generator.nextInt(marbles/2)+1;
            //******PROPERTY OF ALICIA RODRIGUEZ********
        }
        else //play as smart computer
        {
            //powers of 2 -1
            int [] powers = {1, 3, 7, 15, 31, 63};
                           //0  1  2   3   4   5
        //******PROPERTY OF ALICIA RODRIGUEZ********
            int i = powers.length-1;        //last position in array
        
            //while in position i
            while(powers[i] > marbles)
            {   //if i is > marbles
                //decrement i until you've found that i is greater than marbles
            i--;
            //******PROPERTY OF ALICIA RODRIGUEZ********
            //Example: marbles = 100
            //is 63 greater than 100? no
            
            }   
            //then subtract 100 by 63, which will give you the number of moves
        
            move = marbles - powers[i];
        //******PROPERTY OF ALICIA RODRIGUEZ********
        }
        
        System.out.println(this + " has removed " + move 
                + " marbles from the pile.\n");
        return move;    //move = marbles - powers(which ever number selected)
    }//******PROPERTY OF ALICIA RODRIGUEZ********
}//end of SmartComputer class definition
