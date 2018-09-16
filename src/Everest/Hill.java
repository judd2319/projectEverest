/**
 * 
 */
package Everest;

/**
 * @author juddc
 * @version 09/12/18
 *
 *          THe hill terrain grants military advantages on both the attack and
 *          defense side. It is round and light brown shaped. It provides one
 *          production and no food.
 */
public class Hill extends Terrain {
    /**
     * Constructor for the hill terrain
     */
    public Hill()
    {
	super(1.5, 1.5, 0, 1, 0, 0, true, true, false);
    }
}
