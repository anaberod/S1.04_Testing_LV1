import java.util.List;

public class LibraryManager {
    private Library library = new Library();

    public void addNewBook(String title) {
        library.addBook(new Book(title));
    }

    public List<Book> bookList() {
        return library.getAllBooks();
    }

    public String getABookAt(int position) {
        return library.getBookAtPosition(position).getTitle();
    }

    public void addNewBookAtPosition(int position, String title) {
        library.addBookAtPosition(position, new Book(title));

    }

    public boolean deleteBookByTitle(String title) {
        return library.removeBookByTitle(title);
    }

}
