package com.example.demo.bean;

public class Comment {
	private String author;
	private String text;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Comment(String author, String text) {
		super();
		this.author = author;
		this.text = text;
	}
}
