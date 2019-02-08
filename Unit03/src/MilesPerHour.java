//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph = 0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		setNums(distance,hours,minutes);
	}

	public void calcMPH()
	{
		mph=distance / (hours + ((float)minutes / 60));
	}

	public void print()
	{
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + Math.round(mph) + " MPH." );
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}