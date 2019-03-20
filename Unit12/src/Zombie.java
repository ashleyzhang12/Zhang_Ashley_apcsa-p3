
import java.lang.System.*;
public class Zombie implements Monster 
{
	//add instance variables	
		private String name;
		private int size;

		//add a constructor
		public Zombie()
		{
			name = "";
			size = 0;
		}
		public Zombie(String n, int s)
		{
			name = n;
			size = s;
		}

		//add code to implement the Monster interface
		public int getHowBig()
		{
			return size;
		}
		public String getName()
		{
			return name;
		}
		public boolean isBigger(Monster other)
		{
			if(this.getHowBig() > other.getHowBig())
				return true;
			else
				return false;
		}
		public boolean isSmaller(Monster other)
		{
			if(this.getHowBig() < other.getHowBig())
			return true;
			else
				return false;
		}
		public boolean namesTheSame(Monster other)
		{
			if (this.getName().equals(other.getName()) == true)
			return true;
			else
				return false;
		}

		//add a toString
		public String toString()
		{
			String output = "";
			output = getName() + " " + getHowBig();
			return output;
			
		}
}
