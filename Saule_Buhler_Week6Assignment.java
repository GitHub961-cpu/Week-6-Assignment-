//Saule Buhler
import java.util.Scanner; //imported 
import java.lang.Math;
public class Saule_Buhler_Week6Assignment 
{
	public static void main(String[] args) 
	{
		//instantiated scanner and random 
		Scanner input = new Scanner(System.in);
		
		//part 1
		System.out.printf("----------------------------------------------------------------------\n");
		System.out.println("Part 1: for loop: Average of randomly generated integers");
		System.out.printf("----------------------------------------------------------------------\n");
		
		//declare and initialize variables for part 1
		int bottomRange = 0;
		int topRange = 0;
		int howManyNum = 0;
		int random = 0;
		int average = 0;
		int sum = 0;
		
		//user prompt 
		System.out.print("Enter the bottom number of the range: ");
		bottomRange = input.nextInt();
		System.out.print("Enter the top number of the range: ");
		topRange = input.nextInt();
		System.out.print("Enter How Many Numbers to Generate: ");
		howManyNum = input.nextInt();
		
		//display on the screen
		System.out.print("Generated Random Numbers: ");
		
		//for loop
		for (int i = 1; i <= howManyNum; i++) 
		{
			random = (int)((Math.random()*(topRange-bottomRange)+1)+bottomRange);
			System.out.print(random + " ");
			sum = sum + random;
		}//end loop
		
		//calculate average and display 
		average = sum/howManyNum;
		System.out.println("\nAverage of generated numbers: " + average);
		System.out.printf("----------------------------------------------------------------------\n");
		
		//part 2
		System.out.printf("Part 2: while loop: Average of user-entered integers using While loop\n");
		System.out.printf("----------------------------------------------------------------------\n");
		System.out.println("Enter integers to average. Enter -1 to finish.");
		
		//declare and initialize variables for part 2
		int entry = 0;
		int totalSum = 0;
		int totalNum = 0;
		
		//while loop
		while(entry != -1)
		{
			System.out.print("Entry ");
			entry = input.nextInt();
			totalSum = totalSum + entry;
			totalNum ++;
		}//end loop 
		
		//display total of numbers 
		totalNum--;
		System.out.println("Number of entries: " + totalNum);
		
		//decision 
		if(totalNum > 0)
		{
			System.out.println("Average of user-entered numbers: " + totalSum/totalNum);
		}
		//part 3
		System.out.printf("----------------------------------------------------------------------\n");
		System.out.println("Part 3: do-while loop: Display menu until user chooses to exit");
		System.out.printf("----------------------------------------------------------------------\n");
		
		//declare and initialize variables for part 2
		boolean quit = false;
		int choice;
		
		do //do while loop
		{
			displayMenu();
			choice = input.nextInt();
			switch(choice) 
			{
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				quit = true; 
				break;
			default:
				System.out.println("Invalid choice.");
			}
		}while(!quit); //end loop
		
		//display goodbye 
			System.out.println("\nGoodBye!");
		input.close();
	}

	//method 
	private static void displayMenu()
	{
		System.out.printf("==============================\n MENU\n");
		System.out.printf("==============================\n");
		System.out.printf(" 1: Choice 1\n 2: Choice 2\n 3: Choice 3\n 4: Exit\n");
		System.out.printf("==============================\n");
		System.out.print("Enter 1, 2, 3 or 4 to Exit: ");
		System.out.printf("\n==============================\n");
	}
}
