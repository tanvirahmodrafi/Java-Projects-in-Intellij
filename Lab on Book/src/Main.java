//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book B1 = new Book("abc", "Hasina", 4);
        GoodBook b2 = new GoodBook(2, "Amar Fasi Chai", "Abdullah", 4);
        b2.overLoading(5);
        b2.overLoading(6,5.6);
        b2.borrow();
        System.out.println(b2.numberOfBooks);




        BadBook b3 = new BadBook("Because Of Hasina", "Amar Fasi Chai", "Abdullah", 4);
        b3.borrow();
        System.out.println(b3.numberOfBooks);
    }
}