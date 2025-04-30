import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    // Método reutilizable para ordenar alfabéticamente por título (ignorando mayúsculas/minúsculas)
    private void sortBooks() {
        books.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }

    //método añadir libro
    public void addBook(Book book) {
        books.add(book);
        sortBooks();
    }

    //método para recuperar la lista de libros completa
    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }
    //método para obtener el titulo de un libro dada la posicion

    public Book getBookAtPosition(int position) {
        if (position >= 0 && position < books.size()) {
            return books.get(position);
        } else {
            throw new IndexOutOfBoundsException("Invalid position");
        }
    }

    //metodo para añadir un libro en una posicion especifica

    public void addBookAtPosition(int position, Book book) {
        if (position >= 0 && position <= books.size()) {
            books.add(position, book);
            sortBooks();
        } else {
            throw new IndexOutOfBoundsException("Invalid position");
        }
    }

    //metodo para eliminar un libro por titulo

    public boolean removeBookByTitle(String title) {
        return books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));


    }

}
