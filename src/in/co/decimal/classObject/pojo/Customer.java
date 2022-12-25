package in.co.decimal.classObject.pojo;

public class Customer {

	// state of the object:
	private String name;

	// Object is inside another object is called Object composition.
	private Address homeAddress;
	private Address workAddress;

	// creating:
	public Customer() {
		// default constructor:
	}

	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	// operation:

	/**
	 * @return the homeAddress
	 */
	public Address getHomeAddress() {
		return homeAddress;
	}

	/**
	 * @param homeAddress the homeAddress to set
	 */
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	/**
	 * @return the workAddress
	 */
	public Address getWorkAddress() {
		return workAddress;
	}

	/**
	 * @param workAddress the workAddress to set
	 */
	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", homeAddress=" + homeAddress + ", workAddress=" + workAddress + "]";
	}

}
