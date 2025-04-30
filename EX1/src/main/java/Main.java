
public class Main {
    public static void main(String[] args) {

        LibraryManager manager = new LibraryManager();

        //añadir libros

        manager.addNewBook("1984");
        manager.addNewBook("La sombra del viento");
        //añadir libro en posicion especifica
        manager.addNewBookAtPosition(1, "El Principito");
        //lista de libros
        System.out.println("List of books: ");
        for (Book book : manager.bookList()) {
            System.out.println("- " + book.getTitle());
        }
        //obtener un titulo en una posicion
        System.out.println("\n Book in position 2: " + manager.getABookAt(2));
        //eliminar libro por titulo
        boolean removedBook = manager.deleteBookByTitle("1984");
        //nueva lista
        System.out.println("\n New list: ");
        for (Book book : manager.bookList()) {
            System.out.println("- " + book.getTitle());
        }

    }
}