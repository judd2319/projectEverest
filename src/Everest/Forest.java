/**
 * 
 */
package Everest;

/**
 * @author juddc
 * @version 09/12/18
 *
 *          The forest unit provides two production to nearby cities and
 *          provides 50% defense advantage to units.
 */
public class Forest extends Terrain {
    /**
     * Constructor for the forst terrain
     */
    public Forest()
    {
	super(1, 1.5, 0, 2, 0, 0, true, true, false);
    }
}
