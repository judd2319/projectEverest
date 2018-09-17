/**
 * 
 */
package Everest;

import java.util.*;

/**
 * @author juddc
 * @version 09/12/18
 *
 *          This class is the ground upon which the entire game will be built
 */
public class Map {
    protected ArrayList<Map>[][] map;
    private int width;
    private int height;

    /**
     * Default Constructor, sets the map width to 20 and height to 10
     */
    public Map()
    {
	width = 20;
	height = 10;
	map = new ArrayList[width][height];
	randomizeMap();
    }

    /**
     * Parameterized constructor
     * 
     * @param width  set the width of the map
     * @param height set the height of the map
     */
    public Map(int width, int height)
    {
	this.width = width;
	this.height = height;
	map = new ArrayList[width][height];
	randomizeMap();
    }

    /**
     * This method puts Ice and Sea all around the borders and fully randomizes the
     * middle of the map.
     * 
     * *** Later we will add in selective randimization to create a cohesive map
     */
    private void randomizeMap()
    {
	int randomTerrain = (int) (Math.random() * 6);
	int randomLandSea = (int) (Math.random() * 2);
	Terrain square = new Grassland();
	for (int i = 0; i < width; i++)
	{
	    for (int j = 0; j < height; j++)
	    {
		//Sets the borders of the map to be made of ice and sea
		if (j == 0 || j == height - 1)
		{
		    map[i][j].set(0, new Ice());
		} else if (j == 1 || j == 2 || j == height - 2 || j == height - 3)
		{
		    map[i][j].set(0, new Sea(i, j));
		} else
		{
		    //Sets the squares in the middle of the map to be random
		    switch (randomLandSea)
		    {
		    case 0:
			switch (randomTerrain)
			    {
			    case 0:
				square = new Hill();
				break;
			    case 1:
				square = new Desert();
				break;
			    case 2:
				square = new Plain();
				break;
			    case 3:
				square = new Forest();
				break;
			    case 4:
				square = new Grassland();
				break;
			    case 5:
				square = new Mountain();
				break;
			    }
			break;
		    case 1:
			square = new Sea(i, j);
			break;
		    }
		    map[i][j].set(0, square);
		}
	    }
	}
    }

    /**
     * @return the map of the game
     */
    public ArrayList<Map>[][] getMap()
    {
	return map;
    }

    /**
     * @return the height
     */
    public int getHeight()
    {
	return height;
    }

    /**
     * @return the width of the map
     */
    public int getWidth()
    {
	return width;
    }
}
