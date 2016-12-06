/***
 * Initializes and tests a deck of playing cards.
 */
public class Tester {

	// An example of "parallel arrays"
	// ranks[0] is related to values[0]
	// ranks[1] is related to values[1], etc.
	private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	private static final int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

	public static void main(String[] args) {
		PlayingCard [] deck = new PlayingCard[52];
		for (int i = 0; i<13; i++) {
			deck[i] = new Spade(ranks[i], values[i]);
		}
		// TODO initialize other suits in the deck here
		
		// Draw two cards and perform some comparisons
		PlayingCard card1 = deck[1];
		PlayingCard card2 = deck[12];
		System.out.println("Checking "+card1+" beats "+ card2+": "+card1.beats(card2));
		System.out.println("Checking "+card2+" beats "+ card1+": "+card2.beats(card1));
		System.out.println("Checking "+card1+" beats "+ card1+": "+card1.beats(card1));
		
		// TODO add other tests here
		
		// TODO call the printDeck() method of the Dealer class with your deck
		
		// TODO call the shuffle() method of the Dealer class with your deck
		
		// TODO call the printDeck() method again and verify the new ordering of cards
		
	}

}
