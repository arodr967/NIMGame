/*
File Name: Nim.java
//******PROPERTY OF ALICIA RODRIGUEZ********
Nim class which depends only on the Player interface and
Pile class. It does not depend on any of the other classes that
implement the Player Interface.
 */
package nimgame;
//******PROPERTY OF ALICIA RODRIGUEZ********
public class Nim
{
    //Instance Variables:
    private Pile marblePile;    //the pile of marbles
    
    /**
     * Constructs a pile.
     */
    public Nim()
    {
        marblePile = new Pile();
        //******PROPERTY OF ALICIA RODRIGUEZ********
    }
    
    /**
     * Conductor of the game. Nim knows how many marbles are in the pile.
     * Must call the move() method polymorphically.
     * 
     * @param player1 Player 1: either human, smart comp, or dumb comp.
     * @param player2 Player 2: either human, smart comp, or dumb comp.
     */
    public void play(Player player1, Player player2)
    {
        System.out.println("***Game has started***\n");
//******PROPERTY OF ALICIA RODRIGUEZ********
        
        System.out.println(player1 + " VS " + player2 + "\n\n");
        //polymorphically calling the corresponding toString methods
        
        int play;
        
        System.out.println("There are " + marblePile.getMarbles() 
                + " marbles in the pile.");
        //******PROPERTY OF ALICIA RODRIGUEZ********
        do
        {   //start conducting the game atleast once
            
            play = player1.move(marblePile.getMarbles());   //polymorphism
            marblePile.removeMarbles(play);     //remove the number of marbles
                                                //the player chooses in "move"
            if(marblePile.getMarbles() == 1)
            {   //if the number of marbles is equal to 1 then...
                System.out.println(player1 + " is the winner!");
                System.out.println(player2 + " pick up the last marble!");
                break;  //no need to continue
            }
            //******PROPERTY OF ALICIA RODRIGUEZ********
            play = player2.move(marblePile.getMarbles());   //polymorphism
            marblePile.removeMarbles(play);     //remove the number of marbles
                                                //the player chooses in "move"
            if(marblePile.getMarbles() == 1)
            {
                System.out.println(player2 + " is the winner!");
                System.out.println(player1 + " pick up the last marble!");
                //no break needed because it's already the end of the loop
            }
                
        }
        while(marblePile.getMarbles() > 0); //is #of marbles greater than 0?
                                            //continue loop, if it's not then
                                            //game has finished.
        
    }//******PROPERTY OF ALICIA RODRIGUEZ********
    
}//end of Nim class definition
