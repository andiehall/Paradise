import java.util.Scanner;
import java.util.ArrayList;
public class PlayerInfo
	{
		static PlayerCard player = new PlayerCard("-", "-", "-");
		
		public static void introducingPlayer()
			{
				System.out.println("THE ISLES OF PARADISE! *~");
				System.out.println(" ");
				Scanner greetUser = new Scanner(System.in);
				System.out.println("Hello Player! What is your name?");
				player.setName(greetUser.nextLine());	
				System.out.println("\nHello " + player.getName() + "!");
			
			}
		
		public static void settingClass()
			{
				System.out.println(" ");
				Scanner wizardOrWitch = new Scanner(System.in);
				System.out.println("Would you like to be a witch or a wizard?");
				String witchOrWizard = wizardOrWitch.nextLine();
				
					if (witchOrWizard.toLowerCase().equals("wizard"))
						{
							player.setWizardClass("Wizard");
							System.out.println("You have chosen the " + player.getWizardClass() + " class!");
							Cosmetics.WizardArt();
						}
					else if (witchOrWizard.toLowerCase().equals("witch"))
						{
							player.setWizardClass("Witch");
							System.out.println("You have chosen the " + player.getWizardClass() + " class!");
							Cosmetics.WitchArt();
						}
					else 
						{
							System.out.println("Invalid Answer. Try again.");
							settingClass();
						}
					
				}
		
		public static void weaponOfChoice()
		{
			System.out.println(" ");
			Scanner broomOrStaff = new Scanner(System.in);
			System.out.println("Which magical weapon will you use? \nA Broom or Staff?");		
			String magicalWeapon = broomOrStaff.nextLine();
			
			if (magicalWeapon.toLowerCase().equals("broom"))
				{
					player.setWeapon("Broom");
					System.out.println("You have chosen a " + player.getWeapon() + " as your weapon!");
				}
			else if (magicalWeapon.toLowerCase().equals("staff"))
				{
					player.setWeapon("Staff");
					System.out.println("You have chosen a " + player.getWeapon() + " as your weapon!");
				}
			else 
				{
					System.out.println("Invalid Answer. Try again.");
					weaponOfChoice();
				}
					
		}
		
		public static void DisplayCard()
		{
			System.out.println(" ");
			System.out.println("Your Player Display Card \n╔═══════════════════════════════╗");
			System.out.println("Your Name is: " + player.getName() + "\nYour Wizarding Class is: " + player.getWizardClass() + "\nYour Weapon of Choice is: " + player.getWeapon());
			System.out.println("╚═══════════════════════════════╝");
		}
		
	}
