package com.in28min;

public class Review {
	int id;
	String description;
	int rating;

	public Review(int id, String description, int rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return String.format("(id: %d, description: %s, rating:%d)", id, description, rating);
	}
}
