package in.co.decimal.abstr.pojo;

public abstract class AbstractRecipe {

	// here this is a non abstract method:
	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}

	// here this is a abstract method:
	abstract void getReady();

	abstract void doTheDish();

	abstract void cleanup();

	// Prepare
	// recipe
	// cleanup

}
