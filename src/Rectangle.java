
public class Rectangle extends Shape {

	private int width;
	private int height;
	private boolean filled;

	public Rectangle(int width, int height, boolean filled) {
		this.width = width;
		this.height = height;
		this.filled = filled;
	}

	public Rectangle(int x, int y, char fill, int width, int height, boolean filled) {
		super(x, y, fill);
		this.width = width;
		this.height = height;
		this.filled = filled;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String toString() {
		Line l = new Line(this.x, 0, '*', this.width, false);
		String rectangle = "";

		for (int y = 0; y < this.getY(); y++) {
			rectangle += "\n";
		}

		if (this.filled) {
			for (int a = 0; a < height; a++) {
				rectangle += l.toString() + "\n";
			}
		} else {
			for (int row = 0; row < this.height; row++) {
				if (row == 0 || row == height - 1) {
					l.setLength(this.width);
					l.setX(this.x);
					rectangle += l.toString() + "\n";
				} else {
					for (int col = 0; col < width; col++) {
						if (col == 0) {
							l.setLength(1);
							l.setX(this.x);
							rectangle += l.toString();
						} else if (col == width - 1) {
							l.setLength(1);
							l.setX(0);
							rectangle += l.toString();
						} else {
							rectangle += " ";
						}
					}
					rectangle += "\n";
				}
			}

		}

		return rectangle;
	}

	// public String toString() {
	//
	// String rectangle = "";
	//
	// for (int y = 0; y < this.getY(); y++) {
	// rectangle += "\n";
	// }
	//
	// for (int a = 0; a < height; a++) {
	// for (int x = 0; x < this.getX(); x++) {
	// rectangle += " ";
	// }
	// for (int b = 0; b < width; b++) {
	// rectangle += this.getFill();
	// }
	// rectangle += "\n";
	// }
	// return rectangle;
	// }

}
