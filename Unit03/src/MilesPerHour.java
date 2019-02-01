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
		mph=distance / (hours + (minutes / 60));
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		
	}

	public void print()
	{
		System.out.println(distance + " miles in " + hours + " and " + minutes + " minutes = " + mph + " MPH." );
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}