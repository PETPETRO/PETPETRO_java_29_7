
public class NaturalHand extends Hand {

	public enum Color {
		white, black, red
	}
	
	private Color color;

	
	public NaturalHand(int pocetPrstov, State state,Color color) {
		super(pocetPrstov, state);
		this.color=color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
	
}
