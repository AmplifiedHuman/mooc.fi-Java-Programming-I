import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> searches = new ArrayList<Book>();
        for (Book book : books) {
            if (StringUtils.included(book.title(), title)) {
                searches.add(book);
            }
        }
        return searches;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> searches = new ArrayList<Book>();
        for (Book book : books) {
            if (StringUtils.included(book.publisher(), publisher)) {
                searches.add(book);
            }
        }
        return searches;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> searches = new ArrayList<Book>();
        for (Book book : books) {
            if (book.year() == year) {
                searches.add(book);
            }
        }
        return searches;
    }
}