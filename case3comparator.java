import java.util.*;

class Book {
    int bookId;
    String title;
    int pages;

    Book(int bookId, String title, int pages) {
        this.bookId = bookId;
        this.title = title;
        this.pages = pages;
    }
}

class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {

        // Pages ascending
        if (b1.pages != b2.pages) {
            return Integer.compare(b1.pages, b2.pages);
        }

        // Same pages -> title alphabetical
        return b1.title.compareTo(b2.title);
    }
}

public class case3comparator {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(101, "Java Basics", 150));
        books.add(new Book(104, "Data Structures", 150));
        books.add(new Book(103, "Computer Networks", 250));
        books.add(new Book(102, "Operating Systems", 400));

        Collections.sort(books, new BookComparator());

        for (Book b : books) {
            System.out.println(b.bookId + " " + b.title + " " + b.pages);
        }
    }
}
