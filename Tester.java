/***
 * Tests a deck of playing cards for proper operation.
 */
public class Tester {

	private static int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

	public static void main(String[] args) {
		PlayingCard [] deck = new PlayingCard[52];
		for (int i = 0; i<13; i++) {
			deck[i] = new Spade(values[i], ranks[i]);
		}
		// TODO initialize other suits in the deck here
		PlayingCard card1 = deck[1];
		PlayingCard card2 = deck[12];
		System.out.println("Checking "+card1+" beats "+ card2+": "+card1.beats(card2));
		System.out.println("Checking "+card2+" beats "+ card1+": "+card2.beats(card1));
		System.out.println("Checking "+card1+" beats "+ card1+": "+card1.beats(card1));
		// TODO add other tests here
		// TODO shuffle the cards
		
		// should print a shuffled deck with no nulls
		for (PlayingCard card: deck) {
			System.out.println(card);
		}
	}

}
