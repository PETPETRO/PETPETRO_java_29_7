
public abstract class Shape {
	
	protected int x;
	protected int y;
	protected char fill;
	
	
	public Shape(int x, int y, char fill){
		this.x=x;
		this.y=y;
		this.fill=fill;
	}
	
	public Shape(){
		this.x=0;
		this.y=0;
		this.fill='*';
	}
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public Character getFill() {
		return fill;
	}


	public void setFill(Character fill) {
		this.fill = fill;
	}


	
	
	
	

}
