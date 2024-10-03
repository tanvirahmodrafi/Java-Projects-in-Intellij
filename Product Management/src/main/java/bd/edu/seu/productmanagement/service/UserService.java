package bd.edu.seu.productmanagement.service;

import bd.edu.seu.productmanagement.model.Product;
import bd.edu.seu.productmanagement.model.User;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    public static void save(User user) {
        try {
            String line = user.toString();
            RandomAccessFile raf = new RandomAccessFile("user.txt", "rw");
            raf.seek(raf.length());
            raf.writeBytes(line);
            raf.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO exception");
        }
    }

    public List<User> listUsers() {
        List<User> users = new ArrayList<>();
        try {
            RandomAccessFile raf = new RandomAccessFile("user.txt", "r");
            String line;
            while ((line = raf.readLine()) != null) {
                String[] split = line.split(",");
                int userId = Integer.parseInt(split[0]);
                String username = split[1];
                String password = split[2];
                User user = new User(userId, username, password);
                users.add(user);
            }
            raf.close();  // Close the file after reading
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO exception");
        }
        return users;
    }
}
