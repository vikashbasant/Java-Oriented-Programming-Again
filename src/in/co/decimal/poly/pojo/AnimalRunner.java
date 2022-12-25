package in.co.decimal.poly.pojo;

abstract class Animal {
	abstract void bark();
}

class Dog extends Animal {
	@Override
	public void bark() {
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal {
	@Override
	public void bark() {
		System.out.println("Meow Meow");
	}
}

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animal = { new Cat(), new Dog()};
		for (Animal pet : animal) {
			pet.bark();
		}
	}
}
