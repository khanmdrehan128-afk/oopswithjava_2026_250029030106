package com.kiet.library.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kiet.library.model.Book;

@Service
public class BookService {
    private final List<Book> books = new ArrayList<>();

    public BookService() {
        books.add(new Book(1, "Effective Java", "Joshua Bloch", "Programming", 2018, true));
        books.add(new Book(2, "Clean Code", "Robert C. Martin", "Programming", 2008, true));
        books.add(new Book(3, "The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937, false));
        books.add(new Book(4, "Educated", "Tara Westover", "Memoir", 2018, true));
        books.add(new Book(5, "The Pragmatic Programmer", "Andrew Hunt", "Programming", 1999, true));
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public Book getBookById(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    public Book updateBook(int bookId, Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == bookId) {
                updatedBook.setBookId(bookId);
                books.set(i, updatedBook);
                return updatedBook;
            }
        }
        return null;
    }

    public boolean deleteBook(int bookId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == bookId) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Book> searchByCategory(String category) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getCategory() != null && book.getCategory().equalsIgnoreCase(category)) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> findPublishedFromYear(int fromYear) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublicationYear() >= fromYear) {
                results.add(book);
            }
        }
        return results;
    }
}
