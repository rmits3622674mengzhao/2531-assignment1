import java.util.*;
import java.util.Scanner;



public class Game 
{
   public void minigame () {  
	   
	   System.out.println("Welcome to the Game - Paper, Scissors and Rock"+"\n");
	   System.out.println("How many rounds would you like to play?");
	   
	   
	 
	   Scanner reader =new Scanner(System.in);
	   int userchoice=reader.nextInt();
	   while (userchoice <0 || userchoice>2)
	   {System.out.println("Invalid, please input again!");}
	   
	   
	   int Playrounds = 0;
	   Playrounds = reader.nextInt();
	   
	  
	   while (Playrounds <= 0)
	   System.out.println("Invaild, please input again!");
	
	   System.out.println("0=paper;1=scissors;2=rock");
	   
	   for (int round = 1; round<=Playrounds; round++)
	   {
		   
	   Random input = new Random();//Random number generator

	   
	   int programchoice = input.nextInt();
	   int numRounds = 0;//records how many rounds have been played
	   int roundsWon = 0;//records how many rounds the user win
     


	   
	   	   
if (userchoice==programchoice)//when same items selected, it's a draw
{
	   if(userchoice==0)
	  {System.out.println("Both players chose paper, it's a draw."); numRounds++;}	   
      else if (userchoice==1)
      {System.out.println("Both players chose scissors, it's a draw.");numRounds++;}
	 else 
	 {System.out.println("Both players chose rock, it's a draw.");numRounds++;}
	   
}
	
   
else if (userchoice != programchoice)
	   {
		   if(userchoice==0 && programchoice==1)
	   {System.out.println("program wins: scissors cut paper");numRounds++;}
		   
	   else if (userchoice ==0 && programchoice==2)
	   {System.out.println("user wins: paper wraps rock");numRounds++;roundsWon++;} 

       else if(userchoice ==1 && programchoice==2)
	   {System.out.println("program wins: rock blunts scissors");numRounds++;}
		
	   else if (userchoice ==1 && programchoice==0)
	   {System.out.println("user wins: scissors cut paper");numRounds++;roundsWon++;}
	   }

		
else 
      {
		if (userchoice ==2 && programchoice==0)
		{System.out.println("program wins: paper wraps rock");numRounds++;}
		
		else if (userchoice==2 && programchoice==1)
		{System.out.println("user wins: rock blunts scissors");numRounds++;roundsWon++;}
      }

//Final Results
System.out.println("Congratulations, you have played numRounds rounds and won roundsWon rounds");
}	
}
}	   
	   
	
