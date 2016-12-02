import java.util.Arrays;
import java.util.Collections;
/***
 * Performs useful operations on a deck of cards.   You should not 
 * need to modify any code in this class.
 */
public class Dealer {
	
	/**
	 * Upon receiving a reference to a deck of PlayingCards,
	 * shuffles the deck located at that reference.  This destroys
	 * (mutates) the original order of the cards referenced
	 * by the parameter.  Not always appropriate.
	 * 
	 * @param deck an array of PlayingCards
	 */
	public static void shuffle(PlayingCard[] deck) {
		Collections.shuffle(Arrays.asList(deck));
	}
	
	/**
	 * This method preserves the original order of the cards by
	 * first making a copy of the array.  Making a copy entails
	 * creating an array of suitable length and then performing
	 * a one-by-one assignment of references from the original
	 * array into the new copy.
	 * 
	 * @param deck an array of PlayingCards
	 * @return a new array with the references in different order
	 */
	public static PlayingCard[] shuffledCopy(PlayingCard[] deck) {
		PlayingCard[] copy = new PlayingCard[deck.length];
		for (int i = 0; i<deck.length; i++) {
			copy[i] = deck[i];
		}
		shuffle(copy);
		return copy;
	}
	
	/**
	 * Prints to standard output the cards, in order
	 * @param deck
	 */
	public static void printDeck(PlayingCard[] deck) {
		System.out.println(Arrays.asList(deck));
	}

}
