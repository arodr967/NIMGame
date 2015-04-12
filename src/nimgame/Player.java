/*
File Name: Player.java

Player interface which will be implemented on the three different
types of players.
 */
package nimgame;

public interface Player {
    
    /**
     * The number which the player wants to make their next move with. Each 
     * different type of player has different conditions in choosing what
     * number they wish to play.
     * 
     * @param marbles number of marbles that are in the pile
     * @return the number which the player wants to make their move with
     */
    int move(int marbles);
    
}
