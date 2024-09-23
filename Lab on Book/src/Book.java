public class Book {
    String name;
    String author;
    int numberOfBooks;
    Book(String name, String author, int numberOfBooks) {
        this.name = name;
        this.author = author;
        this.numberOfBooks = numberOfBooks;
    }
    void borrow(){
        numberOfBooks++;
    }
    void returnBook(){
        numberOfBooks--;
    }
}
