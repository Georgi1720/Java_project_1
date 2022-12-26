import java.util.Arrays;
import java.util.Objects;

class Reader {
    private String fullName;
    private int card;
    private String faculty;
    private String dateBerthd;
    private String phone;

    public void takeBook(String fullName, int books) {
        System.out.printf("%s взял %s книги", fullName, books);
    }

    public void takeBook(String fullName, String... book) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < book.length - 1; i++) {
            str.append(book[i]).append(",");
        }
        str.append(book[book.length - 1]);
        System.out.printf("%s взял  книги : %s", fullName, str);
    }

    public void takeBook(String books, Objects... Book) {
        System.out.printf("%s взял  книги : %s", books, Arrays.toString(Book));
    }

    public void returnBook(String fullName, int books) {
        System.out.printf("%s вернул %s книги", fullName, books);
    }

    public void returnBook(String fullName, String... book) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < book.length - 1; i++) {
            str.append(book[i]).append(",");
        }
        str.append(book[book.length - 1]);
        System.out.printf("%s вернул  книги : %s", fullName, str);
    }

    public void returnBook(String books, Objects... Book) {
        System.out.printf("%s вернул  книги : %s", books, Arrays.toString(Book));
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateBerthd() {
        return dateBerthd;
    }

    public void setDateBerthd(String dateBerthd) {
        this.dateBerthd = dateBerthd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

class Book {
    private String name;
    private String avtor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    @Override
    public String toString() {
        return
                name + " " + avtor;
    }
}

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Book book1 = new Book();
        Book book2 = new Book();
        reader1.setFullName("Попов Олег Анатольевич");
        reader1.setCard(1);
        reader1.setFaculty("Аналитик");
        reader1.setPhone("89883482293");
        reader1.setDateBerthd("11.11.2001");
        reader2.setFullName("Антропов Анатолий Олегович");
        reader2.setCard(2);
        reader2.setFaculty("Тестировщик");
        reader2.setPhone("89883482294");
        reader2.setDateBerthd("13.13.2003");
        book1.setName("Словарь");
        book1.setAvtor("Ожегов Сергей Иванович");
        book2.setName("Приключения");
        book2.setAvtor("Апресян Рубен Грантович");
        reader1.takeBook(reader1.getFullName(), String.valueOf(book2), String.valueOf(book1));
        System.out.println();
        reader2.takeBook(reader2.getFullName(), String.valueOf(book1),String.valueOf(book2));
        System.out.println();
        System.out.println();
        reader1.returnBook(reader1.getFullName(),String.valueOf(book2), String.valueOf(book1));
        System.out.println();
        reader2.returnBook(reader2.getFullName(), String.valueOf(book1),String.valueOf(book2));
    }
}