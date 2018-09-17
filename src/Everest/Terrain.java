/**
 * 
 */
package Everest;

/**
 * @author juddc
 * @version 09/12/18
 *
 *          This class will hold the different types of terrain and determine
 *          who can access it and what advantages/disadvantages the terrain
 *          gives.
 */
public class Terrain extends Map {
    private double attackMult;
    private double defenseMult;

    private double trade;
    private double production;
    private double food;
    private double culture;

    private boolean groundAccess;
    private boolean airAccess;
    private boolean navalAccess;

    //private int xLoc;
    //private int yLoc;

    /**
     * Default Constructor, used for grasslands (the default type of terrain)
     */
    public Terrain()
    {
	attackMult = 1;
	defenseMult = 1;
	trade = 0;
	production = 0;
	food = 2;
	culture = 0;
	groundAccess = true;
	airAccess = true;
	navalAccess = false;
    }

    /**
     * Parameterized constructor for the other types of terrain
     * 
     * @param attack  the attack multiplier
     * @param defense the defense multiplier
     * @param ground  can ground units access this terrain
     * @param air     can air units access this terrain
     * @param sea     can sea units access this terrain
     */
    public Terrain(double attack, double defense, double trade, double production, double food, double culture,
	    boolean ground, boolean air, boolean sea)
    {
	attackMult = attack;
	defenseMult = defense;
	this.trade = trade;
	this.production = production;
	this.food = food;
	this.culture = culture;
	groundAccess = ground;
	airAccess = air;
	navalAccess = sea;
    }

    /**
     * @return the attackMult
     */
    public double getAttackMult()
    {
	return attackMult;
    }

    /**
     * @param attackMult the attackMult to set
     */
    public void setAttackMult(double attackMult)
    {
	this.attackMult = attackMult;
    }

    /**
     * @return the defenseMult
     */
    public double getDefenseMult()
    {
	return defenseMult;
    }

    /**
     * @param defenseMult the defenseMult to set
     */
    public void setDefenseMult(double defenseMult)
    {
	this.defenseMult = defenseMult;
    }

    /**
     * @return the production
     */
    public double getProduction()
    {
	return production;
    }

    /**
     * @param production the production to set
     */
    public void setProduction(double production)
    {
	this.production = production;
    }

    /**
     * @return the food
     */
    public double getFood()
    {
	return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(double food)
    {
	this.food = food;
    }

    /**
     * @return the culture
     */
    public double getCulture()
    {
	return culture;
    }

    /**
     * @param culture the culture to set
     */
    public void setCulture(double culture)
    {
	this.culture = culture;
    }

    /**
     * @return the groundAccess
     */
    public boolean getGroundAccess()
    {
	return groundAccess;
    }

    /**
     * @param groundAccess the groundAccess to set
     */
    public void setGroundAccess(boolean groundAccess)
    {
	this.groundAccess = groundAccess;
    }

    /**
     * @return the airAccess
     */
    public boolean getAirAccess()
    {
	return airAccess;
    }

    /**
     * @param airAccess the airAccess to set
     */
    public void setAirAccess(boolean airAccess)
    {
	this.airAccess = airAccess;
    }

    /**
     * @return the seaAccess
     */
    public boolean getNavalAccess()
    {
	return navalAccess;
    }

    /**
     * @param seaAccess the seaAccess to set
     */
    public void setNavalAccess(boolean seaAccess)
    {
	this.navalAccess = seaAccess;
    }

    /**
     * @return the trade
     */
    public double getTrade()
    {
	return trade;
    }

    /**
     * @param trade the trade to set
     */
    public void setTrade(double trade)
    {
	this.trade = trade;
    }

    

    /**
     * Determines if two terrain objects are equal
     * 
     * @parm other is the object being tested against this terrain
     */
    public boolean equals(Object other)
    {
	if (other == this)
	{
	    return true;
	}
	if (other == null)
	{
	    return false;
	}
	if (this.getClass() == other.getClass())
	{
	    Terrain terrain = (Terrain) other;
	    if (this.getAttackMult() - terrain.getAttackMult() <= 1E-14
		    && this.getDefenseMult() - terrain.getDefenseMult() <= 1E-14
		    && this.getTrade() - terrain.getTrade() <= 1E-14
		    && this.getProduction() - terrain.getProduction() <= 1E-14
		    && this.getFood() - terrain.getFood() <= 1E-14 && this.getCulture() - terrain.getCulture() <= 1E-14
		    && this.getAirAccess() == terrain.getAirAccess()
		    && this.getGroundAccess() == terrain.getGroundAccess()
		    && this.getNavalAccess() == terrain.getNavalAccess())
	    {
		return true;
	    } else
	    {
		return false;
	    }
	} else
	{
	    return false;
	}
    }

}