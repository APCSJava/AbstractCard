/***
 * Represents a playing card.  Subclasses are expected to determine whether they
 * beat other cards, in addition to the best way to display themselves.
 */
public abstract class PlayingCard {
	
	private final String rank; // no one can change the rank, once set
	private final int value; // no one can change the value, once set

	public PlayingCard(int value, String rank) {
		this.rank = rank;
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getRank() {
		return rank;
	}
	
	// all subclasses MUST implement this or be declared abstract
	public abstract boolean beats(PlayingCard other);
	
	// all subclasses MUST implement this or be declared abstract
	public abstract String toString();

}
