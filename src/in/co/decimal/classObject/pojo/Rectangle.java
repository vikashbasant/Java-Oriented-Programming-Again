package in.co.decimal.classObject.pojo;

public class Rectangle {
	// state:
	private int length;
	private int width;

	// constructor:
	public Rectangle() {
		// default constructor:
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	// getter and setter:
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	public int perimeter() {
		return (2 * (this.length * this.width));

	}

	public int area() {
		return (this.length * this.width);

	}

	public double digonal() {
		int smallResult = ((this.length * this.length) + (this.width * this.width));
		return Math.round(Math.sqrt(smallResult));
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}


}
