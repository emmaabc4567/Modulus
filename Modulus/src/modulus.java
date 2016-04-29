import java.util.Scanner;

public class modulus
	{

		public static void main(String[] args)
			{
				askEven();
				findLeapYear();
				printArray();
				playFizz();
			}
		public static void askEven()
		{
			System.out.println("Hello there! Please give me a number.");
			Scanner userInput = new Scanner(System.in);
			int number = userInput.nextInt();
			if (number%2==0)
				{
					System.out.println("Even");
				}
			else if (number%2==1)
				{
					System.out.println("Odd");
				}
			System.out.println();
		}
		public static void findLeapYear()
		{
			System.out.println("What is your favorite year?");
			Scanner userInput = new Scanner(System.in);
			int year = userInput.nextInt();
			if (year%4==0)
				{
					System.out.println("That year was a leap year.");
				}
			else 
				{
					System.out.println("February only had 28 days. It was not a leap year.");
				}
			System.out.println();
		}
		public static void printArray()
		{
			int [] numbers = {2,5,-7,1,3,12,19,-16,4,20};
			for (int i=0; i<numbers.length; i++)
				{
					if (i%3==0)
						{
							System.out.println(numbers[i]);
						}
				}
			System.out.println();
		}
		public static void playFizz()
		{
			for (int i=1; i<=100; i=i+1)
				{
					if (i%3==0&&i%5==0)
						{
							System.out.println("FizzBuzz");
						}
					else if (i%3==0)
						{
							System.out.println("Fizz");
						}
					else if (i%5==0)
						{
							System.out.println("Buzz");
						}
					else
						{
							System.out.println(i);
						}				
					}
		}
		

	}
