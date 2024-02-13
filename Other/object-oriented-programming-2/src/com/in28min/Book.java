package com.in28min;

import java.util.ArrayList;

public class Book {
	int id;
	String name;
	String author;
	ArrayList<Review> reviews;

	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.reviews = new ArrayList<Review>();
	}

	public void addReview(Review review) {
		reviews.add(review);
	}

	@Override
	public String toString() {
		return String.format("id: %d, name: %s, author: %s, reviews: %s", id, name, author, reviews);
	}

}
