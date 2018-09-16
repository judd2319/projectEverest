/**
 * 
 */
package Everest;

import static org.junit.Assert.assertEquals;

/**
 * @author juddc
 * @version 09/12/18
 *
 *          Tests the complex methods in the Map Class
 */
public class MapTest {
    private Map map;

    public void setUp()
    {
	map = new Map(5, 5);
    }

    public void testTopBorders()
    {
	for (int i = 0; i < map.getMap().length; i++)
	{
	    //assertEquals(test, map.getMap()[i][0]);
	}
    }
}
