
import java.util.Random;
import java.util.Scanner;



public class Rockpaperscissorlizardspock{
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Rockpaperscissorlizardspock obj1= new Rockpaperscissorlizardspock();
		obj1.playerselection();//calling main function to play the game
		
	}
	
	public void playerselection()
	{
		String playerselection;
		System.out.println("Waste an hour having fun"
				+"\n You are in Rock Paper Scissor Lizard Spock Game"
				+"\n Select the option how you want to play"
				+ "\n 1. Player vs Computer" 
				+ "\n 2. Computer vs Computer" 
				+ "\n 3. Different game each Time");
		
		
		playerselection= scanner.nextLine();
	
	if(playerselection.equals("1"))
	{
		playervscomputer();//calling option 1. Player vs Computer
	}
	else if(playerselection.equals("2"))//calling option 2. Computer vs Computer
	{
		computervscomputer(); }
	
	else if(playerselection.equals("3"))//calling option 3. Different game each Time
	{
		Differentgame();
	
				
	}
	}
	
	public void playervscomputer()
	{
		while(true) {
			String[] rpslk = {"r","p","s","l","k"};
			String computermove= rpslk[new Random().nextInt(rpslk.length)];
			String playermove;
			while(true)
			{
			System.out.println("Please enter your move(r for rock, p for paper, s for scissor, l for lizard, or k for spock)");
		    playermove = scanner.nextLine();
		    if(playermove.equals("r")||playermove.equals("p")||playermove.equals("s")||playermove.equals("l")||playermove.equals("k"))
		    {
		    break;//checking invalid input from user
		    }
			System.out.println(playermove + "is not a valid move.");
			}
			System.out.println("computer played" + " " + computermove);
			
			if(playermove.equals(computermove))
			{
				System.out.println("The game was a Tie!");
			}
			//checking all probabilities 
			else if(playermove.equals("r"))
			{
				if(computermove.equals("p"))
						{
					System.out.println("Paper grab the rock:You Lose!");
						}
			
			else if(computermove.equals("s"))
			{
			System.out.println("Rock crushes scissor:You Win!");
						
			}
				if(computermove.equals("l"))
				{
			System.out.println("Rock crushes lizard:You win!");
				}
	
	else if(computermove.equals("k"))
	{
	System.out.println("Spock vaporises rock:You lose!");
				
	}
			}
			else if(playermove.equals("p"))
			{
				if(computermove.equals("r"))
						{
					System.out.println("Paper grab rock:You Win!");
						}
			
			else if(computermove.equals("s"))
			{
			System.out.println("Scissor cuts paper:You Lose!");
						
			}
				if(computermove.equals("l"))
				{
			System.out.println("Lizard eats paper:You lose!");
				}
	
	else if(computermove.equals("k"))
	{
	System.out.println("Paper disproves spock:You win!");
				
	}
			}
			else if(playermove.equals("s"))
			{
				if(computermove.equals("p"))
				{
					System.out.println("Scissor cuts paper:You Win!");
						}
			
			    else if(computermove.equals("r"))
			    { 
			      System.out.println("Rock crushes scissor:You Lose!");
						
			   }
				if(computermove.equals("l"))
				{
					System.out.println("Scissor decapitates lizard:You Win!");
						}
			
			    else if(computermove.equals("k"))
			    { 
			      System.out.println("Spock smashes scissors:You Lose!");
						
			   }
			}
			else if(playermove.equals("l"))
			{
				if(computermove.equals("p"))
				{
					System.out.println("Lizard eats paper:You Win!");
						}
			
			    else if(computermove.equals("r"))
			    { 
			      System.out.println("Rock crushes lizard:You Lose!");
						
			   }
				if(computermove.equals("s"))
				{
					System.out.println("Scissor decapitates lizard:You lose!");
						}
			
			    else if(computermove.equals("k"))
			    { 
			      System.out.println("Lizard poisons spock:You win!");
						
			   }
			}
			else if(playermove.equals("k"))
			{
				if(computermove.equals("p"))
				{
					System.out.println("Paper disproves spock:You Lose!");
						}
			
			    else if(computermove.equals("r"))
			    { 
			      System.out.println("Spock vaporises rock:You Win!");
						
			   }
				if(computermove.equals("s"))
				{
					System.out.println("Spock smashes scissors:You Win!");
						}
			
			    else if(computermove.equals("l"))
			    { 
			      System.out.println("Lizard poisons spock:You Lose!");
						
			   }
			}
			  
			    System.out.println("want to continue with the same game? (y/n)");
			    String playagain= scanner.nextLine();
			
			if(!playagain.equals("y"))
			{  
				System.out.println("You quit the game!");
				break;
			}
			
		
		 }
			
			}
	
	

	public void computervscomputer()
	{
		while(true) {
			String[] rpslk1 = {"r","p","s","l","k"};
			String computer1move= rpslk1[new Random().nextInt(rpslk1.length)];
			String[] rpslk2 = {"r","p","s","l","k"};
			String computer2move= rpslk2[new Random().nextInt(rpslk2.length)];
			
			
			System.out.println("computer1 played" + " " + computer1move);
			System.out.println("computer2 played" + " " + computer2move);
			
			if(computer1move.equals(computer2move))
			{
				System.out.println("The game was a Tie!");
			}
			//checking all probabilities
			else if(computer1move.equals("r"))
			{
				if(computer2move.equals("p"))
						{
					System.out.println("Paper grab the rock:Computer2 win!");
						}
			
			else if(computer2move.equals("s"))
			{
			System.out.println("Rock crushes scissor:Computer1 Win!");
						
			}
				if(computer2move.equals("l"))
				{
			System.out.println("Rock crushes lizard:Computer1 win!");
				}
	
	else if(computer2move.equals("k"))
	{
	System.out.println("Spock vaporises rock:Computer2 win!");
				
	}
			}
			else if(computer1move.equals("p"))
			{
				if(computer2move.equals("r"))
						{
					System.out.println("Paper grab rock:Computer1 win!");
						}
			
			else if(computer2move.equals("s"))
			{
			System.out.println("Scissor cuts paper:Computer2 win!");
						
			}
				if(computer2move.equals("l"))
				{
			System.out.println("Lizard eats paper:Computer2 win!");
				}
	
	else if(computer2move.equals("k"))
	{
	System.out.println("Paper disproves spock:Computer1 win!");
				
	}
			}
			else if(computer1move.equals("s"))
			{
				if(computer2move.equals("p"))
				{
					System.out.println("Scissor cuts paper:Computer1 win!");
						}
			
			    else if(computer2move.equals("r"))
			    { 
			      System.out.println("Rock crushes scissor:Computer2 win!");
						
			   }
				if(computer2move.equals("l"))
				{
					System.out.println("Scissor decapitates lizard:Computer1 win!");
						}
			
			    else if(computer2move.equals("k"))
			    { 
			      System.out.println("Spock smashes scissors:Computer2 win!");
						
			   }
			}
			else if(computer1move.equals("l"))
			{
				if(computer2move.equals("p"))
				{
					System.out.println("Lizard eats paper:Computer1 win!");
						}
			
			    else if(computer2move.equals("r"))
			    { 
			      System.out.println("Rock crushes lizard:Computer2 win!");
						
			   }
				if(computer2move.equals("s"))
				{
					System.out.println("Scissor decapitates lizard:Computer2 win!");
						}
			
			    else if(computer2move.equals("k"))
			    { 
			      System.out.println("Lizard poisons spock:Computer1 win!");
						
			   }
			}
			else if(computer1move.equals("k"))
			{
				if(computer2move.equals("p"))
				{
					System.out.println("Paper disproves spock:Computer2 win!");
						}
			
			    else if(computer2move.equals("r"))
			    { 
			      System.out.println("Spock vaporises rock:Computer1 win!");
						
			   }
				if(computer2move.equals("s"))
				{
					System.out.println("Spock smashes scissors:Computer1 win!");
						}
			
			    else if(computer2move.equals("l"))
			    { 
			      System.out.println("Lizard poisons spock:Computer2 win!");
						
			   }
			}
			
			System.out.println("want to continue with the same game? (y/n)");
			String playagain= scanner.nextLine();
			if(!playagain.equals("y"))
			{
                System.out.println("You quit the game!");
				break;
			}
		}
			
}
		
	
	
public void Differentgame()
		{
			String playeroption;
			while(true)
				{
				System.out.println("Do u want to play" +"\n 1.Player vs Computer" +"\n 2.Computer vs Computer" +"\n 3.Quit the game");
			    playeroption = scanner.nextLine();
			    if(playeroption.equals("1"))
				{
					playervscomputer();
				}
				else if(playeroption.equals("2"))
				{
					computervscomputer(); 
				}
				else if(playeroption.equals("3"))
				{
                    System.out.println("You quit the game!");
					break;
				}
			    
			    
			}
			
		
	
			}
		
			
	
}
