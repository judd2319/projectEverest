/**
 * 
 */
package Everest;

/**
 * @author juddc
 * @version 09/11/18
 *
 * A parent class for all the units
 */
public class Units {
    private int attack;
    private int defense;
    private int moves;

    /**
     * Default constructor for the Units class. It sets the attack to 1, defense to 1, moves to 1
     */
    public Units()
    {
        attack = 1;
        defense = 1;
        moves = 1;
    }
    
    /**
     * A paraeteized constructor for the Units Class. It allows you to set the attack, defense, moves, and production cost
     * @param attack is the attack of the unit
     * @param defense is the defense of the unit
     * @param moves is the number of moves the unit has
     */
    public Units(int attack, int defense, int moves)
    {
	this.attack = attack;
	this.defense = defense;
	this.moves = moves;
    }

    /**
     * @return the attack
     */
    public int getAttack()
    {
        return attack;
    }

    /**
     * Sets the attack
     * @param attack the attack to set
     */
    public void setAttack(int attack)
    {
        this.attack = attack;
    }

    /**
     * @return the defense
     */
    public int getDefense()
    {
        return defense;
    }

    /**
     * Sets the defense
     * @param defense the defense to set
     */
    public void setDefense(int defense)
    {
        this.defense = defense;
    }

    /**
     * @return the moves
     */
    public int getMoves()
    {
        return moves;
    }

    /**
     * Sets the number of moves
     * @param moves the moves to set
     */
    public void setMoves(int moves)
    {
        this.moves = moves;
    }  
    
    //public void checkTerrain(); //This method will check what type of terrain the unit is on and apply the correct multiplyers
}
