/**
 * This is a class that tests the Deck class.
 */


public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck test = new Deck(new String[] {"jack", "queen", "king"},
								new String[] {"blue", "red"}, 
								new int[] {11,12,13});
		System.out.println(test);
		System.out.println(test.deal());
		System.out.println(test);
		
		Deck test2 = new Deck(new String[] {"jack", "queen", "king", "ace", "two","three"},
						new String[] {"black", "red"},
						new int[] {1,2,3,4,5,6});
		System.out.println(test2);
		System.out.println(test2.deal());
		System.out.println(test2);
		
	}
}
