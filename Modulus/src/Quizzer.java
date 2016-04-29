import java.util.Scanner;

public class Quizzer
	{
		static int highQuestionNumbers=0;
		static int middleQuestionNumbers=0;
		static int age;
		static int points=0;
		static int userNumbers;
		static int modanswer = 0;
		static boolean gameContinues=true;

		public static void main(String[] args)
			{
				greetUser();
				playHighSchool();
				playFirst();
				determineanswer();
				while (gameContinues)
					{
						for (int i=0; i<userNumbers-1; i++)
							{
								makeHighquestions();
								determineanswer();
							}
						exit();
					}
			}
		public static void greetUser()
		{
			System.out.println("Hello and welcome to Quizzer- the interactive quiz game!");
			System.out.println("What is your name. Please input below.");
			Scanner userInput = new Scanner(System.in);
			String name = userInput.nextLine();
			System.out.println("Hello " + name + ". How old are you?");
			Scanner userInput1 = new Scanner(System.in);
			age=userInput1.nextInt();
		}
		public static void playHighSchool()
		{
			System.out.println("You will be playing the High School level questions.");
			System.out.println("How many questions would you like to play?");
			Scanner userInput = new Scanner(System.in);
			userNumbers=userInput.nextInt();
			highQuestionNumbers=userNumbers;
			System.out.println("You will be answering " + highQuestionNumbers + " questions in this quiz");
			System.out.println("These will be 'modulus' questions. The percent means to print the remainder.");
			System.out.println("The remainder of 7/3 is 1 because 3 goes into 7 twice with 1 left over.");
			System.out.println("Ready..... Set..... Go!");
		}
		public static void playFirst()
			{
				int mod1 = (int) (Math.random()*40)+1;
				int mod2 = (int) (Math.random()*20)+1;
				System.out.println(mod1 + " % " + mod1);
				modanswer = mod1 % mod1;
			}
		public static void makeHighquestions()
		{
			int mod1 = (int) (Math.random()*40)+1;
			int mod2 = (int) (Math.random()*20)+1;
			System.out.println(mod1 + " % " + mod2);
			modanswer = mod1 % mod2;
		}
		public static void determineanswer()
		{
			Scanner userInput12 = new Scanner(System.in);
			int response=userInput12.nextInt();
			if (response == modanswer)
			{
				System.out.println("Correct.");
				points=points+1;
				if (points==1)
					{
						System.out.println("You have " + points + " point.");
					}
				else if (points>1)
					{
						System.out.println("You have " + points + " points.");
					}
			}
			else if (response > modanswer || response < modanswer)
				{
					System.out.println("I'm sorry, that is incorrect. The correct answer is " + modanswer + ".");
					points=points+0;
					if (points==1)
						{
							System.out.println("You have " + points + " point.");
						}
					else if (points>1)
						{
							System.out.println("You have " + points + " points.");
						}
				}
		}
		public static void exit()
		{
			System.out.println("Thank you for playing Quizzer!");
			System.out.println("You ended up with a total of " + points + " points in this quiz. Good job.");
			System.exit(0);
		}


	}
