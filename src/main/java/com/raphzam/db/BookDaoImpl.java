package com.raphzam.db;

import com.raphzam.api.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {
  @Override
  public List<Book> getAllBooks() {
    Connection conn = null;
    Statement stmt = null;
    List<Book> books = new ArrayList<>();
    try {
      // Register JDBC driver
      Class.forName("org.h2.Driver");

      // Open a connection
      conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

      // Execute a query
      stmt = conn.createStatement();
      String sql = "SELECT * FROM books";
      ResultSet rs = stmt.executeQuery(sql);

      // Extract data from result set
      while (rs.next()) {
        // Retrieve by column name
        int id = rs.getInt("id");
        String title = rs.getString("title");
        String author = rs.getString("author");
        int year = rs.getInt("year");
        String isbn = rs.getString("isbn");
        int rating = rs.getInt("rating");

        // Create a new Book object
        Book book = new Book.Builder(title, author)
            .id(id)
            .year(year)
            .isbn(isbn)
            .rating(rating)
            .build();

        // Add the Book object to the list
        books.add(book);
      }
    } catch (SQLException se) {
      se.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return books;
  }

  @Override
  public Book getBookById(int id) {
    return null;
  }

  @Override
  public Book addBook(Book book) {
    return null;
  }

  @Override
  public Book updateBook(int id, Book book) {
    return null;
  }

  @Override
  public Book deleteBook(int id) {
    return null;
  }

  @Override
  public void createTables() {
    Connection conn = null;
    Statement stmt = null;

    try {
      // Register JDBC driver
      Class.forName("org.h2.Driver");

      conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

      stmt = conn.createStatement();
      String sql =
          "CREATE TABLE IF NOT EXISTS books " +
              "(id INTEGER not null, " +
              " title VARCHAR(255), " +
              " author VARCHAR(255), " +
              " year INTEGER, " +
              " isbn VARCHAR(255), " +
              " rating INTEGER, " +
              "PRIMARY KEY ( id ))";
      stmt.executeUpdate(sql);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    } finally {
      try {
        if (stmt != null) {
          stmt.close();
        }
      } catch (SQLException throwables) {
        throwables.printStackTrace();
      }
      try {
        if (conn != null) {
          conn.close();
        }
      } catch (SQLException throwables) {
        throwables.printStackTrace();
      }
    }
  }
}

