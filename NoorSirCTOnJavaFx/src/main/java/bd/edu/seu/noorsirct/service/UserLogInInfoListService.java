package bd.edu.seu.noorsirct.service;

import bd.edu.seu.noorsirct.information.UserLoginInfoList;

import java.io.IOException;
import java.io.RandomAccessFile;

public class UserLogInInfoListService {

    public void save(UserLoginInfoList userLoginInfoList) {
        try{
            RandomAccessFile raf = new RandomAccessFile("loginInfo.txt", "rw");
            String line = userLoginInfoList.toString();  // Assuming this includes the newline
            raf.seek(raf.length());
            raf.writeBytes(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean check(UserLoginInfoList userLoginInfoList) {
        try  {
            RandomAccessFile raf = new RandomAccessFile("loginInfo.txt", "r");
            String line;
            while ((line = raf.readLine()) != null) {
                String[] info = line.split(",");  // Split based on comma
                if (info.length >= 2) {  // Ensure the line has at least 2 parts
                    String name = info[0];
                    String pass = info[1];
                    if(name.equals(userLoginInfoList.username) && pass.equals(userLoginInfoList.password)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("IOException in check method in UserLogInInfoListService");
        }
        return false;
    }

}
