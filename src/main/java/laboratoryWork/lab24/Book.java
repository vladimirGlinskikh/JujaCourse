package laboratoryWork.lab24;

public class Book extends Issue {
    private String authorBook;

    public Book(String name, int countPages, String authorBook) {
        super(name, countPages);
        this.authorBook = authorBook;
    }

    @Override
    public String toPrint() {
        return "Book{" + super.toPrint() +
                ",author=" + authorBook + "}";
    }
}
