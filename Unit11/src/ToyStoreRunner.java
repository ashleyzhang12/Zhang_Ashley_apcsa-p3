//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore test = new ToyStore("sorry sorry sorry sorry bat train teddy ball ball");
		test.sortToysByCount();
		System.out.println(test);
		System.out.println(test.getMostFrequentToy());
		
		ToyStore test2 = new ToyStore("cat cat cat cat hello hello hi hi hi ball ball");

	}
}