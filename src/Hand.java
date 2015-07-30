
public class Hand {

	private int pocetPrstov;

	public enum State {
		left, right
	}

	private State state;

	public Hand(int pocetPrstov, State state) {
		this.pocetPrstov = pocetPrstov;
		this.state = state;
	}

	public int getPocetPrstov() {
		return pocetPrstov;
	}

	public void setPocetPrstov(int pocetPrstov) {
		this.pocetPrstov = pocetPrstov;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
