package in.co.decimal.classObject.pojo;

public class Address {
	// state of the object:
	private String line1;
	private String city;
	private String zip;

	// creation:

	public Address() {
		// default constructor:
	}

	public Address(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", city=" + city + ", zip=" + zip + "]";
	}

}
