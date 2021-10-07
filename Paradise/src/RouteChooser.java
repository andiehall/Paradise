import java.util.Scanner;

public class RouteChooser
	{

		public static boolean ifBattling;
		public static boolean ifPlaying;
		public static int turnCounter;
		
		public static void mainInterface()
			{
				System.out.println(" ");
				Scanner userInput = new Scanner(System.in);
				System.out.println("What would you like to do?");
				System.out.println("(1) Route A \n(2) Route B \n(3) Route C \n(4) Display your Player Card");
				int routeChooser = userInput.nextInt();
				
				switch (routeChooser)
				{
					case 1:
						RouteA();
						break;
					case 2:
						RouteB();
						break;
					case 3:
						RouteC();
						break;
					case 4:
						PlayerInfo.DisplayCard();
						break;
					default:
						System.out.println("Invalid Answer Try Again");
						mainInterface();
						break;
				}
			}		
		
		public static void battle1()
			{
				Scanner battleFace = new Scanner(System.in);
				System.out.println("You have encountered a " + MonstersAndCharacters.newMonsters.get(0).getMonsterName + "\nWhat will you do?");
			}
		
		public static void RouteA()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println(" ");
				System.out.println("You have choosen Route A. \nWould you like to turn back?");
				String yesOrNo = userInput.nextLine();
				
				if(yesOrNo.toLowerCase().equals("no"))
					{
						System.out.println("Sweet lets go.");
					}
				else if(yesOrNo.toLowerCase().equals("yes"))
					{
						mainInterface();
					}
				else
					{
						System.out.println("Invalid Answer Try Again");
						RouteA();
					}
			}
		
		public static void RouteB()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println(" ");
				System.out.println("You have choosen Route B. \nWould you like to turn back?");
				String yesOrNo = userInput.nextLine();
				
				if(yesOrNo.toLowerCase().equals("no"))
					{
						System.out.println("Sweet lets go.");
					}
				else if(yesOrNo.toLowerCase().equals("yes"))
					{
						mainInterface();
					}
				else
					{
						System.out.println("Invalid Answer Try Again");
						RouteB();
					}
			}
		
		public static void RouteC()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println(" ");
				System.out.println("You have choosen Route C. \nWould you like to turn back?");
				String yesOrNo = userInput.nextLine();
				
				if(yesOrNo.toLowerCase().equals("no"))
					{
						System.out.println("Sweet lets go.");
					}
				else if(yesOrNo.toLowerCase().equals("yes"))
					{
						mainInterface();
					}
				else
					{
						System.out.println("Invalid Answer Try Again");
						RouteC();
					}
			}


	}
