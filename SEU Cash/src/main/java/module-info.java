module bd.edu.seu.seu_cash {
    requires javafx.controls;
    requires javafx.fxml;


    opens bd.edu.seu.seu_cash to javafx.fxml;
    exports bd.edu.seu.seu_cash;
}