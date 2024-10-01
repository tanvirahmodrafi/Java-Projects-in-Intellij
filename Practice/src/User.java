import java.util.Map;

public abstract class User{
    String name;
    String password;
    String email;
    String phone;

    public User(String name, String password, String email, String phone) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public boolean login(String username, String password, Map<String, String> user){
        if(user.containsKey(username) && password.equals(user.get(username))){
            return true;
        }else{
            System.out.println("User not found");
            return false;
        }
    }

   public boolean logout(){
        return false;
    }
    abstract void viewProfile(String password);

}
