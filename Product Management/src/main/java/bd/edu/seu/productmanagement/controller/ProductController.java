package bd.edu.seu.productmanagement.controller;

import bd.edu.seu.productmanagement.model.Product;
import bd.edu.seu.productmanagement.service.ProductService;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javax.print.DocFlavor;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ProductController implements ProductControllers {
    @FXML
    private TextField productName;
    @FXML
    private TextField productPrice;
    @FXML
    private TextField productId;
    @FXML
    private TableView<Product> tableProductView;
    @FXML
    private TableColumn<Product, String> nameColumn;
    @FXML
    private TableColumn<Product, Number> priceColumn;
    @FXML
    private TableColumn<Product, Number> idColumn;

    @FXML
    public void saveAction() {
        ProductService productService = null;
        try {
            int productId = Integer.parseInt(this.productId.getText());
            String productName = this.productName.getText();
            double productPrice = Double.parseDouble(this.productPrice.getText());
            Product product = new Product(productId, productName, productPrice);
            productService = new ProductService();
            productService.save(product);


            System.out.println("Product saved");

        } catch (NumberFormatException e) {
            System.out.println("Invalid product id");
        }
        List<Product> productList = productService.list();
        ObservableList<Product> productObservableList = FXCollections.observableArrayList();
        productObservableList.addAll(productList);
        tableProductView.setItems(productObservableList);

    }



}
