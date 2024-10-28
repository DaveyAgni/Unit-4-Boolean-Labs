//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors(String player)
	{
		int compRand = (int)((Math.random()*3)+1);
		
		if(compRand == 1)
		{
			compChoice = "R";
		}
		if(compRand == 2)
		{
			compChoice = "P";
		}
		if(compRand == 3)
		{
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		String winner = "";

		if(playChoice == "R")
		{
			if(compChoice == "R")
			{
				winner = "tie"; 
			}
			if(compChoice == "S")
			{
				winner =  "computer wins";
			}
			if(compChoice == "P")
			{
				return "player wins";
			}
		}
		if(playChoice == "S")
		{
			if(compChoice == "R")
			{
				winner =  "computer wins"; 
			}
			if(compChoice == "S")
			{
				winner =  "tie";
			}
			if(compChoice == "P")
			{
				winner =  "player wins";
		}
		if(playChoice == "P")
		{
			if(compChoice == "R")
			{
				winner = "computer wins"; 
			}
			if(compChoice == "S")
			{
				winner =  "player wins";
			}
			if(compChoice == "P")
			{
				winner =  "tie";
			}
		}

	}
		return winner;
}

	public String toString()
	{
		String output=determineWinner();
		return output;
	}
}
