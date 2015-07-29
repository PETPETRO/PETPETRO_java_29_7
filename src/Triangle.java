
public class Triangle extends Shape {

	private int size;
	private boolean filled;

	public Triangle(int size, boolean filled) {
		super(0, 0, '#');
		this.size = size;
		this.filled = filled;

	}

	public Triangle(int x, int y, char fill, int size, boolean filled) {
		super(x, y, fill);
		this.size = size;
		this.filled = filled;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	// private String spaces(int row) {
	// String spaces = "";
	//
	// for (int i = 0; i < (size - row - 1+ this.getX()); i++) {
	// spaces += " ";
	// }
	// return spaces;
	// }
	//
	// private String symbols(int row) {
	// String symbols = "";
	// for (int i = 0; i < (row * 2) + 1; i++) {
	// symbols +=this.getFill() ;
	// }
	// return symbols;
	// }
	//
	// @Override
	// public String toString() {
	//
	// String triangle ="";
	// for (int row = 0; row < size + this.getY(); row++) {
	//
	// triangle += spaces(row-this.getY()) + symbols(row-this.getY()) + "\n";
	// }
	// return triangle;
	// }

	@Override
	public String toString() {

		String triangle = "";
		Line l = new Line(this.x, 0, '*', this.size, false);
		for (int y = 0; y < this.getY(); y++) {
			triangle += "\n";
		}

		if (this.filled) {
			for (int row = 0; row < size; row++) {
				l.setLength((size - row - 1));
				l.setX(this.getX());
				l.setFill(' ');
				triangle += l.toString();
				l.setLength((row * 2) + 1);
				l.setX(0);
				l.setFill('l');
				triangle += l.toString() + "\n";
			}
		} else {

			for (int row = 0; row < size; row++) {
				l.setLength((size - row - 1));
				l.setX(this.getX());
				l.setFill(' ');
				triangle += l.toString();
				if (row == 0 || row == size - 1) {
					l.setFill('*');
					l.setLength(2 * row + 1);
					l.setX(0);
					triangle += l.toString() + "\n";
				} else {
					for (int col = 0; col < 2 * row + 1; col++) {
						if (col == 0) {
							l.setFill('*');
							l.setLength(1);
							l.setX(0);
							triangle += l.toString();
						} else if (col == 2 * row) {
							l.setFill('*');
							l.setLength(1);
							l.setX(0);
							triangle += l.toString();
						} else {
							triangle += " ";
						}
					}
					triangle += "\n";
				}
			}
		}

		return triangle;
	}

}
