//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = "";
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int num = (int)Math.random() *3;
		if (num == 0)
		{
			compChoice = "R";
		}
		else if (num == 1)
		{
			compChoice = "P";
		}
		else
		{
			compChoice = "S";
		}
	}
	
	public String getComp()
	{
		return "computer had " + compChoice;
		
	}
	
	public String getPlayer()
	{
		return "player had " + playChoice;
	}
	


	public String determineWinner()
	{
		String winner="";
		if (playChoice.equals("R") && compChoice.equals("P"))
		{
			winner = "!Computer wins <<Paper Covers Rock>>!";
		}
		else if (playChoice.equals("R") && compChoice.equals("S"))
		{
			winner = "!Player wins <<Rock breaks Scissors>>!";
		}
		else if (playChoice.equals("P") && compChoice.equals("S"))
		{
			winner = "!Computer wins << Scissors cut Paper>>!";
		}
		else if(playChoice.equals("P") && compChoice.equals("R"))
		{
			winner = "!Player wins <<Paper Covers Rock>>!";
		}
		else if (playChoice.equals("S") && compChoice.equals("P"))
		{
			winner = "!Player wins <<Scissors cut Paper>>!";
		}
		else if (playChoice.equals("S") && compChoice.equals("R"))
		{
			winner = "!Computer wins <<Rock breaks Scissors>>!";
		}
		else
		{
			winner = "!Draw Game!";
		}
		return winner;
	}

	public String toString()
	{
		String output = getPlayer() + "\n" + getComp() + "\n" + determineWinner();
		return output;
	}
}