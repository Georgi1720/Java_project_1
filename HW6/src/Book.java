public class Book {
    private final String title;
    private final String avtor;

    public Book(String title, String avtor) {
        this.title = title;
        this.avtor = avtor;
    }

    @Override
    public String toString() {
        return title + " " + avtor;
    }
}
