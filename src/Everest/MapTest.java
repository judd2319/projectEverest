/**
 * 
 */
package Everest;

import student.TestCase;

/**
 * @author juddc
 * @version 09/16/18
 *
 *          Description
 */
public class MapTest extends TestCase {
    private Map map;

    public void setUp()
    {
	map = new Map(5, 5);
    }

    public void testTopBorder()
    {
	Ice test = new Ice();
	assertEquals(test, map.getMap()[0][0]);
    }

    public void testBotBorder()
    {
	Ice test = new Ice();
	assertEquals(test, map.getMap()[0][map.getHeight() - 1]);
    }

    public void testEquals()
    {
	Ice test = new Ice();
	Ice test2 = new Ice();
	assertEquals(test, test2);
    }

}
