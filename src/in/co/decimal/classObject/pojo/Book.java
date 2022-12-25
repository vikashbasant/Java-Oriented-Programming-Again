package in.co.decimal.classObject.pojo;

import java.util.ArrayList;

public class Book {

	private int id;
	private String author;
	private String name;
	private ArrayList<Review> reviews = new ArrayList<Review>();

	public Book() {
		// default constructor:
	}

	public Book(int id, String author, String name) {
		this.id = id;
		this.author = author;
		this.name = name;
	}

	public void addReview(Review review) {
		this.reviews.add(review);

	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", name=" + name + ", reviews=" + reviews + "]";
	}

}
