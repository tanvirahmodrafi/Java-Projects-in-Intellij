package bd.edu.seu.productmanagement.controller;

import bd.edu.seu.productmanagement.model.Product;
import bd.edu.seu.productmanagement.service.ProductService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ProductController {
    @FXML
    private TextField productName;
    @FXML
    private TextField productPrice;
    @FXML
    private TextField productId;
    @FXML
    public void saveAction(ActionEvent event) {
        int productId = Integer.parseInt(this.productId.getText());
        String productName = this.productName.getText();
        double productPrice = Double.parseDouble(this.productPrice.getText());
        Product product = new Product(productId, productName, productPrice);
        ProductService productService = new ProductService();

    }
    @FXML
    private TableView<Product> productTable;
    @FXML
    private TableColumn<Product, String> name;
    @FXML
    private TableColumn<Product,Number> id;
    @FXML
    private TableColumn<Product,Number> price;




}
