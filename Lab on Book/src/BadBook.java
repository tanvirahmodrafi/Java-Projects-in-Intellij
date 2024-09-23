public class BadBook extends Book {
    String restriction;

    BadBook(String restriction,String name,String author,int numOfBooks) {
        super(name, author, numOfBooks);

        this.restriction = restriction;

    }
    @Override
    void borrow(){
        System.out.println("You cant borrow this book");
    }
}
