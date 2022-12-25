package in.co.decimal.inter.assign.pojo;

public class FlyableRunner {
	public static void main(String[] args) {
		Flyable flyingObjectsBird[] = { new Bird(), new Aeroplane() };

		for (int i = 0; i < flyingObjectsBird.length; i++) {
			flyingObjectsBird[i].fly();
		}

		for (Flyable obj : flyingObjectsBird) {
			obj.fly();
		}
	}
}
