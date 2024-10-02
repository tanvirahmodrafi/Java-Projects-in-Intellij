package bd.edu.seu.productmanagement.service;

import bd.edu.seu.productmanagement.model.Product;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public static void save(Product product){
        try{
            String line = product.toString();
            RandomAccessFile raf = new RandomAccessFile("products.txt", "rw");
            raf.seek(raf.length());
            raf.writeBytes(line);
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            System.out.println("IO exception");
        }
    }
    public List<Product> list() {
        List<Product> products = new ArrayList<>();
        try {
            RandomAccessFile raf = new RandomAccessFile("products.txt", "r");
            String line;
            while ((line = raf.readLine()) != null) {  // Corrected the while condition
                String[] split = line.split(",");
                int productId = Integer.parseInt(split[0]);
                String productName = split[1];
                double price = Double.parseDouble(split[2]);
                Product product = new Product(productId, productName, price);
                products.add(product);
            }
            raf.close();  // Added this to close the file after reading
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO exception");
        }
        return products;
    }

}
