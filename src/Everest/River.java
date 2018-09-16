/**
 * 
 */
package Everest;

/**
 * @author juddc
 * @version 09/12/18
 *
 *          The river is a special terain that will go over the main seven
 *          terrains. Attacking over a river results in a 50% penalty, definding
 *          against an army attacking over a river recieves a 50% bonus.
 */
public class River extends Terrain {
    /**
     * Constructor for the river terrain
     */
    public River()
    {
	super(0.5, 1.5, 0, 0, 0, 0, true, true, false);
    }

}
