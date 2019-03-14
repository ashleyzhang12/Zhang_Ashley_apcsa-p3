//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;
	String[] store;
	

	public Toy()
	{
		name = "";
		count = 0;
	}

	public Toy( String nm)
	{
		setName(nm);
		count = 1;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
		count = cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public String toString()
	{
		
	   return getName() + " " + getCount();
	}
}