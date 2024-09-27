import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Library library = new Library();
    Scanner scanner = new Scanner(System.in);
    while(true){

        System.out.println("Press 1 to add book");
        System.out.println("Press 2 to add member");
        System.out.println("Press 3 to Update book information");
        System.out.println("Press 4 to Borrow book");
        System.out.println("Press 5 to Return book");
        System.out.println("Press 6 to search book");
        System.out.println("Press 7 to see history of transactions");
        System.out.println("Press 8 to Quick info");
        System.out.println("Press 9 to Exit\n");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if(choice == 1){
            System.out.println("Enter the name of the book");
            String name = scanner.nextLine();
            System.out.println("Enter the author of the book");
            String author = scanner.nextLine();
            System.out.println("Enter the uniqueID of the book");
            String uniqueID = scanner.nextLine();
            System.out.println("Enter the category of the book");
            String category = scanner.nextLine();
            System.out.println("Enter the Availability(true/false) of the book");
            boolean availability = Boolean.parseBoolean(scanner.next());
            try{
                library.addNewBook(new Book(name,author,uniqueID,category,availability));
                System.out.println("Book added successfully");
            }catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println("Book cannot be added");
            }
        }else if(choice == 2){
            System.out.println("Enter the name of the member");
            String name = scanner.nextLine();
            System.out.println("Enter the uniqueMemberId of the member");
            String uniqueId = scanner.nextLine();
            System.out.println("Enter the contact of the member");
            String contact = scanner.nextLine();
            try{
                library.addNewMember(new Member(name,uniqueId,contact,0));
                System.out.println("Member added successfully");
            }catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println("Member cannot be added");
            }
        }else if(choice == 3){
            System.out.println("Enter the uniqueId of the Book");
            String uniqueId = scanner.nextLine();
            System.out.println("Enter the name/title you want to change of the Book");
            String name = scanner.nextLine();
            System.out.println("Enter the author you want to change  of the Book");
            String author = scanner.nextLine();
            System.out.println("Enter the category you want to change of the Book");
            String category = scanner.nextLine();
            System.out.println("Enter the Availability(true/false) you want to change of the Book");
            boolean availability = Boolean.parseBoolean(scanner.next());
            try{
                library.updateBook(uniqueId,name,author,category,availability);
                System.out.println("Book updated successfully");
            }catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println("Error updating book");
            }
        }else if(choice == 4){
            System.out.println("Enter the books uniqueId");
            String uniqueId = scanner.nextLine();
            System.out.println("Enter the uniqueMemberId of the member");
            String uniqueMember = scanner.nextLine();
            try{
                library.borrowBook(uniqueId,uniqueMember);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }else if(choice == 5){
            System.out.println("Enter the books uniqueId");
            String uniqueId = scanner.nextLine();
            System.out.println("Enter the uniqueMemberId of the member");
            String uniqueMember = scanner.nextLine();
            try{
                library.returnBook(uniqueId,uniqueMember);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }else if(choice == 6){
            System.out.println("To search book, enter the title or unique ID or author name of the book");
            String title = scanner.nextLine();
            try{
                library.searchBook(title);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }else if(choice == 7){
            library.transactionHistory();
        } else if(choice == 8){
            System.out.println("Total number of books in the Library are: "+ library.getTotalNumberOfBooks());
            System.out.println("Total number of member in this Library are: "+ library.getTotalNumberOfMember());
        }else{
            System.out.println("Exiting...");
            break;
        }


    }


    }
}