import java.util.ArrayList;
import java.util.Scanner;

public class RouteChooser
	{

		public static ArrayList<MonstersAndCharacters> newMonsters = new ArrayList<MonstersAndCharacters>();
		
		public static void mainInterface()
			{addingMonsters();
				System.out.println(" ");
				Scanner userInput = new Scanner(System.in);
				System.out.println("What would you like to do?");
				System.out.println("(1) Route A [Easy] \n(2) Route B [Normal] \n(3) Route C [Hard] \n(4) Display your Player Card \n(5) End Game");
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
						mainInterface();
						break;
					case 5:
						System.out.println("Thank you for playing " + PlayerInfo.player.getName() + "!");
						System.exit(0);
					default:
						System.out.println("Invalid Answer Try Again");
						mainInterface();
						break;
				}
			}		
		public static void addingMonsters()
		{
			
			newMonsters.add(new MonstersAndCharacters("Vexhound", 45, "Teeth"));
			newMonsters.add(new MonstersAndCharacters("NightFreak", 75, "Club"));
			newMonsters.add(new MonstersAndCharacters("The Gray Jackel", 100, "Minions"));
				
		}
		public static void battle1()
			{
				System.out.println(" ");
				Scanner battleFace = new Scanner(System.in);
				System.out.println("You have encountered a " + newMonsters.get(0).getMonsterName() + "\nWhat will you do? \n(1) Attack \n(2) Run");
				int attackOrRun = battleFace.nextInt();
				
				if(attackOrRun == 1)
				{
					System.out.println(" ");
					PlayerInfo.player.setLevel(PlayerInfo.player.getLevel()+1);
					PlayerInfo.player.setStrength(PlayerInfo.player.getStrength()+10);
					System.out.println("You have slain the " + newMonsters.get(0).getMonsterName() + "! \nCongrats! You have leveled up to: " + PlayerInfo.player.getLevel());
					mainInterface();
				}
				else if(attackOrRun == 2)
				{
					System.out.println(" ");
					System.out.println("Coward. You have not leveled up.");
					mainInterface();
				}
				else
				{
					System.out.println(" ");
					System.out.println("Invalid Answer Try Again");
					battle1();
				}
			}
		
		public static void battle2()
		{
			System.out.println(" ");
			Scanner battleFace = new Scanner(System.in);
			System.out.println("You have encountered a " + newMonsters.get(1).getMonsterName() + "\nWhat will you do? \n(1) Attack \n(2) Run");
			int attackOrRun = battleFace.nextInt();
			
			if(attackOrRun == 1)
			{
				Scanner extraTurn = new Scanner(System.in);
				System.out.println("You have damaged the " + newMonsters.get(1).getMonsterName() + "\nIt is now at half health, \nbut you are also at half health. \nWould you like to \n(1) Attack \n(2) Run?");
				int secondAttackOrRun = battleFace.nextInt();
								
					if(secondAttackOrRun == 1)
						{
							System.out.println(" ");
							PlayerInfo.player.setLevel(PlayerInfo.player.getLevel()+2);
							PlayerInfo.player.setStrength(PlayerInfo.player.getStrength()+20);
							System.out.println("You have slain the " + newMonsters.get(1).getMonsterName() + "! \nCongrats! You have leveled up to: " + PlayerInfo.player.getLevel());
							mainInterface();
						}
					else if(secondAttackOrRun == 2)
						{
							System.out.println(" ");
							System.out.println("Coward. You have not leveled up.");
							mainInterface();
						}
					else
					{
						System.out.println(" ");
						System.out.println("Invalid Answer Try Again");
						battle2();
					}
				
			}
			else if(attackOrRun == 2)
			{
				System.out.println(" ");
				System.out.println("Coward. You have not leveled up.");
				mainInterface();
			}
			else
			{
				System.out.println(" ");
				System.out.println("Invalid Answer Try Again");
				battle2();
			}
		}
		
		public static void battle3()
		{
			System.out.println(" ");
			Scanner battleFace = new Scanner(System.in);
			System.out.println("You have encountered a " + newMonsters.get(2).getMonsterName() + "\nWhat will you do? \n(1) Attack \n(2) Run");
			int attackOrRun = battleFace.nextInt();
			
			if(attackOrRun == 1)
			{
				System.out.println(" ");
				Scanner extraTurn = new Scanner(System.in);
				System.out.println("You have damaged the " + newMonsters.get(2).getMonsterName() + "\nIt is now at 1/3 of it's health, \nbut you are also damaged. \nWould you like to \n(1) Attack \n(2) Run?");
				int secondAttackOrRun = battleFace.nextInt();
								
					if(secondAttackOrRun == 1)
						{
						System.out.println(" ");
						Scanner thirdTurn = new Scanner(System.in);
						System.out.println("You have damaged the " + newMonsters.get(2).getMonsterName() + "\nIt is now at critical health, \nbut you are also at critical health. \nWould you like to \n(1) Attack \n(2) Run?");
						int thirdAttackOrRun = battleFace.nextInt();
										
							if(thirdAttackOrRun == 1)
								{
								System.out.println(" ");
									PlayerInfo.player.setLevel(PlayerInfo.player.getLevel()+3);
									PlayerInfo.player.setStrength(PlayerInfo.player.getStrength()+30);
									System.out.println("You have slain the " + newMonsters.get(2).getMonsterName() + "! \nCongrats! You have leveled up to: " + PlayerInfo.player.getLevel());
									mainInterface();
								}
							else if(thirdAttackOrRun == 2)
								{
								System.out.println(" ");
									System.out.println("Coward. You have not leveled up.");
									mainInterface();
								}
							else
							{
								System.out.println(" ");
								System.out.println("Invalid Answer Try Again");
								battle3();
							}
						}
					else if(secondAttackOrRun == 2)
						{
						System.out.println(" ");
							System.out.println("Coward. You have not leveled up.");
							mainInterface();
						}
					else
					{
						System.out.println(" ");
						System.out.println("Invalid Answer Try Again");
						battle3();
					}
				
			}
			else if(attackOrRun == 2)
			{
				System.out.println(" ");
				System.out.println("Coward. You have not leveled up.");
				mainInterface();
			}
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
				
				battle1();
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
				
				battle2();
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
				
				battle3();
			}


	}
