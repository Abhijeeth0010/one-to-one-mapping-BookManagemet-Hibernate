package com.kodnest.books.book_management;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	int price;
	
	@Column
	int pages;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "author", referencedColumnName = "id")
	Author author;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, id, name, pages, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return author == other.author && id == other.id && Objects.equals(name, other.name) && pages == other.pages
				&& Objects.equals(price, other.price);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", pages=" + pages + ", author=" + author
				+ "]";
	}

	public Book(int id, String name, int price, int pages, Author author) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.pages = pages;
		this.author = author;
	}

	public Book(String name, int price, int pages, Author author) {
		super();
		this.name = name;
		this.price = price;
		this.pages = pages;
		this.author = author;
	}
	

	public Book(String name, int price, int pages) {
		super();
		this.name = name;
		this.price = price;
		this.pages = pages;
	}

	public Book() {
		
	}
}
