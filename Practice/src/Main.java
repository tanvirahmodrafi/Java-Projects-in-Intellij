import java.io.RandomAccessFile;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> RestaurantList = new ArrayList<>();
        Map<String, String> loginInfo = new HashMap<>();
        List<Customer> lst= new ArrayList<>();
        while(true){
            System.out.println("Press 1 to be a customer");
            System.out.println("Press 2 to be a delivery person");
            String inp = scanner.nextLine();
            if(inp.equals("1")){
                System.out.println("Please enter your customer name");
                String name = scanner.nextLine();
                System.out.println("Please enter your password");
                String password = scanner.nextLine();
                if(login(name,password,loginInfo)){
                    System.out.println("Enter your email");
                    String email = scanner.nextLine();
                    System.out.println("Enter your phone number");
                    String phone = scanner.nextLine();

                    Customer temp=new Customer(name,password,email,phone);
                    lst.add(temp);
                }else{
                    System.out.println("Invalid email");
                }

            }else{
                System.out.println("Please enter your customer name");
                String name = scanner.nextLine();
                System.out.println("Please enter your password");
                String password = scanner.nextLine();

                if(login(name,password,loginInfo)){
                    System.out.println("Enter your email");
                    String email = scanner.nextLine();
                    System.out.println("Enter your phone number");
                    String phone = scanner.nextLine();

                    DeliveryPerson temp=new DeliveryPerson(name,password,email,phone);
                    lst.add(temp);
                }else{
                    System.out.println("Invalid email");
                }
            }


        }
    }
    public static boolean login(String username, String password, Map<String, String> user){
        if(user.containsKey(username) && password.equals(user.get(username))){
            return true;
        }else{
            System.out.println("User not found");
            return false;
        }
    }
}