//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases
		Scanner keyboard = new Scanner(in);
		
		out.print("Enter X1: ");
		int x1 = keyboard.nextInt();
		
		out.print("Enter Y1: ");
		int y1 = keyboard.nextInt();
		
		out.print("Enter X2: ");
		int x2 = keyboard.nextInt();
		
		out.print("Enter Y2: ");
		int y2 = keyboard.nextInt();
		
		Distance test = new Distance(x1,y1,x2,y2);
		test.calcDistance();
		test.print();
			
	}
}