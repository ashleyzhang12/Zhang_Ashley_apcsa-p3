//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator;
	private int denominator;
	

	//write two constructors
	public Rational()
	{
		setRational(1,1);
	}
	
	public Rational(int a,int b)
	{
		setRational(a,b);
	}


	//write a setRational method
	public void setRational(int a, int b)
	{
		setNumerator(a);
		setDenominator(b);
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int a)
	{
		numerator = a;
	}
	
	public void setDenominator(int b)
	{
		denominator = b;
	}
	
	public void add(Rational other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		int num1 = this.getNumerator();
		int num2 = other.getNumerator();
		int den1 = this.getNumerator();
		int den2 = other.getDenominator();
		int newNum = num1*den2 + num2 *den1;
		int newDen = den1*den2;
		numerator = newNum;
		denominator = newDen;
		
		
		


		reduce();
	}

	private void reduce()
	{
		for(int i= 1; i <= Math.max(numerator, denominator);i++)
		{
			int divisor = gcd(numerator,denominator);
			numerator = numerator / divisor;
			denominator = denominator /divisor;
		}



	}

	private int gcd(int numOne, int numTwo)
	{
		int greatest = 0;
		for(int i = 1; i <= Math.min(numOne, numTwo); i++)
		{
			if(numOne % i ==0 && numTwo %i ==0)
			{
				if(i > greatest)
				{
					greatest = i;
				}
			}
		}
		if (greatest > 0)
		return greatest;
		else
		return 1;
	}

	public Object clone ()
	{
		Rational clone = new Rational(numerator,denominator);
		return clone;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}
	
	
	public boolean equals( Object obj)
	{
		Rational obj1 = (Rational)obj;
		this.reduce();
		obj1.reduce();
		if(this == obj1)
		{
			return true;
		}
		else
		return false;
	}

	public int compareTo(Rational other)
	{
		int difference = 0;
		difference = this.getNumerator() * other.getDenominator() - other.getNumerator() * this.getDenominator();
		if(difference > 0)
		return 1;
		else
		return -1;
		
	}



	
	//write  toString() method
	public String toString()
	{
		String output = "";
		output = output + this.getNumerator() + " / " + this.getDenominator();
		return output;
	}
	
	
}