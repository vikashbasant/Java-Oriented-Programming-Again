package in.co.decimal.classObject.pojo;

public class Fan {

	// state:
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed; // 0 to 5

	// constructor:
	public Fan() {
		// default constructor:
	}

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	// Behavior:

	public void switchOn() {
		this.isOn = true;
		// here we set the default speed for switchOn();
		this.setSpeed((byte) 5);
	}

	public void switchOff() {
		this.isOn = false;
		// here we set the default speed for switchOff();
		this.setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	// print the state:
	@Override
	public String toString() {
//		return "Fan [ make: "+ this.make +" radius: "+this.radius+" color: "+this.color+
//				" speed: " + this.speed + "]";

		// another way:
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", this.make, this.radius,
				this.color, this.isOn, this.speed);
	}

}
