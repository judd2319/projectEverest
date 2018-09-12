/**
 * 
 */
package Everest;

import java.util.*;
import student.TestableRandom;

/**
 * @author juddc
 * @version 09/12/18
 *
 *          This class is the ground upon which the entire game will be built
 */
public class Map {
    private ArrayList[][] map;
    private int width;
    private int height;

    /**
     * Default Constructor, sets the map width to 2000 and height to 1000
     */
    public Map()
    {
	map = new ArrayList[2000][1000];
	width = 2000;
	height = 1000;
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
    }

    /**
     * This method puts Ice and Sea all around the borders and fully randomizes the middle of the map. 
     * 
     * *** Later we will add in selective randimization to create a cohesive map
     */
    private void randomizeMap()
    {
	TestableRandom random = new TestableRandom();
	int randomTerrain = random.nextInt(7);
	Terrain square = null;
	for (int i = 0; i < width; i++)
	{
	    for (int j = 0; j < height; j++)
	    {
		//Sets the borders of the map to be made of ice and sea
		if (j == 0 || j == height -1 || i == 0 || i == width -1)
		{
		    map[i][j].set(0, Terrain.ICE);
		    break;
		}
		else if (j == 1 || j == 2 || j == height - 2 || j == height - 3 || i == 1 || i == 2 || i == width - 2 || i == width - 3)
		{
		    map[i][j].set(0, Terrain.SEA);
		    break;
		}
		//Sets the squares in the middle of the map to be random
		randomTerrain = random.nextInt(7);
		switch (randomTerrain)
		{
		case 0:
		    square = Terrain.HILL;
		    break;
		case 1:
		    square = Terrain.DESERT;
		    break;
		case 2:
		    square = Terrain.PLAINS;
		    break;
		case 3:
		    square = Terrain.FOREST;
		    break;
		case 4:
		    square = Terrain.GRASSLAND;
		    break;
		case 5:
		    square = Terrain.MOUNTAIN;
		    break;
		case 6:
		    square = Terrain.SEA;
		    break;
		}
		map[i][j].set(0, square);
	    }
	}
    }
}
