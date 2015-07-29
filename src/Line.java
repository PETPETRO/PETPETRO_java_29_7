
public class Line extends Shape {

	private int length;
	private boolean vertical;

	public Line(int length, boolean vertical) {
		this.length = length;
		this.vertical = vertical;
	}

	public Line(int x, int y, char fill, int length, boolean vertical) {
		super(x, y, fill);
		this.length = length;
		this.vertical = vertical;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isVertical() {
		return vertical;
	}

	public void setVertical(boolean vertical) {
		this.vertical = vertical;
	}

	public String toString() {
		String line = "";
		for (int y = 0; y < this.getY(); y++) {
			line += "\n";
		}

		if (vertical) {

			for (int i = 0; i < length; i++) {
				for (int x = 0; x < this.getX(); x++) {
					line += " ";
				}
				line += this.getFill() + "\n";
			}
		} else {
			for (int x = 0; x < this.getX(); x++) {
				line += " ";
			}
			for (int i = 0; i < length; i++) {

				line += this.getFill();
			}
		}
		return line;
	}

}
