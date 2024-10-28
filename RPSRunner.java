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
		
		do{
		
			out.print("type in your prompt [R,P,S] :: ");
			String player = keyboard.nextLine().toUpperCase();
		
			RockPaperScissors game = new RockPaperScissors(player);
			System.out.println(game.toString);		

			out.print("Play again? : Y/N");
			response = keyboard.nextLine().toLowerCase().charAt(0);
		
		} while (response == 'Y');

		keyboard.close();
		

	}
}

