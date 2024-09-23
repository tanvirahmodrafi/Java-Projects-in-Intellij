public class GoodBook extends Book {
    int awards;
    GoodBook(int awards, String name, String author,int numOfBooks) {
        super(name, author, numOfBooks);

        this.awards = awards;
    }
    void overLoading(int numOfBooks){
        this.numberOfBooks = numOfBooks;
        System.out.println("Over loading " + numOfBooks + " books");

    }
    void overLoading( int numOfBooks, double price){
        System.out.println("Over loading " + numOfBooks + " books");
        System.out.println("Price is " + price);
    }
}
