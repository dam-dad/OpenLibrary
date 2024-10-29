package dad.openlibrary;

import dad.openlibrary.api.Doc;
import dad.openlibrary.api.OpenLibrary;
import dad.openlibrary.api.SearchResult;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        OpenLibrary ol = new OpenLibrary();
        SearchResult result = ol.getBooks("game of thrones");

        System.out.println("Se han encontrado " + result.getNumFound() + " libros");

        Doc doc = result.getDocs().getFirst();

        System.out.println("--- Primer libro encontrado ---");
        System.out.println("Autor/es: " + doc.getAuthorName());
        System.out.println("Titulo: " + doc.getTitle());
        System.out.println("ISBN/s: " + doc.getIsbn());
        System.out.println("Editorial/es: " + doc.getPublisher());
        System.out.println("Páginas: " + doc.getNumberOfPagesMedian());

    }

}
