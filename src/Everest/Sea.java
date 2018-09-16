/**
 * 
 */
package Everest;

/**
 * @author juddc
 * @version 09/12/18
 *
 *          The sea is only traversable by aquatic units. All sea square one
 *          space out from land will have a depth of one and can be traversed by
 *          any sea unit. Open water (more than one square away from land) can
 *          be traversed by any naval unit except for the galley.The sea
 *          provieds two trade to nearby cities.
 */
public class Sea extends Terrain {
    private int depth;
    private int xLoc;
    private int yLoc;

    public Sea(int x, int y)
    {
	super(1, 1, 2, 0, 0, 0, false, true, true);
	xLoc = x;
	yLoc = y;
	depth = coastCheck();
    }

    /**
     * Parameterized construcor for the Sea Terrain
     * 
     * @param depth is the depth of the sea
     */
    public Sea(int x, int y, int depth)
    {
	super(1, 1, 2, 0, 0, 0, false, true, true);
	this.depth = depth;
	xLoc = x;
	yLoc = y;
    }

    /**
     * @return the xLoc
     */
    public int getxLoc()
    {
	return xLoc;
    }

    /**
     * @param xLoc the xLoc to set
     */
    public void setxLoc(int xLoc)
    {
	this.xLoc = xLoc;
    }

    /**
     * @return the yLoc
     */
    public int getyLoc()
    {
	return yLoc;
    }

    /**
     * @param yLoc the yLoc to set
     */
    public void setyLoc(int yLoc)
    {
	this.yLoc = yLoc;
    }

    /**
     * Constructor for the Sea Terrain
     */

    /**
     * @return the depth
     */
    public int getDepth()
    {
	return depth;
    }

    /**
     * @param depth the depth to set
     */
    public void setDepth(int depth)
    {
	this.depth = depth;
    }

    /**
     * Checks to see if this sea reagion is adjacent to a land square
     */
    private int coastCheck()
    {
	for (int i = xLoc - 1; i <= xLoc + 1; i++)
	{
	    for (int j = yLoc - 1; j <= yLoc + 1; j++)
	    {
		if (map[xLoc][yLoc].get(0).getClass() != Sea.class)
		{
		    return 1;
		}
	    }
	}
	return 2;
    }
}
