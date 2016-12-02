/***
 * A Spade is a specific type of PlayingCard.  In some games,
 * such as "Spades" it serves as a "trump" card, beating all
 * other suit types, regardless of their value.
 */
public class Spade extends PlayingCard {

	/**
	 * Since this class does not define any new fields, simply
	 * use the constructor arguments provided in the call to
	 * the superclass constructor.
	 * 
	 * @param value the card's relative value, based on its rank
	 * @param rank the face value shown on the card
	 */
	public Spade(String rank, int value) {
		// TODO call the superclass constructor
	}

	/**
	 * If the other card is also a Spade, return whether
	 * this card has a higher value.  If the other card is not 
	 * a Spade, then this card beats it regardless of value
	 * @return whether this card beats the other card
	 */
	public boolean beats(PlayingCard other) {
		// TODO implement this method
		return false;
	}

	/**
	 * Get our rank and append an "S" to indicate our suit
	 */
	public String toString() {
		// TODO implement this method
		return null;
	}
}
