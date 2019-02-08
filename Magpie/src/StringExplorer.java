/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int pos = sample.indexOf("slow");
		if(pos != -1)
		   System.out.println("slow is found at position " + pos);
		else
		   System.out.println("slow is not found");


		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		String sentence = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
		int count = 0;
		for (int x = 0; x < sentence.length() - 3; x = x + 1)
		{
			if(sentence.substring(x, x + 3).equals("the"))
			{
				count = count + 1;
			}
			else 
			{
				count = count;
			}
		}
		System.out.println(count);

	}

}
