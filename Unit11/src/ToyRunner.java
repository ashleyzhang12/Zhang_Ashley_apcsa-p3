//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		ToyStore test1 = new ToyStore("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		System.out.println(test1);
		System.out.println("max == " + test1.getMostFrequentToy());
		test1.sortToysByCount();
		
		ToyStore test2 = new ToyStore("cat cat cat cat meow meow hello hello hello hi hi ha");
		System.out.println(test2);
		System.out.println("max == " + test2.getMostFrequentToy());
		test2.sortToysByCount();
	
		
		
		
	}
}