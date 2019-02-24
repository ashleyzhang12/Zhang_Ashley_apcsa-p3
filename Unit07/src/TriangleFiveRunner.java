//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive test = new TriangleFive('c',4);
	   System.out.println(test);
	   
	   test.setLetter('z');
	   test.setAmount(5);
	   System.out.println(test);
	   
	   test.setLetter('y');
	   test.setAmount(3);
	   System.out.println(test);
	}
}