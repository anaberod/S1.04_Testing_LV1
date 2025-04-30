import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryManagerTest {

    private LibraryManager manager = new LibraryManager();

    //añadir un libro y comprobar que la lista no está vacia
    @Test
    void testAddNewBook() {
        manager.addNewBook("Alice in Wonderland");
        assertEquals(1, manager.bookList().size());
    }

    @Test
    void testListAfterAddingFewBooks() {
        manager.addNewBook("1984");
        manager.addNewBook("Alice in Wonderland");
        int expectedSize = 2;
        int actualSize = manager.bookList().size();
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void testBookAtSpecificPosition() {
        manager.addNewBook("1984");
        manager.addNewBook("Alice in Wonderland");
        manager.addNewBook("El Principito");
        String expectedTitle = "El Principito";
        String actualTitle = manager.getABookAt(2);
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    void testNoDuplicateTitles() {
        manager.addNewBook("1984");
        manager.addNewBook("Alice in Wonderland");
        manager.addNewBook("El Principito");
        manager.addNewBook("1984");

        int count = 0;
        for (Book book : manager.bookList()) {
            if (book.getTitle().equalsIgnoreCase("1984")) {
                count++;
            }
        }
        assertEquals(1, count);
    }

    @Test
    void testGetABookbyPosition() {
        manager.addNewBook("1984");
        manager.addNewBook("Alice in Wonderland");
        manager.addNewBook("El Principito");

        String expectedBook = "1984";
        String actualBook = manager.getABookAt(0);
        assertEquals(expectedBook, actualBook);
    }

    @Test
    void testAddingBookModifiedList() {
        int initialSize = manager.bookList().size();
        manager.addNewBook("1984");
        manager.addNewBook("Alice in Wonderland");
        manager.addNewBook("El Principito");
        int newSize = manager.bookList().size();
        assertEquals(initialSize + 3, newSize);
    }

    @Test
    void testDeletingBookDecreaseList() {
        manager.addNewBook("1984");
        manager.addNewBook("Alice in Wonderland");
        manager.addNewBook("El Principito");

        int sizeBeforeDelete = manager.bookList().size();

        manager.deleteBookByTitle("1984");

        int sizeAfterDelete = manager.bookList().size();
        assertEquals(sizeBeforeDelete - 1, sizeAfterDelete);

    }

    @Test
    void testListRemainsAlphabeticallyOrdered() {

        manager.addNewBook("El Principito");
        manager.addNewBook("Alice in Wonderland");
        manager.addNewBook("The Hobbit");
        manager.addNewBook("Codigo Da Vinci");

        manager.deleteBookByTitle("Alice in Wonderland");

        List<Book> books = manager.bookList();
        for (int i = 0; i < books.size() - 1; i++) {
            String current = books.get(i).getTitle();
            String next = books.get(i + 1).getTitle();

            // Verifica que cada título sea menor o igual (alfabéticamente) que el siguiente
            assertTrue(current.compareToIgnoreCase(next) <= 0);


        }


    }
    }
