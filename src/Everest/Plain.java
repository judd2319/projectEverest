/**
 * 
 */
package Everest;

/**
 * @author juddc
 * @version 09/12/18
 *
 *          The plain terrain generates one food and no production. It is
 *          yellowish-brown in color.
 */
public class Plain extends Terrain {
    /**
     * Default constructor for the plain, uses the default constructor from terrain.
     */
    public Plain()
    {
	super(1, 1, 0, 0, 1, 0, true, true, false);
    }
}
