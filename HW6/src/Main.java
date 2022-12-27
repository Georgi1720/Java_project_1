public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Колесник Иван", 2, "Аналитика", "01.01.1991", "89286340755");
        Reader reader2 = new Reader("Генералов Пётр", 4, "Экономика", "02.02.1992", "89285504634");
        Book dictionary = new Book("Словарь", "Ожегов C.И.");
        Book adventures = new Book("Приключения", "Апресян Р.Г.");

        Reader[] readers = new Reader[]{reader1, reader2};
        for (Reader reader : readers) {
            reader.getAllReader();
        }
        System.out.println();
        System.out.println(readers);
        reader1.takeBook(2);
        System.out.println();
        reader1.takeBook(dictionary, adventures);
        System.out.println();
        reader2.takeBook(dictionary, new Book("Незнайка", "Носов Н.Н"));
        System.out.println();
        reader1.returnBook(1);
        System.out.println();
        reader1.returnBook(dictionary, adventures);
        System.out.println();
        reader2.returnBook(dictionary, new Book("Незнайка", "Носов Н.Н"));
    }
}