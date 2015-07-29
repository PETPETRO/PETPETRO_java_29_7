
public class Square extends Shape {

	private int size;
	private boolean filled;

	public Square(int size, boolean filled) {
		this.size = size;
		this.filled = filled;
	}

	public Square(int x, int y, char fill, int size, boolean filled) {
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

	// public String toString() {
	// String square="";
	// for(int y=0;y<this.getY();y++){
	// square+="\n";
	// }
	// for(int a=0;a<size; a++){
	// for(int x=0;x<this.getX();x++){
	// square+=" ";
	// }
	// for(int b=0;b<size;b++ ){
	// square+=this.getFill();
	// }
	// square+="\n";
	// }
	// return square;
	// }

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String toString() {

		String square = "";
		Line l = new Line(this.x, 0, '*', this.size, false);

		for (int y = 0; y < this.getY(); y++) {
			square += "\n";
		}

		if (this.filled) {

			for (int a = 0; a < size; a++) {
				square += l.toString() + "\n";
			}
		} else {

			for (int row = 0; row < size; row++) {
				if (row == 0 || row == size - 1) {
					l.setLength(this.size);
					l.setX(this.x);
					square += l.toString() + "\n";
				} else {
					for (int col = 0; col < size; col++) {
						if (col == 0) {
							l.setLength(1);
							l.setX(this.x);
							square += l.toString();
						} else if (col == size - 1) {
							l.setLength(1);
							l.setX(0);
							square += l.toString();
						} else {
							square += " ";
						}
					}
					square += "\n";
				}
			}

		}

		return square;
	}

}
