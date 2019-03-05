/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card newCard = new Card("king","hearts",5);
		Card newCard1 = new Card ("king", "spades", 3);
		System.out.println(newCard.toString());
		System.out.println(newCard.matches(newCard));
		System.out.println(newCard.matches(newCard1));
		System.out.println(newCard.suit());
		System.out.println(newCard.rank());
		System.out.println(newCard.pointValue());
		
	}
}
