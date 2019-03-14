//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	
	public ToyStore(String toys)
	{
		loadToys(toys);
	}

	public void loadToys( String toys )
	{
		toyList = new ArrayList<Toy>();
		String[] newToys = toys.split(" ");
		String toyName = "";
		boolean exists = false;
		for(int i = 0; i < newToys.length; i++)
		{
			exists = false;
			for (int j = 0; j < toyList.size(); j++)
			{
				if (newToys[i].equals(toyList.get(j).getName()))
				{
					exists = true;
					toyList.get(j).setCount(toyList.get(j).getCount() + 1);
					break;
				}
			}
			
			if (exists == false )
			{
				toyName = newToys[i];
				toyList.add(new Toy(toyName));
				
			}
		}
		
	}
  
  	public Toy getThatToy(String nm )
  	{
  		int count = 0;
  		for(int i = 0; i < toyList.size(); i ++)
  		{
  			if (toyList.get(i).getName().equals(nm))
  			{
  				return toyList.get(i);
  			}
  		}
  		return null;
  		
  	}
  
  	public String getMostFrequentToy()
  	{
  		int max = 0;
  		String maxToy = "";
  		for (int i = 0; i < toyList.size();i++)
  		{
  			if(toyList.get(i).getCount() > max)
  			{
  				max = toyList.get(i).getCount();
  				maxToy = toyList.get(i).getName();
  			}
  		}
  		return maxToy;
  	}  
  
  	public void sortToysByCount()
  	{
  		Toy pos;
  		for(int i = 0; i < toyList.size()-1; i ++)
  		{
  			for(int j = i+1; j < toyList.size(); j ++)
  			{
	  			if(toyList.get(j).getCount() > toyList.get(i).getCount()) 
	  			{
	  				pos = toyList.get(i);
	  				toyList.set(i, toyList.get(j));
	  				toyList.set(j, pos);
	  			}
	  			else
	  			continue;	
	  			}
  		}
 
  		
  		
  	}  
  	  
	public String toString()
	{
	   return Arrays.toString(toyList.toArray());
	   
	}
}