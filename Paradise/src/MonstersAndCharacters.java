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
