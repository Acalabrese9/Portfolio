/***************************************************************************
                                                                                                                                                                                                                             
Name: Adam Calabrese                                                                                 
Class: CSCI 215 Section 1                                                                          
Instructor: Gao                                                                                          
Due Date:  Oct 13, 2016                                                                           
Note:  This program is a product of the student. I did not work with anyone
****************************************************************************/

/***************************************************************************
In this program, we are making a program that generates a sequence of 20 random
die tosses in an array. The program will then print the die values. Every value
that is the same or that "runs" the program will put them in parenthesis. For
example the values will look like: 1 5 6 (4 4 4) (2 2) 5 3 1 5 2 1 (3 3) 4 1
****************************************************************************/
import java.util.Random; //Imports random pacakge for dice 
public class Assign3 {
	public static int flip; //Initializes the number of die rolls
	public static Random dice = new Random(); 
	public static void braces()
	{
		int[] num = new int[flip];	//Array 
		
		for(int i = 0; i < num.length; i++) 
			num[i] = dice.nextInt(6) + 1;
		
		
		if(num[0] == num[1])//index begins at 0 
			System.out.print("(" + num[0]); 
		else
			System.out.print(num[0]);
		for(int i = 1; i < num.length - 1; i++) //Processing array in for loop
		{
			if(num[i] == num[i+1] && num[i] != num[i-1])
				System.out.print("(" + num[i]); //Printing beginning ( for numbers running 
			else if(num[i-1] == num[i])
			{
				if(num[i] == num[i+1])
					System.out.print(num[i]);
				else if(num[i] != num[i+1])
					System.out.print(num[i] + ")"); // Printing ending ) for numbers running
			}
			else
				System.out.print(num[i]);
		}
		if(num[flip - 2] == num[flip - 1])//index ends 
			System.out.print(num[flip - 1] + ")");
		else
			System.out.print(num[flip - 1]);
	}
	public static void toss(int num)
	{
		flip = num; //Used incase the numbers of die tosses is to be changed 
	}
}