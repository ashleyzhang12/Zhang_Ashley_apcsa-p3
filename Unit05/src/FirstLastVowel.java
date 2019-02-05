//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String vowels = "aeiouAEIOU";
	   if (vowels.indexOf(a.charAt(0)) >= 0 || vowels.indexOf(a.charAt(a.length()-1)) >= 0)
	   {
		   return "yes";
	   }
	   else
	   {
		   return "no";
	   }
	}
}