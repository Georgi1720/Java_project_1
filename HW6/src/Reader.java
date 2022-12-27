import java.util.Arrays;
import java.util.Objects;

public class Reader {
    private final String fullName;
    private final int card;
    private final String faculty;
    private final String dateBerthd;
    private final String phone;


    public Reader(String fullName, int card, String faculty, String dateBerthd, String phone) {
        this.fullName = fullName;
        this.card = card;
        this.faculty = faculty;
        this.dateBerthd = dateBerthd;
        this.phone = phone;
    }

    public void takeBook(int booksCount) {
        System.out.printf("%s взял %s книги", fullName, booksCount);
    }

    public void takeBook(Book book) {
        System.out.printf("%s взял  книги : %s", fullName, book.toString());
    }

    public void takeBook(Book... books) {
        System.out.printf("%s взял  книги : %s", fullName, Arrays.toString(books));
    }

    public void returnBook(int books) {
        System.out.printf("%s вернул %s книги", fullName, books);
    }

    public void returnBook(String... book) {
        System.out.printf("%s вернул  книги : %s", fullName, Arrays.toString(book));
    }

    public void returnBook(Book... books) {
        System.out.printf("%s вернул  книги : %s", fullName, Arrays.toString(books));
    }

    public void getAllReader() {
        System.out.println(fullName + " " + card + " " + faculty + " " + dateBerthd + " " + phone);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", card=" + card +
                ", faculty='" + faculty + '\'' +
                ", dateBerthd='" + dateBerthd + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
