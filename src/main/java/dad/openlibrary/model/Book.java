package dad.openlibrary.model;

import dad.openlibrary.api.Doc;
import javafx.beans.property.*;

public class Book {

    private final StringProperty title = new SimpleStringProperty();
    private final StringProperty author = new SimpleStringProperty();
    private final StringProperty publisher = new SimpleStringProperty();
    private final StringProperty isbn = new SimpleStringProperty();
    private final IntegerProperty numPages = new SimpleIntegerProperty();
    private final ReadOnlyBooleanWrapper hasPages = new ReadOnlyBooleanWrapper();

    public Book() {}

    public Book(Doc doc) {
        title.set(doc.getTitle());
        author.set(doc.getAuthorName() != null && !doc.getAuthorName().isEmpty() ? doc.getAuthorName().getFirst() : "");
        publisher.set(doc.getPublisher() != null && !doc.getPublisher().isEmpty() ? doc.getPublisher().getFirst() : "");
        isbn.set(doc.getIsbn() != null && !doc.getIsbn().isEmpty() ? doc.getIsbn().getFirst() : "");
        numPages.set(doc.getNumberOfPagesMedian() != null ? doc.getNumberOfPagesMedian() : 0);
        hasPages.bind(numPages.greaterThan(0));
    }

    public String getTitle() {
        return title.get();
    }

    public StringProperty titleProperty() {
        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public String getAuthor() {
        return author.get();
    }

    public StringProperty authorProperty() {
        return author;
    }

    public void setAuthor(String author) {
        this.author.set(author);
    }

    public String getPublisher() {
        return publisher.get();
    }

    public StringProperty publisherProperty() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher.set(publisher);
    }

    public String getIsbn() {
        return isbn.get();
    }

    public StringProperty isbnProperty() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn.set(isbn);
    }

    public int getNumPages() {
        return numPages.get();
    }

    public IntegerProperty numPagesProperty() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages.set(numPages);
    }

    public boolean hasPages() {
        return hasPages.get();
    }

    public ReadOnlyBooleanProperty hasPagesProperty() {
        return hasPages.getReadOnlyProperty();
    }

}
