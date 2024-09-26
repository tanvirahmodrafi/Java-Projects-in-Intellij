import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Library {

    protected List<Book> booksInformation = new ArrayList<>();
    protected List<Member> memberInformation = new ArrayList<>();
    protected List<Transaction> transactionsInformation = new ArrayList<>();

    public int getTotalNumberOfBooks() {
        return booksInformation.size();
    }

    public int getTotalNumberOfMember() {
        return memberInformation.size();
    }

    public void addNewBook(Book book) {
        try{
            booksInformation.add(book);

            System.out.println(book.toString());
            System.out.println("Book added to the library");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void addNewMember(Member member) {
        try {
            memberInformation.add(member);
            System.out.println(member.toString());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void searchBook(String info) {
       try{
           for (Book book : booksInformation) {
               if(book.getAuthor().toLowerCase().contains(info.toLowerCase())
                       || book.getTitle().toLowerCase().contains(info.toLowerCase())
                       || book.getUniqueId().toLowerCase().contains(info.toLowerCase())) {
                   System.out.println("Book found:\n " + book.toString());
               }
           }
       }catch (Exception e) {
           e.printStackTrace();
       }
    }
    public void updateBook(String uniqueId, String title, String author, String category,boolean isAvailable) {
       try{
           for (Book book : booksInformation) {
               if(book.getUniqueId().equals(uniqueId)) {
                   book.setTitle(title);
                   book.setAuthor(author);
                   book.setCategory(category);
                   book.setAvailable(isAvailable);
                   System.out.println("Book updated");
               }
           }
       }catch (Exception e) {
           e.printStackTrace();
       }
    }
    public void borrowBook(String uniqueId,String uniqueMemberId) {
        try{
            for (Member member : memberInformation) {
                if(member.getUniqueMemberId().equals(uniqueMemberId)) {
                    for(Book book : booksInformation) {
                        if(book.getUniqueId().equals(uniqueId)) {
                            if(book.isAvailable()) {
                                book.setAvailable(false);
                                member.bookBorrowed++;
                                Scanner scanner = new Scanner(System.in);
                                System.out.println("Enter the transaction date of the book");
                                String date = scanner.nextLine();
                                transactionsInformation.add(new Transaction("Borrow", uniqueId, uniqueMemberId, date));
                                System.out.println("Book is borrowed!");
                            }else{
                                System.out.println("Book is not Available!");
                            }
                        }
                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void returnBook(String uniqueId,String uniqueMemberId) {
        try{
            for (Member member: memberInformation) {
                if(member.getUniqueMemberId().equals(uniqueMemberId)) {
                    for(Book book : booksInformation) {
                        if(book.getUniqueId().equals(uniqueId)) {
                            book.setAvailable(true);
                            member.bookBorrowed--;
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Enter the transaction date of the book");
                            String date = scanner.nextLine();
                            transactionsInformation.add(new Transaction("Borrow", uniqueId, uniqueMemberId, date));
                            System.out.println("Book is returned!");
                        }else{
                            System.out.println("User has not Borrowed the book!");
                        }
                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void transactionHistory() {
        for (Transaction transaction : transactionsInformation) {
            System.out.println(transaction.toString());
        }
    }
}
