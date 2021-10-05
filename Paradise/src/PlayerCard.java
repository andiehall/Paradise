
public class PlayerCard
	{

		private String name;
		private String wizardClass;
		private String weapon;
		
		public PlayerCard (String n, String c, String w)
		{
			name = n;
			wizardClass = c;
			weapon = w;
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