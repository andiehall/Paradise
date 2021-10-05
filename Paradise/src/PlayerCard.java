
public class PlayerCard
	{

		private String name;
		private String wizardClass;
		private String weapon;
		private int strength;
		private int level;
		private int experience;
		
		public PlayerCard (String n, String c, String w, int s, int l, int e)
		{
			name = n;
			wizardClass = c;
			weapon = w;
			strength = s;
			level = l;
			experience = e;
		}

		public int getExperience()
			{
				return experience;
			}

		public void setExperience(int experience)
			{
				this.experience = experience;
			}

		public int getLevel()
			{
				return level;
			}

		public void setLevel(int level)
			{
				this.level = level;
			}

		public int getStrength()
			{
				return strength;
			}

		public void setStrength(int strength)
			{
				this.strength = strength;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getWizardClass()
			{
				return wizardClass;
			}

		public void setWizardClass(String wizardClass)
			{
				this.wizardClass = wizardClass;
			}

		public String getWeapon()
			{
				return weapon;
			}

		public void setWeapon(String weapon)
			{
				this.weapon = weapon;
			}
		
		
	}