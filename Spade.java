/***
 * A spade is a PlayingCard that implements the beats() method
 * and the toString() in a manner that befits a spade.
 */
public class Spade extends PlayingCard {

	public Spade(int value, String rank) {
		super(value, rank);
	}

	public boolean beats(PlayingCard other) {
		if (other instanceof Spade) {
			if (this.getValue() > other.getValue()) {
				return true;
			}
			return false;
		}
		return true;
	}

	public String toString() {
		return this.getRank()+"S";
	}
}
