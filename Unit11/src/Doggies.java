//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds	
		if (spot < pups.length)
		pups[spot] = new Dog(age,name); 
	}

	public String getNameOfOldest()
	{
		Dog oldest = pups[0];
		for (int i = 0; i < pups.length - 1; i++)
		{
			if (pups[i].getAge() < pups[i+1].getAge()) {
			oldest = pups[i+1];
			}
		}
		return oldest.getName();
	}

	public String getNameOfYoungest()
	{
		Dog youngest = pups[0];
		for(int i = 0; i < pups.length -1; i++)
		{
			if(pups[i].getAge() > pups[i+1].getAge())
			{
				youngest = pups[i+1];
			}
		}
		return youngest.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}