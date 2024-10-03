package bd.edu.seu.noorsirct.information;

import java.util.List;

public class UserLoginInfoList {
    public String username;
    public String password;
    public UserLoginInfoList(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return username + "," + password+"\n";
    }
}
