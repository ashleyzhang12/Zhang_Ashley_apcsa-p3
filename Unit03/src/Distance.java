//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		setCoordinates(0,0,0,0);
		distance = 0.0;
		
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		
		setCoordinates(x1, y1, x2, y2);
		distance = 0.0;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		
	}

	public void calcDistance()
	{
		double xdistance = xTwo - xOne;
		double ydistance = yTwo - yOne;
		distance = Math.sqrt(((xTwo-xOne)*(xTwo-xOne))+ ((yTwo-yOne)*(yTwo-yOne)));
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		System.out.println("distance == " + getDistance());
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}