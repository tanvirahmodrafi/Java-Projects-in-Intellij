import java.util.List;

public interface OrderHandler {
    public void placeOrder(String a, List<String> restaurantNames);
    public void deliverOrder(String a,String restaurantName,String name);
}
