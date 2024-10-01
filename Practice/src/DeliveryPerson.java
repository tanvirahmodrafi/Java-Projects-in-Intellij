import java.util.List;

public class DeliveryPerson extends User implements OrderHandler{
    DeliveryPerson(String name, String password, String email, String phone) {
        super(name, password, email, phone);
    }

    @Override
    public void placeOrder(String a, List<String> restaurantNames) {
        System.out.println("You can't place this order");
    }

    @Override
    public void deliverOrder(String order,String restaurantName,String name) {
        System.out.println("You have a order to deliver to" + name+"\nFrom "+restaurantName+"\nFood is "+order);
    }

    @Override
    public void viewProfile(String password) {
        System.out.println("Delivery Profile");
        System.out.println("Name: "+ name);
        System.out.println("Email: "+ email);
        System.out.println("Phone: "+ phone);
    }
}
