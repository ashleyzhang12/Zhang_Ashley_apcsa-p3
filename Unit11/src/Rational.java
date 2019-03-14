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
		
		
		


		reduce();
	}

	private void reduce()
	{
		



	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd = 0;
		


		return 1;
	}

	public Object clone ()
	{
		return "";
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


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}