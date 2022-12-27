package com.raphzam.db;

import com.raphzam.api.Book;

import java.util.List;

public interface BookDao {

  List<Book> getAllBooks();

  Book getBookById(int id);

  Book addBook(Book book);

  Book updateBook(int id, Book book);

  Book deleteBook(int id);

  void createTables();
}
