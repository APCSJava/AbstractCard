import java.util.Arrays;
import java.util.Collections;

public class Dealer {
	
	/**
	 * Upon receiving a reference to a deck of PlayingCards,
	 * shuffles the deck at that reference.  This destroys
	 * (mutates) the original order of the cards referenced
	 * by the parameter.  Not always appropriate.
	 * 
	 * @param deck an array of PlayingCards
	 */
	public static void shuffle(PlayingCard[] deck) {
		Collections.shuffle(Arrays.asList(deck));
	}

}
