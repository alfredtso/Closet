package simple;

public class Book extends Stuff{
    private String bookName;
    public Book(String name) {
        // get an id
        super();
        this.bookName = name;
    }

    @Override
    public String getDescription() {
        return bookName;
    }

    public static void main(String[] args) {

        Book[] books = new Book[2];
        Book core = new Book("Core Java Vol 1");
        System.out.println("The book i am reading: " + core.getDescription());
        System.out.println("The id of which is: " + core.getId());
        System.out.println(core.equals(books[1]));
    }
}
