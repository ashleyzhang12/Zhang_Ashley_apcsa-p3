//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		do
		{
			String player = "";
			String comp = "";
		
			out.println("type in your prompt [R,P,S] :: ");
			
			//read in the player value
			player = keyboard.next();
			
		
			
			
			RockPaperScissors game = new RockPaperScissors(player);
			System.out.println(game);
			
			out.println("Do you want to play again?");
			response = keyboard.next().charAt(0);
			
		} while (response == 'y');
			
			
	}
}



