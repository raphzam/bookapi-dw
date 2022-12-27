package com.raphzam.core;

import com.raphzam.api.Book;
import com.raphzam.db.BookDao;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public class BookService {
  private final BookDao bookDao;

  public BookService(BookDao bookDao) {
    this.bookDao = bookDao;
  }

  public List<Book> getAllBooks() {
    return bookDao.getAllBooks();
  }

  public Book getBookById(int id) {
    return bookDao.getBookById(id);
  }

  public Book addBook(Book book) {
    return bookDao.addBook(book);
  }

  public Book updateBook(int id, Book book) {
    return bookDao.updateBook(id, book);
  }

  public Book deleteBook(int id) {
    return bookDao.deleteBook(id);
  }
}
