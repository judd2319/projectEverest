/**
 * 
 */
package Everest;

/**
 * @author juddc
 * @version 09/12/18
 *
 *          The mountain terrain is innaccessable to all gorund units but is
 *          accessable to air units. It provides one production to nearby
 *          cities.
 */
public class Mountain extends Terrain {
    /**
     * Constructor for the Mountain terrain
     */
    public Mountain()
    {
	super(1, 1, 0, 1, 0, 0, false, true, false);
    }
}
