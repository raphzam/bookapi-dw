package com.raphzam.api;

public class Book {
  private int id;
  private String title;
  private String author;
  private int year;
  private String isbn;
  private int rating;

  public Book() {
  }

  public Book(int id, String title, String author, int year, String isbn, int rating) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.year = year;
    this.isbn = isbn;
    this.rating = rating;
  }


  @Override
  public String toString() {
    return "Book{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", year=" + year +
        ", isbn='" + isbn + '\'' +
        ", rating=" + rating +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Book book = (Book) o;

    if (id != book.id) {
      return false;
    }
    if (year != book.year) {
      return false;
    }
    if (rating != book.rating) {
      return false;
    }
    if (title != null ? !title.equals(book.title) : book.title != null) {
      return false;
    }
    if (author != null ? !author.equals(book.author) : book.author != null) {
      return false;
    }
    return isbn != null ? isbn.equals(book.isbn) : book.isbn == null;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (title != null ? title.hashCode() : 0);
    result = 31 * result + (author != null ? author.hashCode() : 0);
    result = 31 * result + year;
    result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
    result = 31 * result + rating;
    return result;
  }

  public static class Builder {
    // Required parameters
    private final String title;
    private final String author;

    // Optional parameters
    private int id = 0;
    private int year = 0;
    private String isbn = "";
    private int rating = 0;

    public Builder(String title, String author) {
      this.title = title;
      this.author = author;
    }

    public Builder id(int id) {
      this.id = id;
      return this;
    }

    public Builder year(int year) {
      this.year = year;
      return this;
    }

    public Builder isbn(String isbn) {
      this.isbn = isbn;
      return this;
    }

    public Builder rating(int rating) {
      this.rating = rating;
      return this;
    }

    public Book build() {
      return new Book(this);
    }
  }

  private Book(Builder builder) {
    id = builder.id;
    title = builder.title;
    author = builder.author;
    year = builder.year;
    isbn = builder.isbn;
    rating = builder.rating;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

}
