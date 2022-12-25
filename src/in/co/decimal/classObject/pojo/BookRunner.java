package in.co.decimal.classObject.pojo;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "Object Oriented Programming with Java", "Basant");
		book.addReview(new Review(10, "Great Book", 5));
		book.addReview(new Review(101, "Awesome", 5));
		System.out.println(book);

	}
}
