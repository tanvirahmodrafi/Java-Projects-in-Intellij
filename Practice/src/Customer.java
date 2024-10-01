import java.util.List;
import java.util.Scanner;

public class Customer extends User implements OrderHandler{
    Scanner scanner = new Scanner(System.in);

    Customer(String name, String password, String email, String phone) {
        super(name, password, email, phone);
    }


    @Override
    public void placeOrder(String restaurantName,List<String>restaurants) {
        if(restaurants.contains(restaurantName)){
            System.out.println("Food Ordered From restaurant "+restaurantName);
        }else{
            System.out.println("Wrong restaurant name entered \n or not found");
        }
    }

    public void browseRestaurants(List<String>restaurants){
        for(int i = 0; i<restaurants.size(); i++){
            System.out.println(restaurants.get(i));
        }
    }
    public void deliveryStatus(){
        System.out.println("Ar 1 min lagbe!!!!");
    }

    @Override
    public void deliverOrder(String a,String restaurantName,String name) {
        System.out.println("You are a customer!");

    }

    @Override
    public void viewProfile(String password) {
        System.out.println("Customer Profile");
        System.out.println("Name: "+ name);
        System.out.println("Email: "+ email);
        System.out.println("Phone: "+ phone);
    }
}
