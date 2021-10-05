import java.util.ArrayList;
import java.lang.Math;

public class MonstersAndCharacters
	{
		
		private String monsterName;
		private int strength;
		private String monsterWeapon;
		
		public MonstersAndCharacters (String m, int s, String mw)
		{
			monsterName = m;
			strength = s;
			monsterWeapon = mw;
		}

		public static void addingMonsters()
		{
			
			ArrayList<MonstersAndCharacters> newMonsters = new ArrayList<MonstersAndCharacters>();
			
			newMonsters.add(new MonstersAndCharacters("Vexhound", 45, "Teeth"));
			newMonsters.add(new MonstersAndCharacters("NightFreak", 75, "Club"));
			newMonsters.add(new MonstersAndCharacters("The Gray Jackel", 100, "Minions"));
				
		}
		
			

		public String getMonsterName()
			{
				return monsterName;
			}

		public void setMonsterName(String monsterName)
			{
				this.monsterName = monsterName;
			}

		public int getStrength()
			{
				return strength;
			}

		public void setStrength(int strength)
			{
				this.strength = strength;
			}

		public String getMonsterWeapon()
			{
				return monsterWeapon;
			}

		public void setMonsterWeapon(String monsterWeapon)
			{
				this.monsterWeapon = monsterWeapon;
			}
	
		
	}
